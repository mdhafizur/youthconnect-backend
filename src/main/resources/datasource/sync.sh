#!/bin/bash

# Path to the application.properties file
PROPERTIES_FILE="../application.properties"

# Function to read a property value from the properties file
get_property() {
    local PROPERTY_KEY=$1
    grep "^${PROPERTY_KEY}=" "$PROPERTIES_FILE" | cut -d'=' -f2-
}

# Read MongoDB connection details from the properties file
MONGO_CONNECTION_STRING=$(get_property "spring.data.mongodb.uri")
DATABASE_NAME=$(get_property "spring.data.mongodb.database")

# GeoJSON files
SCHULEN_GEOJSON="Schulen.geojson"
KINDERGARTEN_GEOJSON="Kindertageseinrichtungen.geojson"
JUGENDBERUFSHILFEN_GEOJSON="Jugendberufshilfen.geojson"
SCHULSOZIALARBEIT_GEOJSON="Schulsozialarbeit.geojson"

# Collection names
SCHULEN_COLLECTION="schools"
KINDERGARTEN_COLLECTION="kindergartens"
SCHULSOZIALARBEIT_COLLECTION="social_child_projects"
JUGENDBERUFSHILFEN_COLLECTION="social_teenager_projects"

# Check if MongoDB connection string is provided
if [ -z "$MONGO_CONNECTION_STRING" ]; then
    echo "Error: MongoDB connection string not provided."
    exit 1
fi

# Function to sync GeoJSON file to MongoDB Atlas
sync_geojson_to_mongodb() {
    local GEOJSON_FILE="$1"
    local COLLECTION_NAME="$2"
    echo "Syncing $GEOJSON_FILE to MongoDB Atlas..."

    # Preprocess JSON data to include _id field with the value of properties.OBJECTID
    jq '.features[] | {_id: .properties.OBJECTID} + . ' "$GEOJSON_FILE" | mongoimport --uri "$MONGO_CONNECTION_STRING" --db "$DATABASE_NAME" --collection "$COLLECTION_NAME" --drop

    if [ $? -eq 0 ]; then
        echo "Data synced to MongoDB Atlas for collection: $COLLECTION_NAME"
    else
        echo "Error: Failed to sync data to MongoDB Atlas for collection: $COLLECTION_NAME"
    fi
}

# Sync GeoJSON files to MongoDB Atlas
sync_geojson_to_mongodb "$SCHULEN_GEOJSON" "$SCHULEN_COLLECTION"
sync_geojson_to_mongodb "$KINDERGARTEN_GEOJSON" "$KINDERGARTEN_COLLECTION"
sync_geojson_to_mongodb "$JUGENDBERUFSHILFEN_GEOJSON" "$JUGENDBERUFSHILFEN_COLLECTION"
sync_geojson_to_mongodb "$SCHULSOZIALARBEIT_GEOJSON" "$SCHULSOZIALARBEIT_COLLECTION"
