---
title: Youth Connect
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
code_clipboard: true
highlight_theme: darkula
headingLevel: 2
generator: "@tarslib/widdershins v4.0.23"

---

# Youth Connect

Base URLs:

* <a href="http://localhost:8080">youthconnect: http://localhost:8080</a>

# Authentication

# YouthConnect

## GET Find social teenager projects

GET /api/social-teenager-projects

> Response Examples

> OK

```json
[
  {
    "_id": 3,
    "type": "Feature",
    "properties": {
      "objectId": 3,
      "id": 3,
      "traeger": "Jugendberufshilfe Chemnitz gGmbH",
      "strasse": "Straße Usti nad Labem 43",
      "plz": "09119",
      "ort": "Chemnitz",
      "leistungen": "arbeitsweltbezogene Jugendsozialarbeit",
      "bezeichnung": null,
      "kurzbezeichnung": null,
      "telefon": "3714004990",
      "email": null,
      "fax": "0371 4004966",
      "typ": null,
      "art": null,
      "standortTyp": null,
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": null,
      "bezugNr": null,
      "gebietsArtNummer": null,
      "nummer": null,
      "globalId": null,
      "creationDate": null,
      "creator": null,
      "editDate": null,
      "editor": null,
      "barrierefrei": null,
      "integrativ": null,
      "snummer": null
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8904748101941,
        50.809930951272
      ]
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|integer|true|none||none|
|» type|string|true|none||none|
|» properties|object|true|none||none|
|»» objectId|integer|true|none||none|
|»» id|integer|true|none||none|
|»» traeger|string|true|none||none|
|»» strasse|string|true|none||none|
|»» plz|string|true|none||none|
|»» ort|string|true|none||none|
|»» leistungen|string|true|none||none|
|»» bezeichnung|null|true|none||none|
|»» kurzbezeichnung|null|true|none||none|
|»» telefon|string|true|none||none|
|»» email|null|true|none||none|
|»» fax|string¦null|true|none||none|
|»» typ|null|true|none||none|
|»» art|null|true|none||none|
|»» standortTyp|null|true|none||none|
|»» bezeichnungZusatz|null|true|none||none|
|»» profile|null|true|none||none|
|»» sprachen|null|true|none||none|
|»» www|null|true|none||none|
|»» traegerTyp|null|true|none||none|
|»» bezugNr|null|true|none||none|
|»» gebietsArtNummer|null|true|none||none|
|»» nummer|null|true|none||none|
|»» globalId|null|true|none||none|
|»» creationDate|null|true|none||none|
|»» creator|null|true|none||none|
|»» editDate|null|true|none||none|
|»» editor|null|true|none||none|
|»» barrierefrei|null|true|none||none|
|»» integrativ|null|true|none||none|
|»» snummer|null|true|none||none|
|» geometry|object|true|none||none|
|»» type|string|true|none||none|
|»» coordinates|[number]|true|none||none|

## GET Find social child projects

GET /api/social-child-projects

> Response Examples

> OK

```json
[
  {
    "_id": 5,
    "type": "Feature",
    "properties": {
      "objectId": 5,
      "id": 5,
      "traeger": "solaris Förderzentrum für Jugend & Umwelt gGmbH Sachsen",
      "strasse": "Guerickestraße 38",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": "Schulsozialarbeit",
      "bezeichnung": null,
      "kurzbezeichnung": null,
      "telefon": "0371 815760\n0176 1381 0815",
      "email": null,
      "fax": null,
      "typ": null,
      "art": null,
      "standortTyp": null,
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": null,
      "bezugNr": null,
      "gebietsArtNummer": null,
      "nummer": null,
      "globalId": null,
      "creationDate": null,
      "creator": null,
      "editDate": null,
      "editor": null,
      "barrierefrei": null,
      "integrativ": null,
      "snummer": null
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8733752933211,
        50.8229833201809
      ]
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|integer|true|none||none|
|» type|string|true|none||none|
|» properties|object|true|none||none|
|»» objectId|integer|true|none||none|
|»» id|integer|true|none||none|
|»» traeger|string|true|none||none|
|»» strasse|string|true|none||none|
|»» plz|string|true|none||none|
|»» ort|string|true|none||none|
|»» leistungen|string|true|none||none|
|»» bezeichnung|null|true|none||none|
|»» kurzbezeichnung|null|true|none||none|
|»» telefon|string¦null|true|none||none|
|»» email|null|true|none||none|
|»» fax|string¦null|true|none||none|
|»» typ|null|true|none||none|
|»» art|null|true|none||none|
|»» standortTyp|null|true|none||none|
|»» bezeichnungZusatz|null|true|none||none|
|»» profile|null|true|none||none|
|»» sprachen|null|true|none||none|
|»» www|null|true|none||none|
|»» traegerTyp|null|true|none||none|
|»» bezugNr|null|true|none||none|
|»» gebietsArtNummer|null|true|none||none|
|»» nummer|null|true|none||none|
|»» globalId|null|true|none||none|
|»» creationDate|null|true|none||none|
|»» creator|null|true|none||none|
|»» editDate|null|true|none||none|
|»» editor|null|true|none||none|
|»» barrierefrei|null|true|none||none|
|»» integrativ|null|true|none||none|
|»» snummer|null|true|none||none|
|» geometry|object|true|none||none|
|»» type|string|true|none||none|
|»» coordinates|[number]|true|none||none|

## GET Find kindergartens

GET /api/kindergartens

> Response Examples

> OK

```json
[
  {
    "_id": 8,
    "type": "Feature",
    "properties": {
      "objectId": 8,
      "id": 22,
      "traeger": "Privater Träger",
      "strasse": "Nevoigtstraße",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Nevoigtstraße 5 \"Fichtenwichtel\", Kindertagespflege",
      "kurzbezeichnung": "Nevoigtstraße 5 \"Fichtenwichtel\", Kindertagespflege",
      "telefon": "0171 7971903",
      "email": "mikedinter@freenet.de",
      "fax": null,
      "typ": null,
      "art": null,
      "standortTyp": null,
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": null,
      "bezugNr": null,
      "gebietsArtNummer": null,
      "nummer": null,
      "globalId": null,
      "creationDate": null,
      "creator": null,
      "editDate": null,
      "editor": null,
      "barrierefrei": 0,
      "integrativ": 0,
      "snummer": null
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.839152078457,
        50.8163106179718
      ]
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|integer|true|none||none|
|» type|string|true|none||none|
|» properties|object|true|none||none|
|»» objectId|integer|true|none||none|
|»» id|integer|true|none||none|
|»» traeger|string|true|none||none|
|»» strasse|string|true|none||none|
|»» plz|string|true|none||none|
|»» ort|string|true|none||none|
|»» leistungen|null|true|none||none|
|»» bezeichnung|string|true|none||none|
|»» kurzbezeichnung|string|true|none||none|
|»» telefon|string|true|none||none|
|»» email|string|true|none||none|
|»» fax|null|true|none||none|
|»» typ|null|true|none||none|
|»» art|null|true|none||none|
|»» standortTyp|null|true|none||none|
|»» bezeichnungZusatz|null|true|none||none|
|»» profile|null|true|none||none|
|»» sprachen|null|true|none||none|
|»» www|null|true|none||none|
|»» traegerTyp|null|true|none||none|
|»» bezugNr|null|true|none||none|
|»» gebietsArtNummer|null|true|none||none|
|»» nummer|null|true|none||none|
|»» globalId|null|true|none||none|
|»» creationDate|null|true|none||none|
|»» creator|null|true|none||none|
|»» editDate|null|true|none||none|
|»» editor|null|true|none||none|
|»» barrierefrei|integer|true|none||none|
|»» integrativ|integer|true|none||none|
|»» snummer|null|true|none||none|
|» geometry|object|true|none||none|
|»» type|string|true|none||none|
|»» coordinates|[number]|true|none||none|

## GET Find schools

GET /api/schools

> Response Examples

> schools

```json
[
  {
    "_id": 6,
    "type": "Feature",
    "properties": {
      "objectId": 6,
      "id": 6,
      "traeger": "Kommunal",
      "strasse": "Straße Usti nad Labem 279",
      "plz": "09119",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Dr.-Salvador-Allende-Grundschule",
      "kurzbezeichnung": "Dr.-Salvador-Allende-GS",
      "telefon": "0371 271210",
      "email": "gs-allende@schulen-chemnitz.de",
      "fax": "0371 27121220",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort, Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten, Inklusion",
      "sprachen": null,
      "www": "www.allende-gs.de",
      "traegerTyp": 10,
      "bezugNr": "6",
      "gebietsArtNummer": 40,
      "nummer": 1102,
      "globalId": "4ba24609-dba2-47a9-9b63-a37ec81a8712",
      "creationDate": 1702635595.525,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.525,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 109
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8850807101631,
        50.805262135884
      ]
    }
  }
]
```

```json
[
  {
    "_id": 9,
    "type": "Feature",
    "properties": {
      "objectId": 9,
      "id": 10,
      "traeger": "Kommunal",
      "strasse": "Reinhardtstraße 6",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Gotthold-Ephraim-Lessing-Grundschule",
      "kurzbezeichnung": "Gotthold-Ephraim-Lessing-GS",
      "telefon": "0371 432660",
      "email": "gs-lessing@schulen-chemnitz.de",
      "fax": "0371 43266220",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Hort, Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten",
      "sprachen": null,
      "www": null,
      "traegerTyp": 10,
      "bezugNr": "10",
      "gebietsArtNummer": 40,
      "nummer": 501,
      "globalId": "8a9f16dc-e20c-4f04-9936-9a2664ef9eef",
      "creationDate": 1702635595.556,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.556,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 114
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9397707592911,
        50.841262725248
      ]
    }
  },
  {
    "_id": 13,
    "type": "Feature",
    "properties": {
      "objectId": 13,
      "id": 28,
      "traeger": "Kommunal",
      "strasse": "Guerickestraße 38",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Schönau",
      "kurzbezeichnung": "GS Schönau",
      "telefon": "0371 8157621",
      "email": "gs-schoenau@schulen-chemnitz.de",
      "fax": "0371 8157626",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.sachsen-macht-schule.de/schulporträt",
      "traegerTyp": 10,
      "bezugNr": "28",
      "gebietsArtNummer": 40,
      "nummer": 105,
      "globalId": "16000ff9-fba3-44e5-b6bc-25936fbad2b5",
      "creationDate": 1702635595.587,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.587,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 137
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8733752933211,
        50.8229833201809
      ]
    }
  },
  {
    "_id": 6,
    "type": "Feature",
    "properties": {
      "objectId": 6,
      "id": 6,
      "traeger": "Kommunal",
      "strasse": "Straße Usti nad Labem 279",
      "plz": "09119",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Dr.-Salvador-Allende-Grundschule",
      "kurzbezeichnung": "Dr.-Salvador-Allende-GS",
      "telefon": "0371 271210",
      "email": "gs-allende@schulen-chemnitz.de",
      "fax": "0371 27121220",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort, Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten, Inklusion",
      "sprachen": null,
      "www": "www.allende-gs.de",
      "traegerTyp": 10,
      "bezugNr": "6",
      "gebietsArtNummer": 40,
      "nummer": 1102,
      "globalId": "4ba24609-dba2-47a9-9b63-a37ec81a8712",
      "creationDate": 1702635595.525,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.525,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 109
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8850807101631,
        50.805262135884
      ]
    }
  },
  {
    "_id": 8,
    "type": "Feature",
    "properties": {
      "objectId": 8,
      "id": 9,
      "traeger": "Kommunal",
      "strasse": "Heinrich-Beck-Straße 2",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Gebrüder-Grimm-Grundschule",
      "kurzbezeichnung": "Gebrüder-Grimm-GS",
      "telefon": "0371 302956",
      "email": "gs-gebrueder-grimm@schulen-chemnitz.de",
      "fax": "0371 4004719",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreier Zugang  ",
      "profile": "Hort, Vorbereitungsklassen; Projekt für musisch-kreative Bildung",
      "sprachen": null,
      "www": "www.gggs.de",
      "traegerTyp": 10,
      "bezugNr": "9",
      "gebietsArtNummer": 40,
      "nummer": 204,
      "globalId": "f67aea54-78cc-4330-971b-b6762cf855bb",
      "creationDate": 1702635595.54,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.54,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 113
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9080500786032,
        50.8292552027294
      ]
    }
  },
  {
    "_id": 5,
    "type": "Feature",
    "properties": {
      "objectId": 5,
      "id": 5,
      "traeger": "Kommunal",
      "strasse": "Alfred-Neubert-Straße 25",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Charles-Darwin-Grundschule",
      "kurzbezeichnung": "Charles-Darwin-GS",
      "telefon": "0371 266020",
      "email": "gs-darwin@schulen-chemnitz.de",
      "fax": "0371 2660220",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.charles-darwin.c.sn.schule.de/",
      "traegerTyp": 10,
      "bezugNr": "5",
      "gebietsArtNummer": 40,
      "nummer": 901,
      "globalId": "e4f62fad-ea21-4a4c-bd8a-ace56bcedcd2",
      "creationDate": 1702635595.525,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.525,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 108
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9019557001839,
        50.7840835945015
      ]
    }
  },
  {
    "_id": 2,
    "type": "Feature",
    "properties": {
      "objectId": 2,
      "id": 2,
      "traeger": "Kommunal",
      "strasse": "Brauhausstraße 16",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Annenschule -Grundschule-",
      "kurzbezeichnung": "Annenschule -GS-",
      "telefon": "0371 36913120",
      "email": "gs-annenschule@schulen-chemnitz.de",
      "fax": "0371 36913129",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreier Zugang, Hort: baubedingte Auslagerung an den Standort Jakobstraße 20, 09130 Chemnitz, bis voraussichtlich Schuljahr 2024/2025",
      "profile": "GTA, Hort, jüdischer Religionsunterricht, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.annenschule.de",
      "traegerTyp": 10,
      "bezugNr": "2",
      "gebietsArtNummer": 40,
      "nummer": 601,
      "globalId": "4c92a00f-080b-4d40-beea-3b43723cb171",
      "creationDate": 1702635595.493,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.493,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 105
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9218298722116,
        50.8280539252831
      ]
    }
  },
  {
    "_id": 41,
    "type": "Feature",
    "properties": {
      "objectId": 41,
      "id": 52,
      "traeger": "Kommunal",
      "strasse": "Reichenhainer Straße 206",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Sportoberschule Chemnitz",
      "kurzbezeichnung": "Sportoberschule",
      "telefon": "0371 4884640",
      "email": "os-sport@schulen-chemnitz.de",
      "fax": "0371 488-4698",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Eliteschule des Sports; Eliteschule des Fußballs; leistungssportorientierte Zugangsbedingungen",
      "sprachen": "Englisch",
      "www": "www.sportmittelschule-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "9",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "2679d50f-9e8b-4b8c-993a-d31657f85e03",
      "creationDate": 1702635595.806,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.806,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 229
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.937251881947,
        50.8029705326177
      ]
    }
  },
  {
    "_id": 28,
    "type": "Feature",
    "properties": {
      "objectId": 28,
      "id": 495,
      "traeger": "Kommunal",
      "strasse": "Weststraße 19",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Weststraße",
      "kurzbezeichnung": "GS Weststraße",
      "telefon": "0371 2674690",
      "email": "gs-weststrasse@schulen-chemnitz.de",
      "fax": null,
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4213518",
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 40,
      "nummer": 1208,
      "globalId": "f02d32d2-3fee-4a09-ab71-f1b4291ee910",
      "creationDate": 1702635595.696,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.696,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1320
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9073782571346,
        50.8326240084176
      ]
    }
  },
  {
    "_id": 16,
    "type": "Feature",
    "properties": {
      "objectId": 16,
      "id": 32,
      "traeger": "Kommunal",
      "strasse": "Augsburger Straße 32",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Heinrich-Heine-Grundschule",
      "kurzbezeichnung": "H.-Heine-GS",
      "telefon": "0371 2786860",
      "email": "gs-heine@schulen-chemnitz.de",
      "fax": "0371 27868616",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.db.sn.schule.de",
      "traegerTyp": 10,
      "bezugNr": "32",
      "gebietsArtNummer": 40,
      "nummer": 605,
      "globalId": "04ad5733-f7f6-4b74-80ef-dd9ce898e698",
      "creationDate": 1702635595.603,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.603,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 142
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9399234062508,
        50.8158443616826
      ]
    }
  },
  {
    "_id": 4,
    "type": "Feature",
    "properties": {
      "objectId": 4,
      "id": 4,
      "traeger": "Kommunal",
      "strasse": "August-Bebel-Straße (Grüna) 7",
      "plz": "09224",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Baumgartenschule Grüna -Grundschule-",
      "kurzbezeichnung": "Baumgartenschule Grüna -GS-",
      "telefon": "0371 850089",
      "email": "gs-baumgarten-gruena@schulen-chemnitz.de",
      "fax": "0371 8101657",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4211272",
      "traegerTyp": 10,
      "bezugNr": "4",
      "gebietsArtNummer": 40,
      "nummer": 1204,
      "globalId": "1a4f5d6f-a1fb-4d34-b588-a97784c8e92c",
      "creationDate": 1702635595.509,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.509,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 107
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.7857570982484,
        50.8134154980481
      ]
    }
  },
  {
    "_id": 46,
    "type": "Feature",
    "properties": {
      "objectId": 46,
      "id": 59,
      "traeger": "Kommunal",
      "strasse": "Lennéstraße 1",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule Reichenbrand",
      "kurzbezeichnung": "OS Reichenbrand",
      "telefon": "0371 815750",
      "email": "os-reichenbrand@schulen-chemnitz.de",
      "fax": "0371 8157520",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA",
      "sprachen": "Englisch, Französisch",
      "www": "www.os-reichenbrand.c.sn.schule.de",
      "traegerTyp": 10,
      "bezugNr": "17",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "7c0e5b27-43cf-43d0-8d2a-6403382c0ff7",
      "creationDate": 1702635595.837,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.837,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 227
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8251258225996,
        50.8115128110385
      ]
    }
  },
  {
    "_id": 27,
    "type": "Feature",
    "properties": {
      "objectId": 27,
      "id": 485,
      "traeger": "Kommunal",
      "strasse": "Charlottenstraße 52",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Charlottenstraße  - ab Einschulungsjahr 2024/2025",
      "kurzbezeichnung": "GS Charlottenstraße - ab Einschulungsjahr 2023",
      "telefon": "0371 510078",
      "email": null,
      "fax": null,
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": 10,
      "bezugNr": "44",
      "gebietsArtNummer": 40,
      "nummer": 1206,
      "globalId": "be4cc0fe-629a-4e21-9d8f-463e2845d316",
      "creationDate": 1702635595.696,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.696,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 172
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.944805462507,
        50.8273232949198
      ]
    }
  },
  {
    "_id": 35,
    "type": "Feature",
    "properties": {
      "objectId": 35,
      "id": 259,
      "traeger": "Frei",
      "strasse": "Wolgograder Allee 184",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Freie Grundschule \"Leonardo\" Chemnitz",
      "kurzbezeichnung": "Freie GS \"Leonardo\" Chemnitz",
      "telefon": "0371 4959960",
      "email": "grundschule-leonardo@kjf-online.de",
      "fax": "0371 495996-10",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "Schule zur Förderung höher und hoch begabter Kinder",
      "profile": null,
      "sprachen": null,
      "www": "www.grundschule-leonardo.de",
      "traegerTyp": 30,
      "bezugNr": "27",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "7103d079-43ac-4800-9709-d92aedef368b",
      "creationDate": 1702635595.759,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.759,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 962
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8814412249506,
        50.7840286111597
      ]
    }
  },
  {
    "_id": 17,
    "type": "Feature",
    "properties": {
      "objectId": 17,
      "id": 33,
      "traeger": "Kommunal",
      "strasse": "Comeniusstraße 1",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Jan-Amos-Comenius-Grundschule",
      "kurzbezeichnung": "J.-A.-Comenius-GS",
      "telefon": "0371 5230716",
      "email": "gs-comenius@schulen-chemnitz.de",
      "fax": "0371 5230727",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4210746",
      "traegerTyp": 10,
      "bezugNr": "33",
      "gebietsArtNummer": 40,
      "nummer": 801,
      "globalId": "6a9097ef-4e84-4ea9-8d3a-da813436ec1a",
      "creationDate": 1702635595.618,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.618,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 143
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9141544540022,
        50.8107193517131
      ]
    }
  },
  {
    "_id": 25,
    "type": "Feature",
    "properties": {
      "objectId": 25,
      "id": 42,
      "traeger": "Kommunal",
      "strasse": "Wittgensdorfer Straße 2b",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schlossschule (Schulteil)",
      "kurzbezeichnung": "Schlossschule -GS-  ST Sport",
      "telefon": "0371 3302443",
      "email": "gs-schlossschule@schulen-chemnitz.de",
      "fax": "0371 3352239",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "2",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, mit Sportklassen für technisch-akrobatische Sportarten",
      "sprachen": null,
      "www": "www.sn.schule.de/~gs-schloss-c",
      "traegerTyp": 10,
      "bezugNr": "41b",
      "gebietsArtNummer": 40,
      "nummer": 0,
      "globalId": "fc12bf1e-8e69-49a1-b0bf-6264df591e45",
      "creationDate": 1702635595.681,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.681,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 154
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8995083081153,
        50.850858190395
      ]
    }
  },
  {
    "_id": 29,
    "type": "Feature",
    "properties": {
      "objectId": 29,
      "id": 496,
      "traeger": "Kommunal",
      "strasse": "Jakobstraße 20",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule \"Südlicher Sonnenberg\" ",
      "kurzbezeichnung": "GS \"Südlicher Sonnenberg\"",
      "telefon": "0371 2675850",
      "email": "jakobstr@schulen-chemnitz.de",
      "fax": null,
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/gscsueso/unsere-schule.html",
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 40,
      "nummer": 1209,
      "globalId": "8f527828-a68f-42df-8243-d81ae54a33fe",
      "creationDate": 1702635595.712,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.712,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1330
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9366499279407,
        50.8322979561895
      ]
    }
  },
  {
    "_id": 43,
    "type": "Feature",
    "properties": {
      "objectId": 43,
      "id": 55,
      "traeger": "Kommunal",
      "strasse": "Straße Usti nad Labem 277",
      "plz": "09119",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule \"Am Flughafen\"",
      "kurzbezeichnung": "OS \"Am Flughafen\"",
      "telefon": "0371 271200",
      "email": "os-amflughafen@schulen-chemnitz.de",
      "fax": "0371 27120216",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Kompetenzzentrum für sprachliche Bildung; Vorbereitungsklassen",
      "sprachen": "Englisch, Russisch",
      "www": "www.ms-am-flughafen.homepage.t-online.de",
      "traegerTyp": 10,
      "bezugNr": "12",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "d9ea881c-e92c-43b0-b565-65f76ce0c816",
      "creationDate": 1702635595.821,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.821,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 219
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8856222242871,
        50.8057303827128
      ]
    }
  },
  {
    "_id": 39,
    "type": "Feature",
    "properties": {
      "objectId": 39,
      "id": 50,
      "traeger": "Kommunal",
      "strasse": "Kreherstraße 101",
      "plz": "09127",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Friedrich-Adolf-Wilhelm-Diesterweg-Oberschule",
      "kurzbezeichnung": "F.-A.-W.-Diesterweg-OS",
      "telefon": "0371 54302480",
      "email": "os-diesterweg@schulen-chemnitz.de",
      "fax": "0371 543024825",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Vorbereitungsklassen",
      "sprachen": "Englisch, Französisch, Russisch, Spanisch",
      "www": "diesterweg.sn.lo-net2.de/info/.ws_gen/",
      "traegerTyp": 10,
      "bezugNr": "7",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "44ebf1cb-d436-45b7-a293-feb9e467bfc0",
      "creationDate": 1702635595.79,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.79,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 209
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9544779086957,
        50.8196174538935
      ]
    }
  },
  {
    "_id": 50,
    "type": "Feature",
    "properties": {
      "objectId": 50,
      "id": 15,
      "traeger": "Kommunal",
      "strasse": "Lichtenauer Straße 45",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Ebersdorf",
      "kurzbezeichnung": "GS Ebersdorf",
      "telefon": "0371 410824",
      "email": "gs-ebersdorf@schulen-chemnitz.de",
      "fax": "0371 410029",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.unserebersdorf.de/index.php/grundschule-ebersdorf",
      "traegerTyp": 10,
      "bezugNr": "15",
      "gebietsArtNummer": 40,
      "nummer": 401,
      "globalId": "60b8f56c-fb42-4890-970f-ea0dcc927677",
      "creationDate": 1702635595.868,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.868,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 119
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9706434670302,
        50.8764546054577
      ]
    }
  },
  {
    "_id": 10,
    "type": "Feature",
    "properties": {
      "objectId": 10,
      "id": 11,
      "traeger": "Kommunal",
      "strasse": "Friedrich-Hähnel-Straße 86",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule \"Am Stadtpark\"",
      "kurzbezeichnung": "GS \"Am Stadtpark\"",
      "telefon": "0371 229027",
      "email": "gs-amstadtpark@schulen-chemnitz.de",
      "fax": "0371 2361736",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Hort",
      "sprachen": null,
      "www": "http://gs-amstadtpark.de/",
      "traegerTyp": 10,
      "bezugNr": "11",
      "gebietsArtNummer": 40,
      "nummer": 1101,
      "globalId": "fc28e969-19c6-491a-945e-e8670b5f3be5",
      "creationDate": 1702635595.556,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.556,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 115
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.895297700598,
        50.8044957626574
      ]
    }
  },
  {
    "_id": 15,
    "type": "Feature",
    "properties": {
      "objectId": 15,
      "id": 30,
      "traeger": "Kommunal",
      "strasse": "Ludwig-Kirsch-Straße 27",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Sonnenberg",
      "kurzbezeichnung": "GS Sonnenberg",
      "telefon": "0371 36777220",
      "email": "gs-sonnenberg@schulen-chemnitz.de",
      "fax": "0371 367772218",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Hort",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/gscsonnenberg/start.html",
      "traegerTyp": 10,
      "bezugNr": "30",
      "gebietsArtNummer": 40,
      "nummer": 503,
      "globalId": "0e6df524-c87d-4844-9c7f-11feabdc3d6b",
      "creationDate": 1702635595.603,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.603,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 139
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9412264741818,
        50.8364972682956
      ]
    }
  },
  {
    "_id": 48,
    "type": "Feature",
    "properties": {
      "objectId": 48,
      "id": 64,
      "traeger": "Kommunal",
      "strasse": "Fritz-Matschke-Straße 21",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Untere Luisenschule -Oberschule-",
      "kurzbezeichnung": "Untere Luisenschule -OS-",
      "telefon": "0371 374190",
      "email": "os-untere-luisenschule@schulen-chemnitz.de",
      "fax": "0371 3741920",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Vorbereitungsklassen",
      "sprachen": "Englisch, Französisch",
      "www": "www.uls.c.sn.schule.de/",
      "traegerTyp": 10,
      "bezugNr": "22",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "64e66642-25bd-400a-8c65-c79736d3619b",
      "creationDate": 1702635595.853,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.853,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 235
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9026935754136,
        50.8413040029236
      ]
    }
  },
  {
    "_id": 57,
    "type": "Feature",
    "properties": {
      "objectId": 57,
      "id": 22,
      "traeger": "Kommunal",
      "strasse": "Ferdinandstraße 97",
      "plz": "09128",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Kleinolbersdorf",
      "kurzbezeichnung": "GS Kleinolbersdorf",
      "telefon": "0371 772322",
      "email": "gs-kleinolbersdorf@schulen-chemnitz.de",
      "fax": "0371 7741893",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.klein-aberoho.de",
      "traegerTyp": 10,
      "bezugNr": "22",
      "gebietsArtNummer": 40,
      "nummer": 704,
      "globalId": "923fcefe-c60e-41ce-b8b4-c38e65bd5f64",
      "creationDate": 1702635595.931,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.931,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 129
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        13.0191493902801,
        50.8009364390504
      ]
    }
  },
  {
    "_id": 11,
    "type": "Feature",
    "properties": {
      "objectId": 11,
      "id": 12,
      "traeger": "Kommunal",
      "strasse": "Adelsbergstraße 296",
      "plz": "09127",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Adelsberg",
      "kurzbezeichnung": "GS Adelsberg",
      "telefon": "0371 7711180",
      "email": "gs-adelsberg@schulen-chemnitz.de",
      "fax": "0371 7711181",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "baubedingte Auslagerung an den Standort Comeniusstraße 1, 09120 Chemnitz, bis voraussichtlich 2023/2024",
      "profile": "Hort",
      "sprachen": null,
      "www": "https://www.gs-adelsberg.de/",
      "traegerTyp": 10,
      "bezugNr": "12",
      "gebietsArtNummer": 40,
      "nummer": 701,
      "globalId": "10db12cb-8564-4e9d-84af-e3cd12c8d261",
      "creationDate": 1702635595.571,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.571,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 116
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9881505037857,
        50.8130383762963
      ]
    }
  },
  {
    "_id": 30,
    "type": "Feature",
    "properties": {
      "objectId": 30,
      "id": 497,
      "traeger": "Kommunal",
      "strasse": "Heinrich-Schütz-Straße 61",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Kooperationsschule Chemnitz (Grund- und Oberschule)",
      "kurzbezeichnung": "Kooperationsschule Chemnitz (GS+OS)",
      "telefon": "0371 27868870",
      "email": "kooperationsschule-chemnitz@schulen-chemnitz.de",
      "fax": "0371 278688719",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "baubedingte Auslagerung an den Standort Wittgensdorfer Str. 121, 09114 Chemnitz  bis voraussichtlich Schuljahr 2024/2025; anschließend Brauhausstraße 16, 09111 Chemnitz",
      "profile": "Hort",
      "sprachen": null,
      "www": "https://kooperationsschule-chemnitz.org",
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 40,
      "nummer": 1207,
      "globalId": "d1803546-bb8c-4352-88a9-29e06782a36a",
      "creationDate": 1702635595.712,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.712,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1340
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.954409907451,
        50.8394367197235
      ]
    }
  },
  {
    "_id": 44,
    "type": "Feature",
    "properties": {
      "objectId": 44,
      "id": 56,
      "traeger": "Kommunal",
      "strasse": "Ernst-Heilmann-Straße 11",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule Altendorf",
      "kurzbezeichnung": "OS Altendorf",
      "telefon": "0371 369140",
      "email": "os-altendorf@schulen-chemnitz.de",
      "fax": "0371 3691421",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Vorbereitungsklassen",
      "sprachen": "Englisch, Französisch, Japanisch als GTA",
      "www": "www.fv-ms-altendorf.de",
      "traegerTyp": 10,
      "bezugNr": "13",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "c5fb6fd9-0ba3-40ca-b22b-d7be042acb9b",
      "creationDate": 1702635595.821,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.821,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 221
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8840422701945,
        50.8325546104525
      ]
    }
  },
  {
    "_id": 53,
    "type": "Feature",
    "properties": {
      "objectId": 53,
      "id": 18,
      "traeger": "Kommunal",
      "strasse": "Carl-von-Ossietzky-Straße 171",
      "plz": "09127",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Gablenz",
      "kurzbezeichnung": "GS Gablenz",
      "telefon": "0371 750080",
      "email": "gs-gablenz@schulen-chemnitz.de",
      "fax": "0371 7500819",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten, Klassen für Schüler mit LRS",
      "sprachen": null,
      "www": "http://cms.sn.schule.de/gsgablenz/start/impressum/",
      "traegerTyp": 10,
      "bezugNr": "18",
      "gebietsArtNummer": 40,
      "nummer": 603,
      "globalId": "2c79e612-03c6-499b-8796-95548258bea7",
      "creationDate": 1702635595.9,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.9,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 124
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9645345562452,
        50.8226694873889
      ]
    }
  },
  {
    "_id": 59,
    "type": "Feature",
    "properties": {
      "objectId": 59,
      "id": 24,
      "traeger": "Kommunal",
      "strasse": "Lennéstraße 1",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Reichenbrand",
      "kurzbezeichnung": "GS Reichenbrand",
      "telefon": "0371 8157521",
      "email": "gs-reichenbrand@schulen-chemnitz.de",
      "fax": "0371 8157520",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.gs-reichenbrand.de",
      "traegerTyp": 10,
      "bezugNr": "24",
      "gebietsArtNummer": 40,
      "nummer": 103,
      "globalId": "c32ff25c-46b1-4118-a8f3-86a78270bb41",
      "creationDate": 1702635595.946,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.946,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 133
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8251258225996,
        50.8115128110385
      ]
    }
  },
  {
    "_id": 66,
    "type": "Feature",
    "properties": {
      "objectId": 66,
      "id": 73,
      "traeger": "Kommunal",
      "strasse": "Bernsdorfer Straße 126",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Johann-Wolfgang-von-Goethe-Gymnasium",
      "kurzbezeichnung": "Johann-Wolfgang-von-Goethe-Gymnasium",
      "telefon": "0371 520700",
      "email": "gym-goethe@schulen-chemnitz.de",
      "fax": "0371 52070221",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Profil: naturwissenschaftlich, gesellschaftswissenschaftlich, sprachlich, Vorbereitungsklassen",
      "sprachen": "1. Englisch, 2. Französisch, Spanisch, 3. Latein",
      "www": "www.goethegym-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "7",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "ecae936e-cec6-4a38-8f14-4c5a748ef3eb",
      "creationDate": 1702635595.993,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.993,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 310
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9421690561178,
        50.8159174147348
      ]
    }
  },
  {
    "_id": 56,
    "type": "Feature",
    "properties": {
      "objectId": 56,
      "id": 21,
      "traeger": "Kommunal",
      "strasse": "Klaffenbacher Hauptstraße 85",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Klaffenbach",
      "kurzbezeichnung": "GS Klaffenbach",
      "telefon": "0371 2607084",
      "email": "gs-klaffenbach@schulen-chemnitz.de",
      "fax": "0371 2677520",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Hort",
      "sprachen": null,
      "www": "www.grundschule-klaffenbach.de",
      "traegerTyp": 10,
      "bezugNr": "21",
      "gebietsArtNummer": 40,
      "nummer": 804,
      "globalId": "c015e9ef-746d-4c7b-9a0b-56ba37d22064",
      "creationDate": 1702635595.915,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.915,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 128
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9132338131318,
        50.7618107379106
      ]
    }
  },
  {
    "_id": 62,
    "type": "Feature",
    "properties": {
      "objectId": 62,
      "id": 27,
      "traeger": "Kommunal",
      "strasse": "Beethovenweg 44",
      "plz": "09247",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Röhrsdorf",
      "kurzbezeichnung": "GS Röhrsdorf",
      "telefon": "03722 504860",
      "email": "gs-roehrsdorf@schulen-chemnitz.de",
      "fax": "03722 504861",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.grundschule-roehrsdorf.de",
      "traegerTyp": 10,
      "bezugNr": "27",
      "gebietsArtNummer": 40,
      "nummer": 1201,
      "globalId": "099d2802-8a14-4858-938a-ff3a49d9a18a",
      "creationDate": 1702635595.962,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.962,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 135
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8356099009993,
        50.8625592807073
      ]
    }
  },
  {
    "_id": 37,
    "type": "Feature",
    "properties": {
      "objectId": 37,
      "id": 491,
      "traeger": "Frei",
      "strasse": "Saydaer Straße 21",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "gruuna Schule gGmbH (Grundschule)",
      "kurzbezeichnung": "gruuna Schule gGmbH (Grundschule)",
      "telefon": "0371 33715680",
      "email": "info@gruuna.schule",
      "fax": "-",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.gruuna.schule",
      "traegerTyp": 30,
      "bezugNr": "31",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "3a0fbb25-12a1-4438-9f19-b216ad2d11bc",
      "creationDate": 1702635595.775,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.775,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 971
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9352089883882,
        50.7978521601097
      ]
    }
  },
  {
    "_id": 58,
    "type": "Feature",
    "properties": {
      "objectId": 58,
      "id": 23,
      "traeger": "Kommunal",
      "strasse": "Hofer Straße (Mittelbach) 35",
      "plz": "09224",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Mittelbach",
      "kurzbezeichnung": "GS Mittelbach",
      "telefon": "0371 852558",
      "email": "gs-mittelbach@schulen-chemnitz.de",
      "fax": "0371 8579488",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Hort",
      "sprachen": null,
      "www": "www.gs-mittelbach.de",
      "traegerTyp": 10,
      "bezugNr": "23",
      "gebietsArtNummer": 40,
      "nummer": 1203,
      "globalId": "66df9143-a94c-439b-889b-5a4c07ef67d2",
      "creationDate": 1702635595.931,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.931,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 130
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.7988219781318,
        50.7992031026468
      ]
    }
  },
  {
    "_id": 47,
    "type": "Feature",
    "properties": {
      "objectId": 47,
      "id": 60,
      "traeger": "Kommunal",
      "strasse": "Guerickestraße 38",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule Schönau/Siegmar",
      "kurzbezeichnung": "OS Schönau/Siegmar",
      "telefon": "0371 815760",
      "email": "os-schoenau@schulen-chemnitz.de",
      "fax": "0371 8157626",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA",
      "sprachen": "Englisch, Russisch, Spanisch",
      "www": "www.c.shuttle.de/ms-schoenau",
      "traegerTyp": 10,
      "bezugNr": "18",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "c3d84510-74a2-4cce-ae96-9649b0ea872e",
      "creationDate": 1702635595.853,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.853,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 228
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8733752933211,
        50.8229833201809
      ]
    }
  },
  {
    "_id": 65,
    "type": "Feature",
    "properties": {
      "objectId": 65,
      "id": 71,
      "traeger": "Kommunal",
      "strasse": "Humboldtplatz 1",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Johannes-Kepler-Gymnasium",
      "kurzbezeichnung": "Johannes-Kepler-Gymnasium",
      "telefon": "0371 3989-2800",
      "email": "gym-kepler@schulen-chemnitz.de",
      "fax": "0371 3989 2899",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Profil: vertieft mathematisch-naturwissenschaftliche Ausbildung; naturwissenschaftliches Profil",
      "sprachen": "1. Englisch, 2. Französisch, Latein, Russisch, Arbeitsgemeinschaft: Tschechisch",
      "www": "www.kepler.c.sn.schule.de",
      "traegerTyp": 10,
      "bezugNr": "6a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "d9caf992-5abe-4663-bb97-b5873ebb5c91",
      "creationDate": 1702635595.993,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.993,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 308
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9480600569853,
        50.8353511594525
      ]
    }
  },
  {
    "_id": 55,
    "type": "Feature",
    "properties": {
      "objectId": 55,
      "id": 20,
      "traeger": "Kommunal",
      "strasse": "Stöcklstraße 4",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Harthau",
      "kurzbezeichnung": "GS Harthau",
      "telefon": "0371 510078",
      "email": "gs-harthau@schulen-chemnitz.de",
      "fax": "0371 52039114",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.grundschule-harthau.de",
      "traegerTyp": 10,
      "bezugNr": "20",
      "gebietsArtNummer": 40,
      "nummer": 803,
      "globalId": "99a1865b-3b02-4a27-a73e-8fa375ba8acd",
      "creationDate": 1702635595.915,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.915,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 126
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9249187665186,
        50.7761567996218
      ]
    }
  },
  {
    "_id": 33,
    "type": "Feature",
    "properties": {
      "objectId": 33,
      "id": 121,
      "traeger": "Frei",
      "strasse": "Dittersdorfer Straße 146c",
      "plz": "09122",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "BIP-Kreativitätsgrundschule",
      "kurzbezeichnung": "BIP Kreativitäts-GS",
      "telefon": "0371 3342820",
      "email": "kontakt@gsc.bipschulen.de",
      "fax": "0371 33428220",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.bipschulen.de",
      "traegerTyp": 30,
      "bezugNr": "5",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "ae3c706b-ca6a-4e50-bec6-d85f6c4b5e68",
      "creationDate": 1702635595.743,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.743,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 942
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8979814660791,
        50.793569270318
      ]
    }
  },
  {
    "_id": 38,
    "type": "Feature",
    "properties": {
      "objectId": 38,
      "id": 45,
      "traeger": "Kommunal",
      "strasse": "Albert-Köhler-Straße 48",
      "plz": "09122",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Albert-Schweitzer-Oberschule",
      "kurzbezeichnung": "Albert-Schweitzer-OS",
      "telefon": "0371 266010",
      "email": "os-schweitzer@schulen-chemnitz.de",
      "fax": "0371 2660120",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Schulplanetarium",
      "sprachen": "Englisch, Französisch, Arbeitsgemeinschaft: Französisch",
      "www": "www.albert-schweitzer-mittelschule-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "1",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "a1b3dd26-8f54-43eb-bd70-8eab83552a7f",
      "creationDate": 1702635595.775,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.775,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 201
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8889423266504,
        50.7930311466346
      ]
    }
  },
  {
    "_id": 60,
    "type": "Feature",
    "properties": {
      "objectId": 60,
      "id": 25,
      "traeger": "Kommunal",
      "strasse": "Genossenschaftsweg 2",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Reichenhain",
      "kurzbezeichnung": "GS Reichenhain",
      "telefon": "0371 539020",
      "email": "gs-reichenhain@schulen-chemnitz.de",
      "fax": "0371 5390218",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Hort",
      "sprachen": null,
      "www": "www.gs-reichenhain.de",
      "traegerTyp": 10,
      "bezugNr": "25",
      "gebietsArtNummer": 40,
      "nummer": 702,
      "globalId": "73d231be-43cb-4dd4-9a8f-9b519a982784",
      "creationDate": 1702635595.946,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.946,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 134
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9532513549025,
        50.7978529087167
      ]
    }
  },
  {
    "_id": 1,
    "type": "Feature",
    "properties": {
      "objectId": 1,
      "id": 1,
      "traeger": "Kommunal",
      "strasse": "Max-Türpe-Straße 58",
      "plz": "09122",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Albert-Einstein-Grundschule",
      "kurzbezeichnung": "Albert-Einstein-GS",
      "telefon": "0371 271710",
      "email": "gs-albert-einstein@schulen-chemnitz.de",
      "fax": "0371 2717119",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.c.shuttle.de/a-einstein-gs",
      "traegerTyp": 10,
      "bezugNr": "1",
      "gebietsArtNummer": 40,
      "nummer": 903,
      "globalId": "73d96808-1583-4e02-bf98-29c5c5ecaf49",
      "creationDate": 1702635595.478,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.478,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 101
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8872762658422,
        50.7922749102438
      ]
    }
  },
  {
    "_id": 14,
    "type": "Feature",
    "properties": {
      "objectId": 14,
      "id": 29,
      "traeger": "Kommunal",
      "strasse": "Rosmarinstraße 12",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Siegmar",
      "kurzbezeichnung": "GS Siegmar",
      "telefon": "0371 842040",
      "email": "gs-siegmar@schulen-chemnitz.de",
      "fax": "0371 8420421",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Hort",
      "sprachen": null,
      "www": "www.grundschule-siegmar.de",
      "traegerTyp": 10,
      "bezugNr": "29",
      "gebietsArtNummer": 40,
      "nummer": 104,
      "globalId": "d63272a6-c2f6-4f59-b068-eb9a625c53bf",
      "creationDate": 1702635595.587,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.587,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 138
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8451718967182,
        50.8193122538291
      ]
    }
  },
  {
    "_id": 19,
    "type": "Feature",
    "properties": {
      "objectId": 19,
      "id": 36,
      "traeger": "Kommunal",
      "strasse": "Ludwig-Richter-Straße 19",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Ludwig-Richter-Grundschule",
      "kurzbezeichnung": "Ludwig-Richter-GS",
      "telefon": "0371 414803",
      "email": "gs-richter@schulen-chemnitz.de",
      "fax": "0371 4002583",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Hort, Vorbereitungsklassen; Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten",
      "sprachen": null,
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4210951",
      "traegerTyp": 10,
      "bezugNr": "36",
      "gebietsArtNummer": 40,
      "nummer": 402,
      "globalId": "be80db27-682d-4b4d-b0c2-173ba081affd",
      "creationDate": 1702635595.618,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.618,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 147
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9488765826542,
        50.8527261988194
      ]
    }
  },
  {
    "_id": 18,
    "type": "Feature",
    "properties": {
      "objectId": 18,
      "id": 35,
      "traeger": "Kommunal",
      "strasse": "Chemnitzer Straße (Wittgensdorf) 2",
      "plz": "09228",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Kirchner-Grundschule",
      "kurzbezeichnung": "Kirchner-GS",
      "telefon": "037200 88233",
      "email": "gs-kirchner@schulen-chemnitz.de",
      "fax": "037200 81895",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.grundschule-wittgensdorf.de",
      "traegerTyp": 10,
      "bezugNr": "35",
      "gebietsArtNummer": 40,
      "nummer": 1202,
      "globalId": "4e0919f2-af67-49bf-8144-24602f0e9be3",
      "creationDate": 1702635595.618,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.618,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 145
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8694931966894,
        50.8809561444123
      ]
    }
  },
  {
    "_id": 24,
    "type": "Feature",
    "properties": {
      "objectId": 24,
      "id": 41,
      "traeger": "Kommunal",
      "strasse": "Küchwaldstraße 4",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schlossschule -Grundschule-",
      "kurzbezeichnung": "Schlossschule -GS-",
      "telefon": "0371 3300397",
      "email": "gs-schlossschule@schulen-chemnitz.de",
      "fax": "0371 3350793",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, mit Sportklassen für technisch-akrobatische Sportarten",
      "sprachen": null,
      "www": "www.sn.schule.de/~gs-schloss-c",
      "traegerTyp": 10,
      "bezugNr": "41a",
      "gebietsArtNummer": 40,
      "nummer": 302,
      "globalId": "02c9c32d-8f31-4aac-b936-0db9a6afc4a4",
      "creationDate": 1702635595.665,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.665,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 153
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.913507638215,
        50.8469499033289
      ]
    }
  },
  {
    "_id": 45,
    "type": "Feature",
    "properties": {
      "objectId": 45,
      "id": 57,
      "traeger": "Kommunal",
      "strasse": "Adelsbergstraße 90",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule Gablenz",
      "kurzbezeichnung": "OS Gablenz",
      "telefon": "0371 50710",
      "email": "os-gablenz@schulen-chemnitz.de",
      "fax": "0371 5905962",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "Projekt \"WERK-STATT-SCHULE\"",
      "profile": "GTA, Projekt \"WERK-STATT-SCHULE\"",
      "sprachen": "Englisch, Französisch, Russisch",
      "www": "www.ms-gablenz.de",
      "traegerTyp": 10,
      "bezugNr": "15",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "90e9631d-9033-4c50-a086-a20ce7275af6",
      "creationDate": 1702635595.837,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.837,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 223
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9527862375367,
        50.8310069733292
      ]
    }
  },
  {
    "_id": 54,
    "type": "Feature",
    "properties": {
      "objectId": 54,
      "id": 19,
      "traeger": "Kommunal",
      "strasse": "Schulberg 3",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Glösa",
      "kurzbezeichnung": "GS Glösa",
      "telefon": "0371 4590440",
      "email": "gs-gloesa@schulen-chemnitz.de",
      "fax": "0371 45904414",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/gsgloesa/schulportraet/unser-team.html",
      "traegerTyp": 10,
      "bezugNr": "19",
      "gebietsArtNummer": 40,
      "nummer": 306,
      "globalId": "76199e96-3dee-4712-8100-b95eb355f0c0",
      "creationDate": 1702635595.9,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.9,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 125
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9110634513883,
        50.8726276401017
      ]
    }
  },
  {
    "_id": 32,
    "type": "Feature",
    "properties": {
      "objectId": 32,
      "id": 120,
      "traeger": "Frei",
      "strasse": "Stelzendorfer Straße 271",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Freie Montessori-Grundschule Stelzendorf",
      "kurzbezeichnung": "Freie Montessori-GS Stelzendorf",
      "telefon": "0371 2366890",
      "email": "montessorischule@jugendstaetten-stocker.de",
      "fax": "0371 2366892",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.montessorischule-stelzendorf.de",
      "traegerTyp": 30,
      "bezugNr": "4",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "1ed4b7a3-4fe3-4793-8257-cab1a1e653c3",
      "creationDate": 1702635595.728,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.728,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 932
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.862644944615,
        50.798151763842
      ]
    }
  },
  {
    "_id": 42,
    "type": "Feature",
    "properties": {
      "objectId": 42,
      "id": 53,
      "traeger": "Kommunal",
      "strasse": "Josephinenplatz 9",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Josephinenschule -Oberschule-",
      "kurzbezeichnung": "Josephinenschule -OS-",
      "telefon": "0371 449790",
      "email": "os-josephinenschule@schulen-chemnitz.de",
      "fax": "0371 4497918",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA",
      "sprachen": "Englisch,",
      "www": "www.josephinenschule.de",
      "traegerTyp": 10,
      "bezugNr": "10",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "f6aebb7c-4a8b-4902-8717-3406c5e035f3",
      "creationDate": 1702635595.806,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.806,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 215
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9296492190006,
        50.8498707697401
      ]
    }
  },
  {
    "_id": 3,
    "type": "Feature",
    "properties": {
      "objectId": 3,
      "id": 3,
      "traeger": "Kommunal",
      "strasse": "Ernst-Moritz-Arndt-Straße 4",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Anton-S.-Makarenko-Grundschule",
      "kurzbezeichnung": "Anton-S.-Makarenko-GS",
      "telefon": "0371 722139",
      "email": "gs-makarenko@schulen-chemnitz.de",
      "fax": "0371 70089926",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.makarenko-gs.de",
      "traegerTyp": 10,
      "bezugNr": "3",
      "gebietsArtNummer": 40,
      "nummer": 505,
      "globalId": "91d2472b-4b6c-49e3-9055-53a27179f395",
      "creationDate": 1702635595.509,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.509,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 106
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9629177798337,
        50.8319919787425
      ]
    }
  },
  {
    "_id": 22,
    "type": "Feature",
    "properties": {
      "objectId": 22,
      "id": 39,
      "traeger": "Kommunal",
      "strasse": "Brühl 59",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Rosa-Luxemburg-Grundschule am Brühl",
      "kurzbezeichnung": "Rosa-Luxemburg-GS am Brühl",
      "telefon": "0371 471410",
      "email": "gs-luxemburg@schulen-chemnitz.de",
      "fax": "0371 4714119",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4210704",
      "traegerTyp": 10,
      "bezugNr": "39",
      "gebietsArtNummer": 40,
      "nummer": 304,
      "globalId": "41d05ca2-a0ba-4c6d-9357-d3702c13b7a3",
      "creationDate": 1702635595.65,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.65,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 151
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9249146500484,
        50.8434122247297
      ]
    }
  },
  {
    "_id": 21,
    "type": "Feature",
    "properties": {
      "objectId": 21,
      "id": 38,
      "traeger": "Kommunal",
      "strasse": "Hoffmannstraße 35",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Pablo-Neruda-Grundschule",
      "kurzbezeichnung": "Pablo-Neruda-GS",
      "telefon": "0371 369670",
      "email": "gs-neruda@schulen-chemnitz.de",
      "fax": "0371 36967214",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus ",
      "profile": "Hort",
      "sprachen": null,
      "www": "www.pablo-neruda-grundschule.de",
      "traegerTyp": 10,
      "bezugNr": "38",
      "gebietsArtNummer": 40,
      "nummer": 203,
      "globalId": "d72933c5-3fb6-4bb2-b010-76285a688e5c",
      "creationDate": 1702635595.65,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.65,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 150
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8968045064718,
        50.8285791667057
      ]
    }
  },
  {
    "_id": 23,
    "type": "Feature",
    "properties": {
      "objectId": 23,
      "id": 40,
      "traeger": "Kommunal",
      "strasse": "Rudolfstraße 12",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Rudolfschule -Grundschule-",
      "kurzbezeichnung": "Rudolfschule  -GS-",
      "telefon": "0371 27868880",
      "email": "gs-rudolfschule@schulen-chemnitz.de",
      "fax": "0371 2786888218",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.rudolfschule-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "40",
      "gebietsArtNummer": 40,
      "nummer": 602,
      "globalId": "53d8c0dd-e1e2-4f68-bbf7-0ee0af07cdfc",
      "creationDate": 1702635595.665,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.665,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 152
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9364821337127,
        50.8291536304798
      ]
    }
  },
  {
    "_id": 20,
    "type": "Feature",
    "properties": {
      "objectId": 20,
      "id": 37,
      "traeger": "Kommunal",
      "strasse": "Fritz-Matschke-Straße 23",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Obere Luisenschule -Grundschule-",
      "kurzbezeichnung": "Obere Luisenschule -GS-",
      "telefon": "0371 338010",
      "email": "gs-obere-luisenschule@schulen-chemnitz.de",
      "fax": "0371 3380120",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Hort, Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/gsols/obereluisenschulegrundschule.html",
      "traegerTyp": 10,
      "bezugNr": "37",
      "gebietsArtNummer": 40,
      "nummer": 205,
      "globalId": "ee0ed348-11ac-4bab-9452-27b55a4b058e",
      "creationDate": 1702635595.634,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.634,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 149
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9027950932735,
        50.8416189519938
      ]
    }
  },
  {
    "_id": 7,
    "type": "Feature",
    "properties": {
      "objectId": 7,
      "id": 8,
      "traeger": "Kommunal",
      "strasse": "Albert-Schweitzer-Straße 61",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Emanuel-Gottlieb-Flemming-Grundschule",
      "kurzbezeichnung": "Emanuel-Gottlieb-Flemming-GS",
      "telefon": "0371 300686",
      "email": "gs-flemming@schulen-chemnitz.de",
      "fax": "0371 901081",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.flemming-grundschule.de",
      "traegerTyp": 10,
      "bezugNr": "8",
      "gebietsArtNummer": 40,
      "nummer": 201,
      "globalId": "e2fbeb5e-943d-4b79-8c17-a54e5896e664",
      "creationDate": 1702635595.54,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.54,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 111
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8823574393427,
        50.8399911254795
      ]
    }
  },
  {
    "_id": 31,
    "type": "Feature",
    "properties": {
      "objectId": 31,
      "id": 118,
      "traeger": "Frei",
      "strasse": "Ernst-Enge-Straße 21",
      "plz": "09127",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Montessori-Schule Chemnitz - Freie integrative Schule -Grundschule-",
      "kurzbezeichnung": "Montessori-Schule (GS)",
      "telefon": "0371 71589",
      "email": "grundschule@montessoriverein-chemnitz.de",
      "fax": "0371 70081889",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.montessori-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "3a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "e5f7f237-083c-4492-a5d3-ae9e5ea25b35",
      "creationDate": 1702635595.728,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.728,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 923
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9593611808911,
        50.8238797723748
      ]
    }
  },
  {
    "_id": 40,
    "type": "Feature",
    "properties": {
      "objectId": 40,
      "id": 51,
      "traeger": "Kommunal",
      "strasse": "Uhlandstraße 2",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule \"Am Körnerplatz\" Chemnitz",
      "kurzbezeichnung": "OS \"Am Körnerplatz\"",
      "telefon": "0371 2674600",
      "email": "os-weerth@schulen-chemnitz.de",
      "fax": "0371 26746020",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus nach Abschluss der Sanierung",
      "profile": "GTA, Vorbereitungsklassen; Projekt \"Produktives Lernen\" - Ritterstraße 7",
      "sprachen": "Englisch, Arbeitsgemeinschaft: Russisch",
      "www": "www.georg-weerth-ms-chemnitz.homepage.t-online.de/",
      "traegerTyp": 10,
      "bezugNr": "8",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "3313819b-1032-4e3c-87f5-7bb51fd59c20",
      "creationDate": 1702635595.79,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.79,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 210
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9353668964667,
        50.8358567671611
      ]
    }
  },
  {
    "_id": 49,
    "type": "Feature",
    "properties": {
      "objectId": 49,
      "id": 14,
      "traeger": "Kommunal",
      "strasse": "Wittgensdorfer Straße 121a",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Borna",
      "kurzbezeichnung": "GS Borna",
      "telefon": "0371 3383290",
      "email": "gs-borna@schulen-chemnitz.de",
      "fax": "0371 33832919",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.gs-borna-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "14",
      "gebietsArtNummer": 40,
      "nummer": 301,
      "globalId": "c6886535-ed11-45e8-90b3-90cde8e367f0",
      "creationDate": 1702635595.868,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.868,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 118
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8850360603135,
        50.8633389905466
      ]
    }
  },
  {
    "_id": 12,
    "type": "Feature",
    "properties": {
      "objectId": 12,
      "id": 13,
      "traeger": "Kommunal",
      "strasse": "Ernst-Heilmann-Straße 11",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Altendorf",
      "kurzbezeichnung": "GS Altendorf",
      "telefon": "0371 36914 16",
      "email": "gs-altendorf@schulen-chemnitz.de",
      "fax": "0371 3691422",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Hort",
      "sprachen": null,
      "www": "http://lily84.lima-city.de",
      "traegerTyp": 10,
      "bezugNr": "13",
      "gebietsArtNummer": 40,
      "nummer": 202,
      "globalId": "657d048a-9c2d-455b-9717-22e86582cf52",
      "creationDate": 1702635595.571,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.571,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 117
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8840422701945,
        50.8325546104525
      ]
    }
  },
  {
    "_id": 34,
    "type": "Feature",
    "properties": {
      "objectId": 34,
      "id": 145,
      "traeger": "Frei",
      "strasse": "Emilienstraße 50",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "DPFA-Regenbogen-Grundschule Chemnitz",
      "kurzbezeichnung": "DPFA-Regenbogen-Grundschule Chemnitz",
      "telefon": "0371 45901100",
      "email": "chemnitz.grundschule@dpfa.de",
      "fax": "0371 45901111",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.regenbogen-schulen.de",
      "traegerTyp": 30,
      "bezugNr": "24a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "9137be0f-9921-48cb-a6df-350e9d61ced7",
      "creationDate": 1702635595.743,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.743,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 953
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9392525458278,
        50.8513927470994
      ]
    }
  },
  {
    "_id": 36,
    "type": "Feature",
    "properties": {
      "objectId": 36,
      "id": 343,
      "traeger": "Frei",
      "strasse": "Tschaikowskistraße 49",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Evangelisches Schulzentrum Chemnitz (Grundschule)",
      "kurzbezeichnung": "Evangelisches Schulzentrum (GS)",
      "telefon": "0371 4331970",
      "email": "sekretariat-gs@eszc.de",
      "fax": "0371 43315976",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.eszc.de",
      "traegerTyp": 30,
      "bezugNr": "2a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "e00887a4-c305-4b8a-81e2-4b80338fc6cf",
      "creationDate": 1702635595.759,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.759,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 914
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9386579069539,
        50.8372324492807
      ]
    }
  },
  {
    "_id": 52,
    "type": "Feature",
    "properties": {
      "objectId": 52,
      "id": 17,
      "traeger": "Kommunal",
      "strasse": "An der Kirche 2",
      "plz": "09128",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Euba",
      "kurzbezeichnung": "GS Euba",
      "telefon": "03726 2923",
      "email": "gs-euba@schulen-chemnitz.de",
      "fax": "03726 724726",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.grundschule.euba-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "17",
      "gebietsArtNummer": 40,
      "nummer": 506,
      "globalId": "20bc8b1d-d5de-4acb-8e9e-927fcb154b6d",
      "creationDate": 1702635595.884,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.884,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 122
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        13.0207541083092,
        50.8327410884873
      ]
    }
  },
  {
    "_id": 61,
    "type": "Feature",
    "properties": {
      "objectId": 61,
      "id": 26,
      "traeger": "Kommunal",
      "strasse": "Trützschlerstraße 10",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Rabenstein \"Hans Carl von Carlowitz\"",
      "kurzbezeichnung": "GS Rabenstein",
      "telefon": "0371 842060",
      "email": "gs-rabenstein@schulen-chemnitz.de",
      "fax": "0371 8420619",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort",
      "sprachen": null,
      "www": "www.grundschule-rottluff.de",
      "traegerTyp": 10,
      "bezugNr": "26",
      "gebietsArtNummer": 40,
      "nummer": 101,
      "globalId": "725d1046-18e7-40e7-88a4-ac987da2d4e1",
      "creationDate": 1702635595.962,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.962,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 132
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8343036073846,
        50.8272834750025
      ]
    }
  },
  {
    "_id": 26,
    "type": "Feature",
    "properties": {
      "objectId": 26,
      "id": 43,
      "traeger": "Kommunal",
      "strasse": "Haydnstraße 21",
      "plz": "09119",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Valentina-Tereschkowa-Grundschule",
      "kurzbezeichnung": "Valentina-Tereschkowa-GS",
      "telefon": "0371 369160",
      "email": "gs-tereschkowa@schulen-chemnitz.de",
      "fax": "0371 3691620",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreier Zugang",
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.gs-tereschkowa.de",
      "traegerTyp": 10,
      "bezugNr": "42",
      "gebietsArtNummer": 40,
      "nummer": 1104,
      "globalId": "e34c7a37-fe4d-48f4-9805-d2f9e05594b3",
      "creationDate": 1702635595.681,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.681,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 156
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9013451596457,
        50.8178100083381
      ]
    }
  },
  {
    "_id": 51,
    "type": "Feature",
    "properties": {
      "objectId": 51,
      "id": 16,
      "traeger": "Kommunal",
      "strasse": "Harthauer Weg 5",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Grundschule Einsiedel",
      "kurzbezeichnung": "GS Einsiedel",
      "telefon": "037209 2273",
      "email": "gs-einsiedel@schulen-chemnitz.de",
      "fax": "037209 70719",
      "typ": 10,
      "art": "Grundschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Hort, Vorbereitungsklassen",
      "sprachen": null,
      "www": "https://www.grundschule-einsiedel.de/",
      "traegerTyp": 10,
      "bezugNr": "16",
      "gebietsArtNummer": 40,
      "nummer": 705,
      "globalId": "78f23593-5591-4cbd-8587-0e649f504162",
      "creationDate": 1702635595.884,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.884,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 120
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9706932870544,
        50.7703388508511
      ]
    }
  },
  {
    "_id": 71,
    "type": "Feature",
    "properties": {
      "objectId": 71,
      "id": 355,
      "traeger": "Frei",
      "strasse": "Ludwig-Richter-Straße 21",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Evangelisches Schulzentrum Chemnitz (Gymnasium)",
      "kurzbezeichnung": "Evangelisches Schulzentrum (Gym)",
      "telefon": "0371 4443380",
      "email": "sekretariat-ms-gym@eszc.de",
      "fax": "0371 4443389",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.eszc.de",
      "traegerTyp": 30,
      "bezugNr": "2c",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "df54e5a3-1e45-447e-a804-f4cc25cc09a5",
      "creationDate": 1702635596.04,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.04,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 916
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9492516232175,
        50.8532880687338
      ]
    }
  },
  {
    "_id": 93,
    "type": "Feature",
    "properties": {
      "objectId": 93,
      "id": 325,
      "traeger": "Frei",
      "strasse": "Altchemnitzer Straße 60",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufsfachschule und Fachschule für Sozialwesen und Berufsfachschule für Pflegehilfe der SSA - Sächsische Sozialakademie GmbH",
      "kurzbezeichnung": "SSA - Sächsische Sozialakademie",
      "telefon": "0371 27868500",
      "email": "info@sozialakademie-sachsen.de",
      "fax": "0371 27868529",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.sozialakademie-sachsen.de",
      "traegerTyp": 30,
      "bezugNr": "15",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "060825f9-097e-4d1b-a02f-ecb773c0c487",
      "creationDate": 1702635596.212,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.212,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1190
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9184145796797,
        50.8179335841217
      ]
    }
  },
  {
    "_id": 103,
    "type": "Feature",
    "properties": {
      "objectId": 103,
      "id": 106,
      "traeger": "Kommunal",
      "strasse": "Arno-Schreiter-Straße 3",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Abendgymnasium",
      "kurzbezeichnung": "Abendgymnasium",
      "telefon": "0371 415248",
      "email": "abendgymnasium@schulen-chemnitz.de",
      "fax": "0371 26207360",
      "typ": 60,
      "art": "Schule des zweiten Bildungsweges",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Abi-Online, Fördern bei Lernschwierigkeiten in Mathematik und Deutsch",
      "sprachen": null,
      "www": "www.abendgymnasium-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "2",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "118694b0-7509-42ff-94f8-3e9dd2e8ec30",
      "creationDate": 1702635596.29,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.29,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 602
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9033953947262,
        50.791601893186
      ]
    }
  },
  {
    "_id": 105,
    "type": "Feature",
    "properties": {
      "objectId": 105,
      "id": 108,
      "traeger": "Kommunal",
      "strasse": "Albert-Köhler-Straße 48",
      "plz": "09122",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schulplanetarium",
      "kurzbezeichnung": "Schulplanetarium",
      "telefon": "0371 9099713",
      "email": "info@planetarium-chemnitz.de",
      "fax": "0371 9099719",
      "typ": 90,
      "art": "Sonstige Einrichtung",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.planetarium-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "2",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "0055282f-ffd1-4744-be77-902e6e83b2e9",
      "creationDate": 1702635596.306,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.306,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 702
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8889423266504,
        50.7930311466346
      ]
    }
  },
  {
    "_id": 86,
    "type": "Feature",
    "properties": {
      "objectId": 86,
      "id": 141,
      "traeger": "Frei",
      "strasse": "Unritzstraße 23",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Medizinische Berufsfachschule für Gesundheits- und Krankenpflege am DRK-Krankenhaus Chemnitz-Rabenstein",
      "kurzbezeichnung": "DRK - BFS Gesundheits- und Krankenpflege",
      "telefon": "0371 8329401",
      "email": "bildungszentrum@drk-khs.de",
      "fax": "0371 8329404",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.drk-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "22",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "be6b2ce6-7aa2-4ca0-b40f-a7527571a0fb",
      "creationDate": 1702635596.15,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.15,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1270
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.825723864672,
        50.8218377700902
      ]
    }
  },
  {
    "_id": 91,
    "type": "Feature",
    "properties": {
      "objectId": 91,
      "id": 309,
      "traeger": "Frei",
      "strasse": "Kauffahrtei 25",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "WBS TRAINING SCHULEN gGmbH",
      "kurzbezeichnung": "WBS TRAINING SCHULEN gGmbH",
      "telefon": "0371  24358120",
      "email": "chemnitz@wbstraining.de",
      "fax": "0371 24358129",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.wbstraining.de",
      "traegerTyp": 30,
      "bezugNr": "28",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "4978bbf0-8f30-4253-be9d-095e23999d59",
      "creationDate": 1702635596.196,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.196,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1290
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.905091094823,
        50.8113337829473
      ]
    }
  },
  {
    "_id": 106,
    "type": "Feature",
    "properties": {
      "objectId": 106,
      "id": 109,
      "traeger": "Kommunal",
      "strasse": "Reichenhainer Straße 154",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Internat am Sportgymnasium",
      "kurzbezeichnung": "Sportinternat",
      "telefon": "0371 4884670",
      "email": "sportinternat@schulen-chemnitz.de",
      "fax": "0371 4884697",
      "typ": 90,
      "art": "Sonstige Einrichtung",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.sportgymnasium-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "3",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "4ff0f300-55a3-416b-a551-f175dd0b77c2",
      "creationDate": 1702635596.321,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.321,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 703
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.936745763871,
        50.8059486718153
      ]
    }
  },
  {
    "_id": 70,
    "type": "Feature",
    "properties": {
      "objectId": 70,
      "id": 286,
      "traeger": "Frei",
      "strasse": "Sandstraße 102",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Waldorfschule Chemnitz (Gymnasium)",
      "kurzbezeichnung": "Waldorfschule (Gym)",
      "telefon": "0371 334076-0",
      "email": "info@waldorfschule-chemnitz.de",
      "fax": "0371 334076-99",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.waldorfschule-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "1c",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "66c38845-290d-43d3-81ca-13cc7a9c139b",
      "creationDate": 1702635596.025,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.025,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 905
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8980267295606,
        50.8620186720013
      ]
    }
  },
  {
    "_id": 116,
    "type": "Feature",
    "properties": {
      "objectId": 116,
      "id": 82,
      "traeger": "Kommunal",
      "strasse": "Ludwig-Kirsch-Straße 29",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Förderzentrum mit dem Förderschwerpunkt Lernen  \"Johann Heinrich Pestalozzi \"",
      "kurzbezeichnung": "Förderzentr.\"J.-H.-Pestalozzi\"",
      "telefon": "0371 36777210",
      "email": "fs-pestalozzi@schulen-chemnitz.de",
      "fax": "0371 367772120",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Deutsch, Mathematik, LRS, Ergotherapie, Motorik/Konzentration, Sprache/DAZ, Leseambulanz",
      "sprachen": null,
      "www": "www.pestalozzischule-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "6",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "3f44cd2c-d7a2-4e6d-b0f1-a9d44f627a43",
      "creationDate": 1702635596.4,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.4,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 450
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9415871235391,
        50.8364340254571
      ]
    }
  },
  {
    "_id": 120,
    "type": "Feature",
    "properties": {
      "objectId": 120,
      "id": 88,
      "traeger": "Kommunal",
      "strasse": "Flemmingstraße 4",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Planetenschule - Klinikschule Chemnitz, Haus II",
      "kurzbezeichnung": "Planetenschule -Klinikschule, Haus 2",
      "telefon": "0371 39898454",
      "email": "fs-planetenschule-klinikschule@schulen-chemnitz.de",
      "fax": "0371 39898455",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": "LRS, Motorik/Konzentration",
      "sprachen": null,
      "www": "www.planetenschule-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "10b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "124f19ae-37e7-4c22-85a2-9c2e25d77f8b",
      "creationDate": 1702635596.431,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.431,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 492
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.88386661049,
        50.8436776723467
      ]
    }
  },
  {
    "_id": 76,
    "type": "Feature",
    "properties": {
      "objectId": 76,
      "id": 101,
      "traeger": "Kommunal",
      "strasse": "Wielandstraße 4",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Wirtschaft II  (Außenstelle)",
      "kurzbezeichnung": "BSZ Wirtschaft II,  Ast.",
      "telefon": "0371 38312-115",
      "email": "bsz-wirtschaft-2@schulen-chemnitz.de",
      "fax": "0371 38312-119",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.bszw2-c.de",
      "traegerTyp": 10,
      "bezugNr": "5c",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "2ee986ba-b328-40bd-92ef-9e7d2f14f28c",
      "creationDate": 1702635596.071,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.071,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 551
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9100548692836,
        50.8319654278385
      ]
    }
  },
  {
    "_id": 67,
    "type": "Feature",
    "properties": {
      "objectId": 67,
      "id": 75,
      "traeger": "Kommunal",
      "strasse": "Hohe Straße 35",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Karl-Schmidt-Rottluff-Gymnasium, Haus II",
      "kurzbezeichnung": "Karl-Schmidt-Rottluff-Gymnasium, Haus 2",
      "telefon": "0371 3989 2950",
      "email": "gym-karl-schmidt-rottluff@schulen-chemnitz.de",
      "fax": "0371 4888599",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": "GTA, Profil: sprachlich, naturwissenschaftlich, Vorbereitungsklassen",
      "sprachen": "1. Englisch, 2. Französisch  3. Latein, Arbeitsgemeinschaft: Französisch, Russisch",
      "www": "www.kaschmir-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "8b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "b733d47b-3c07-4289-afd8-3921d78cd1e4",
      "creationDate": 1702635596.009,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.009,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 313
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.911862861039,
        50.8352668312807
      ]
    }
  },
  {
    "_id": 95,
    "type": "Feature",
    "properties": {
      "objectId": 95,
      "id": 331,
      "traeger": "Frei",
      "strasse": "Annaberger Straße 79",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufsschule Chemnitz der ASG - Anerkannten Schulgesellschaft Sachsen mbH",
      "kurzbezeichnung": "Berufsschule Chemnitz der ASG",
      "telefon": "0371 560414-25",
      "email": "info@freie-schulen-chemnitz.de",
      "fax": "0371 53006-23",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.berufsschule-chemnitz",
      "traegerTyp": 30,
      "bezugNr": "27",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "0e88d0cf-14cc-453b-945f-da4aa7a17924",
      "creationDate": 1702635596.228,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.228,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1250
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9190978352894,
        50.8227445270221
      ]
    }
  },
  {
    "_id": 69,
    "type": "Feature",
    "properties": {
      "objectId": 69,
      "id": 157,
      "traeger": "Kommunal",
      "strasse": "Hohe Straße 25",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Karl-Schmidt-Rottluff-Gymnasium, Haus I",
      "kurzbezeichnung": "Karl-Schmidt-Rottluff-Gymnasium, Haus 1",
      "telefon": "0371 3989 2950",
      "email": "gym-karl-schmidt-rottluff@schulen-chemnitz.de",
      "fax": "0371 4888598",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Profil: sprachlich, naturwissenschaftlich, Vorbereitungsklassen",
      "sprachen": "1. Englisch, 2. Französisch  3. Latein, Arbeitsgemeinschaft: Französisch, Russisch",
      "www": "www.kaschmir-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "8a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "fdcead3e-4558-4d8b-a536-501a10f57f84",
      "creationDate": 1702635596.025,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.025,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 312
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9134159452128,
        50.8328645188838
      ]
    }
  },
  {
    "_id": 107,
    "type": "Feature",
    "properties": {
      "objectId": 107,
      "id": 110,
      "traeger": "Kommunal",
      "strasse": "Heinrich-Schütz-Straße 65",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Heim für körper- und mehrfachbehinderte Kinder und Jugendliche",
      "kurzbezeichnung": "GTB+Heim für Körperbehinderte",
      "telefon": "0371 3989-3100",
      "email": "heim-koe@schulen-chemnitz.de",
      "fax": "0371 3989-3149",
      "typ": 90,
      "art": "Sonstige Einrichtung",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.heim-koe.de",
      "traegerTyp": 10,
      "bezugNr": "4",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "acddbf7f-b8b2-4411-bff3-e1b41b58837d",
      "creationDate": 1702635596.321,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.321,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 704
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9559131334516,
        50.8392077274386
      ]
    }
  },
  {
    "_id": 79,
    "type": "Feature",
    "properties": {
      "objectId": 79,
      "id": 334,
      "traeger": "Kommunal",
      "strasse": "Park der Opfer des Faschismus 1",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Technik I  -Industrieschule-",
      "kurzbezeichnung": "BSZ Technik I - Industrieschule",
      "telefon": "0371 3989-1000",
      "email": "bsz-technik-1-industrieschule@schulen-chemnitz.de",
      "fax": "0371 3989-1099",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Berufsschule, BGJ, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.industrieschule.de",
      "traegerTyp": 10,
      "bezugNr": "1",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "31da7c72-8d41-4875-a124-85400320a480",
      "creationDate": 1702635596.103,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.103,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 510
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9295683073502,
        50.8308275281549
      ]
    }
  },
  {
    "_id": 64,
    "type": "Feature",
    "properties": {
      "objectId": 64,
      "id": 70,
      "traeger": "Kommunal",
      "strasse": "Niederwaldstraße 11",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Gymnasium Einsiedel",
      "kurzbezeichnung": "Gymnasium Einsiedel",
      "telefon": "037209 6980",
      "email": "gym-einsiedel@schulen-chemnitz.de",
      "fax": "037209 698121",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Profil: naturwissenschaftlich, sprachlich, gesellschaftswissenschaftlich, sportlich",
      "sprachen": "1. Englisch, 2. Französisch, Latein, Russisch 3. Spanisch, Arbeitsgemeinschaft: Cambridge Course",
      "www": "www.gymnasium-einsiedel.de",
      "traegerTyp": 10,
      "bezugNr": "5",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "bf22c2d0-7077-4fac-a48d-a232189eb279",
      "creationDate": 1702635595.978,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.978,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 307
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9735808965907,
        50.7830619383323
      ]
    }
  },
  {
    "_id": 75,
    "type": "Feature",
    "properties": {
      "objectId": 75,
      "id": 99,
      "traeger": "Kommunal",
      "strasse": "Kanzlerstraße 9",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Wirtschaft II",
      "kurzbezeichnung": "BSZ Wirtschaft II",
      "telefon": "0371 383120",
      "email": "bsz-wirtschaft-2@schulen-chemnitz.de",
      "fax": "0371 38312120",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.bszw2-c.de",
      "traegerTyp": 10,
      "bezugNr": "5",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "de5ef3b8-d992-4410-bb8f-60ce59919136",
      "creationDate": 1702635596.071,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.071,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 550
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.905603356231,
        50.8324448877656
      ]
    }
  },
  {
    "_id": 73,
    "type": "Feature",
    "properties": {
      "objectId": 73,
      "id": 342,
      "traeger": "Frei",
      "strasse": "Auerswalder Straße 120",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "PARZIVAL-Schule (Förderschule)",
      "kurzbezeichnung": "Waldorfschule (Förderschule)",
      "telefon": "0371 334076-70",
      "email": "parzivalschule@waldorfschule-chemnitz.de",
      "fax": "0371 3378070",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.waldorfschule-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "1d",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "49c6c921-2dd1-42cb-878e-48d8e0dfee6f",
      "creationDate": 1702635596.056,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.056,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 907
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8983775338489,
        50.8652803778866
      ]
    }
  },
  {
    "_id": 72,
    "type": "Feature",
    "properties": {
      "objectId": 72,
      "id": 321,
      "traeger": "Land Sachsen",
      "strasse": "Flemmingstraße 8g",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Landesschule für Blinde und Sehbehinderte Förderzentrum Chemnitz",
      "kurzbezeichnung": "Landesschule für Blinde/Sehbehinderte",
      "telefon": "0371 80 81 8 137",
      "email": "blindenschule@sbs.smk.sachsen.de",
      "fax": "03 71 80 818 203",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.blindenschule-chemnitz.de",
      "traegerTyp": 20,
      "bezugNr": "1",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "e3e3be62-0cd1-4a5c-b27a-b12c9a76bd36",
      "creationDate": 1702635596.04,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.04,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 802
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.876749147522,
        50.8425583937128
      ]
    }
  },
  {
    "_id": 85,
    "type": "Feature",
    "properties": {
      "objectId": 85,
      "id": 137,
      "traeger": "Frei",
      "strasse": "Heinrich-Schütz-Straße 109",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Deutsches Erwachsenen-Bildungswerk in Sachsen gemeinnützige Schulträger-GmbH, Privates beru?iches Schulzentrum für Gesundheitsberufe P?ege und Sozialwesen des DEB in Chemnitz",
      "kurzbezeichnung": "DEB in Chemnitz",
      "telefon": "0371 750180",
      "email": "chemnitz-fs@deb-gruppe.de",
      "fax": "0371 7501820",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "http://www.deb.de",
      "traegerTyp": 30,
      "bezugNr": "18",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "3b4f6456-2dae-4254-8c24-1ef7ed22ac95",
      "creationDate": 1702635596.15,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.15,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1210
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9615649576503,
        50.8377150967919
      ]
    }
  },
  {
    "_id": 100,
    "type": "Feature",
    "properties": {
      "objectId": 100,
      "id": 475,
      "traeger": "Frei",
      "strasse": "Otto-Schmerbach-Straße 19",
      "plz": "09117",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Fachschule für Technik der Gemeinnützigen Gesellschaft TUV Rheinland Bildungswerk mbH",
      "kurzbezeichnung": "TÜV Bildungswerk gGmbH - FS Technik",
      "telefon": "0371 8661725",
      "email": "schule-chemnitz@de.tuv.com",
      "fax": "0371 8661726",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.tuv.com/schule-chemnitz",
      "traegerTyp": 30,
      "bezugNr": "14",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "dcca97dc-0f78-49b2-b9a5-47a96291ca04",
      "creationDate": 1702635596.275,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.275,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1180
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8488096561894,
        50.8117952757757
      ]
    }
  },
  {
    "_id": 63,
    "type": "Feature",
    "properties": {
      "objectId": 63,
      "id": 69,
      "traeger": "Kommunal",
      "strasse": "Park der Opfer des Faschismus 2",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Georgius-Agricola-Gymnasium",
      "kurzbezeichnung": "Georgius-Agricola-Gymnasium",
      "telefon": "0371 3989-2700",
      "email": "gym-agricola@schulen-chemnitz.de",
      "fax": "0371 3989 2799",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Profil: naturwissenschaftlich, vertieft sprachliche Ausbildung (bilingualer Zweig in englischer Sprache), Sternwarte",
      "sprachen": "1. Englisch, 2. Spanisch, Latein, 3. Französisch, Russisch, Arbeitsgemeinschaft: Polnisch",
      "www": "www.agricola-gymnasium.de",
      "traegerTyp": 10,
      "bezugNr": "3",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "e2cc2170-f212-4d6a-8064-5835780f81b6",
      "creationDate": 1702635595.978,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635595.978,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 305
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9305215412994,
        50.8304238615326
      ]
    }
  },
  {
    "_id": 83,
    "type": "Feature",
    "properties": {
      "objectId": 83,
      "id": 123,
      "traeger": "Frei",
      "strasse": "An der Wiesenmühle 1",
      "plz": "09224",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum der FORTIS-AKADEMIE gemeinnützige Bildungs GmbH",
      "kurzbezeichnung": "BSZ der FORTIS-AKADEMIE",
      "telefon": "0371 262220",
      "email": "bewerbung@fortis-akademie.de",
      "fax": "0371 26222-99",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.fortis-akademie.de",
      "traegerTyp": 30,
      "bezugNr": "7",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "485e6376-d11a-449f-93f6-8268c31fad6d",
      "creationDate": 1702635596.134,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.134,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1110
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8114258619804,
        50.8122186354997
      ]
    }
  },
  {
    "_id": 81,
    "type": "Feature",
    "properties": {
      "objectId": 81,
      "id": 336,
      "traeger": "Kommunal",
      "strasse": "An der Markthalle 10",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Gesundheit und Sozialwesen",
      "kurzbezeichnung": "BSZ Gesundheit und Sozialwesen",
      "telefon": "0371 675210",
      "email": "bsz-gesundheit-soziales@schulen-chemnitz.de",
      "fax": "0371 67521120",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Berufsschule, Berufsfachschule, Fachschule, Fachoberschule",
      "sprachen": null,
      "www": "www.bsz-gsc.de",
      "traegerTyp": 10,
      "bezugNr": "7",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "b5d109cb-05a9-413f-93f8-67cf63cc765e",
      "creationDate": 1702635596.118,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.118,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 570
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9162479011136,
        50.8353107212991
      ]
    }
  },
  {
    "_id": 88,
    "type": "Feature",
    "properties": {
      "objectId": 88,
      "id": 147,
      "traeger": "Frei",
      "strasse": "Rathausstraße 7",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "F+U gemeinnützige Bildungseinrichtung für Fortbildung und Umschulung Sachsen GmbH",
      "kurzbezeichnung": "F+U Sachsen gGmbH",
      "telefon": "0371 6660151",
      "email": "info@fuu-sachsen.de",
      "fax": "0371 6660160",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.fuu-sachsen.de",
      "traegerTyp": 30,
      "bezugNr": "25",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "274ca784-5330-4c51-9be4-23fb99b30339",
      "creationDate": 1702635596.165,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.165,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1160
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9222683782439,
        50.8322536098611
      ]
    }
  },
  {
    "_id": 104,
    "type": "Feature",
    "properties": {
      "objectId": 104,
      "id": 107,
      "traeger": "Kommunal",
      "strasse": "Ritterstraße 7",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Medienpädagogisches Zentrum",
      "kurzbezeichnung": "Medienpädagogisches Zentrum",
      "telefon": "0371 5619050",
      "email": "mpz-@schulen-chemnitz.de",
      "fax": "0371 56190527",
      "typ": 90,
      "art": "Sonstige Einrichtung",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.mpz-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "1",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "4b191c55-777b-4f55-af0e-d87df92ae5a3",
      "creationDate": 1702635596.306,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.306,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 701
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9277031640016,
        50.8255564985822
      ]
    }
  },
  {
    "_id": 102,
    "type": "Feature",
    "properties": {
      "objectId": 102,
      "id": 105,
      "traeger": "Kommunal",
      "strasse": "Arno-Schreiter-Straße 3",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Abendoberschule",
      "kurzbezeichnung": "Abendoberschule",
      "telefon": "0371 9091022",
      "email": "abendoberschule@schulen-chemnitz.de",
      "fax": "0371 9091021",
      "typ": 60,
      "art": "Schule des zweiten Bildungsweges",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "Vorkurs Klasse 8, Fördern bei Lernschwierigkeiten in Mathematik, Deutsch, Englisch",
      "sprachen": null,
      "www": "www.abendmittelschule-chemnitz.de.tl/",
      "traegerTyp": 10,
      "bezugNr": "1",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "d0047661-ea87-4552-9996-e3634cfa5587",
      "creationDate": 1702635596.29,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.29,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 601
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9033953947262,
        50.791601893186
      ]
    }
  },
  {
    "_id": 112,
    "type": "Feature",
    "properties": {
      "objectId": 112,
      "id": 77,
      "traeger": "Kommunal",
      "strasse": "Heinrich-Schütz-Straße 61",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Terra Nova Campus, Die Entdeckerschule, Förderzentrum mit dem Förderschwerpunkt körperliche und motorische Entwicklung",
      "kurzbezeichnung": "Terra Nova Campus - Die Entdeckerschule",
      "telefon": "0371 3989-3001",
      "email": "fs-entdeckerschule@schulen-chemnitz.de",
      "fax": "0371 3989-3099",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Deutsch, Matematik, Englisch, LRS, Dyskalkulie, Logopädie, Ergotherapie, Physiotherapie, unterstützte Kommunikation, DaZ",
      "sprachen": null,
      "www": "www.terra-nova-campus.de",
      "traegerTyp": 10,
      "bezugNr": "1",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "a7e2f71d-67b2-48a8-8387-59c4ea4e65a0",
      "creationDate": 1702635596.368,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.368,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 430
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.954409907451,
        50.8394367197235
      ]
    }
  },
  {
    "_id": 114,
    "type": "Feature",
    "properties": {
      "objectId": 114,
      "id": 79,
      "traeger": "Kommunal",
      "strasse": "Ernst-Wabra-Straße 34",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schule mit dem Förderschwerpunkt Sprache  \"Ernst Busch \"",
      "kurzbezeichnung": "Schule FSP Sprache \"Ernst Busch\"",
      "telefon": "0371 381660",
      "email": "fs-busch@schulen-chemnitz.de",
      "fax": "0371 3816626",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Deutsch, Mathematik, LRS, Ergotherapie, Motorik/Konzentration",
      "sprachen": null,
      "www": "www.shs-ernst-busch.de",
      "traegerTyp": 10,
      "bezugNr": "3",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "162b1ed2-69bb-4ae9-be75-f055e9205b45",
      "creationDate": 1702635596.384,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.384,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 470
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8803597808859,
        50.7874926432219
      ]
    }
  },
  {
    "_id": 109,
    "type": "Feature",
    "properties": {
      "objectId": 109,
      "id": 480,
      "traeger": "Frei",
      "strasse": "Emilienstraße 50",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "DPFA-Schulen gemeinnützige GmbH -Gymnasium-",
      "kurzbezeichnung": "DPFA-Regenbogen-Gymnasium Chemnitz",
      "telefon": "0371 45901100",
      "email": "chemnitz.gymnasium@dpfa.de",
      "fax": "0371 45901111",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.regenbogen-schulen.de",
      "traegerTyp": 30,
      "bezugNr": "24c",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "391387c3-51ee-42c2-a9db-9308126c9102",
      "creationDate": 1702635596.337,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.337,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 955
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9392525458278,
        50.8513927470994
      ]
    }
  },
  {
    "_id": 132,
    "type": "Feature",
    "properties": {
      "objectId": 132,
      "id": 500,
      "traeger": "Kommunal",
      "strasse": "Hartmannstraße 21",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Oberschule \"Am Hartmannplatz\" Chemnitz",
      "kurzbezeichnung": "OS \"Am Hartmannplatz\"",
      "telefon": "0371 3356540",
      "email": "os-hartmannplatz@schulen-chemnitz.de",
      "fax": null,
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus, bis Ende Schuljahr 2023/24 zunächst Außenstelle der Unteren Luisenschule -Oberschule-",
      "profile": "GTA",
      "sprachen": null,
      "www": null,
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "02e04821-daba-4e7a-b0e6-c3afea070c4e",
      "creationDate": 1702635596.525,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.525,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1370
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.913737571657,
        50.8378573302462
      ]
    }
  },
  {
    "_id": 98,
    "type": "Feature",
    "properties": {
      "objectId": 98,
      "id": 352,
      "traeger": "Frei",
      "strasse": "Ebertstraße 10",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Ludwig Fresenius Schulen GmbH",
      "kurzbezeichnung": "Ludwig Fresenius Schulen",
      "telefon": "0371 227004",
      "email": "chemnitz@die-schule.de",
      "fax": "0371 2824849",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.die-schule.de",
      "traegerTyp": 30,
      "bezugNr": "19",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "9533707e-e715-4dca-bc79-47a261331d7c",
      "creationDate": 1702635596.259,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.259,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1220
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9273051599201,
        50.8188464716151
      ]
    }
  },
  {
    "_id": 96,
    "type": "Feature",
    "properties": {
      "objectId": 96,
      "id": 332,
      "traeger": "Frei",
      "strasse": "Schönherrstraße 8",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Helmut-Rödler-Schule für Krankengymnastik/Physiotherapie gGmbH",
      "kurzbezeichnung": "Helmut-Rödler-Schule",
      "telefon": "0371 5905271",
      "email": "info@roedler-schule-chemnitz.de",
      "fax": "0371 5204472",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.roedler-schule-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "20",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "b80299aa-44eb-430d-a380-17e2f008e3eb",
      "creationDate": 1702635596.243,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.243,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1230
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9216451460311,
        50.8501413639865
      ]
    }
  },
  {
    "_id": 92,
    "type": "Feature",
    "properties": {
      "objectId": 92,
      "id": 320,
      "traeger": "Frei",
      "strasse": "Annaberger Straße 79",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Freie Schulen Chemnitz der ASG - Anerkannten Schulgesellschaft mbH",
      "kurzbezeichnung": "Freie Schulen Chemnitz der ASG",
      "telefon": "0371 530060",
      "email": "info@freie-schulen-chemnitz.de",
      "fax": "0371 5300611",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.freie-schulen-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "17",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "49aaa8e3-7f85-45f3-aecd-46a90e23fc1c",
      "creationDate": 1702635596.196,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.196,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1200
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9190978352894,
        50.8227445270221
      ]
    }
  },
  {
    "_id": 80,
    "type": "Feature",
    "properties": {
      "objectId": 80,
      "id": 335,
      "traeger": "Kommunal",
      "strasse": "Arthur-Bretschneider-Straße 17",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Ernährung, Gastgewerbe, Gesundheit",
      "kurzbezeichnung": "BSZ Ernährung, Gastgewerbe, Gesundheit",
      "telefon": "0371 374360",
      "email": "bsz-ernaehrung-hauswirtschaft@schulen-chemnitz.de",
      "fax": "0371 3743642",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Berufsschule, Berufsfachschule, BVJ, Vorbereitungsklassen",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/bszcegg/unser-bsz.html",
      "traegerTyp": 10,
      "bezugNr": "6",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "ad1af7d7-da59-42c2-a8cc-94fbf66ba510",
      "creationDate": 1702635596.103,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.103,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 560
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9013606031607,
        50.8450880325514
      ]
    }
  },
  {
    "_id": 84,
    "type": "Feature",
    "properties": {
      "objectId": 84,
      "id": 125,
      "traeger": "Frei",
      "strasse": "Hartmannstraße 3a",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Euro Akademie Chemnitz",
      "kurzbezeichnung": "Euro Akademie Chemnitz",
      "telefon": "0371 43311230",
      "email": "chemnitz@euroakademie.de",
      "fax": "0371 433112320",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.euroakademie.de/de/standorte/chemnitz.html",
      "traegerTyp": 30,
      "bezugNr": "8",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "c0538e37-0f83-4e00-9e33-02d90fa04d53",
      "creationDate": 1702635596.134,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.134,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1120
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9178032035355,
        50.8360977229064
      ]
    }
  },
  {
    "_id": 117,
    "type": "Feature",
    "properties": {
      "objectId": 117,
      "id": 83,
      "traeger": "Kommunal",
      "strasse": "Schulstraße 2",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schule Altchemnitz, Förderzentrum mit dem Förderschwerpunkt Lernen",
      "kurzbezeichnung": "Schule Altchemnitz",
      "telefon": "0371 539010",
      "email": "fs-altchemnitz@schulen-chemnitz.de",
      "fax": "0371 5390126",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "Baubedingte Auslagerung bis voraussichtlich Ende Schuljahr 2023/2024 an den Standort Philippstraße 20, 09125 Chemnitz",
      "profile": null,
      "sprachen": null,
      "www": "www.schulealtchemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "7",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "cbcd5f8b-82f6-4f71-82f6-422fa4130f7b",
      "creationDate": 1702635596.4,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.4,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 460
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9110148524672,
        50.7993813312941
      ]
    }
  },
  {
    "_id": 123,
    "type": "Feature",
    "properties": {
      "objectId": 123,
      "id": 163,
      "traeger": "Kommunal",
      "strasse": "Wilhelm-Firl-Straße 4",
      "plz": "09122",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Sonderpädagogisches Förderzentrum \"J. Trüper\" Projekt \"Zwischenstopp\"",
      "kurzbezeichnung": "J.-Trüper-Schule, Projekt",
      "telefon": "0371 2821288",
      "email": "fs-trueper@schulen-chemnitz.de",
      "fax": "-",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "https://cms.sachsen.schule/sfectrue/start/neuigkeiten.html",
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "dc1fb309-3633-4e31-b614-a745560935d2",
      "creationDate": 1702635596.446,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.446,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 484
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8940954658364,
        50.7922364098237
      ]
    }
  },
  {
    "_id": 82,
    "type": "Feature",
    "properties": {
      "objectId": 82,
      "id": 111,
      "traeger": "Frei",
      "strasse": "Berganger 11",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Medizinische Berufsfachschule der Klinikum Chemnitz gGmbH - BFS für  bundesrechtlich geregelte Gesundheitsberufe",
      "kurzbezeichnung": "Medizinische BFS des Klinikums Chemnitz",
      "telefon": "0371 3391077",
      "email": "medbfs@skc.de",
      "fax": "0371 4004255",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.klinikum-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "35",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "43e6aa87-a2fc-48eb-b406-392dbadaacf0",
      "creationDate": 1702635596.118,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.118,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 810
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8731319197586,
        50.8388917752462
      ]
    }
  },
  {
    "_id": 113,
    "type": "Feature",
    "properties": {
      "objectId": 113,
      "id": 78,
      "traeger": "Kommunal",
      "strasse": "Richard-Wagner-Straße 76",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Förderzentrum \"Georg Götz\", Schule mit dem Förderschwerpunkt Hören",
      "kurzbezeichnung": "Förderzentrum \"Georg Götz\",  FSP Hören",
      "telefon": "0371 272090",
      "email": "fs-goetz-hoergeschaedigtenschule@schulen-chemnitz.de",
      "fax": "0371 2720926",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "Beratungsstelle: Richard-Wagner-Straße 76, 09120 Chemnitz",
      "profile": "GTA, Deutsch, LRS, Ergotherapie, Motorik/Konzentration, Logopädie, Hörtraining, Lautsprachbegleitende Gebärde (LBG)",
      "sprachen": null,
      "www": "www.georg-goetz-schule.de",
      "traegerTyp": 10,
      "bezugNr": "2",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "11a5bd0b-9c09-4994-9422-40c7bc86c9df",
      "creationDate": 1702635596.368,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.368,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 410
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8994600283918,
        50.8147593898924
      ]
    }
  },
  {
    "_id": 110,
    "type": "Feature",
    "properties": {
      "objectId": 110,
      "id": 493,
      "traeger": "Frei",
      "strasse": "Saydaer Straße 21",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "gruuna Schule gGmbH (Gymnasium)",
      "kurzbezeichnung": "gruuna Schule gGmbH (Gymnasium)",
      "telefon": "0371 33715680",
      "email": "info@gruuna.schule",
      "fax": null,
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.gruuna.schule",
      "traegerTyp": 30,
      "bezugNr": "33",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "a50b0f76-2aef-4d74-a6d9-561e8d17f84d",
      "creationDate": 1702635596.353,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.353,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 973
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9352089883882,
        50.7978521601097
      ]
    }
  },
  {
    "_id": 118,
    "type": "Feature",
    "properties": {
      "objectId": 118,
      "id": 85,
      "traeger": "Kommunal",
      "strasse": "Scheffelstraße 18",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Sonderpädagogisches Förderzentrum  \"Johannes Trüper \", Schule mit dem Förderschwerpunkt emotionale und soziale Entwicklung, Haus I",
      "kurzbezeichnung": "J.-Trüper-Schule, Haus 1",
      "telefon": "0371 281570",
      "email": "fs-trueper@schulen-chemnitz.de",
      "fax": "0371 2815721",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "LRS, Motorik/Konzentration",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/sfectrue/start/neuigkeiten.html",
      "traegerTyp": 10,
      "bezugNr": "9a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "67b348fe-53ec-45a0-858f-d468f4ba18a6",
      "creationDate": 1702635596.415,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.415,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 481
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8928433256839,
        50.8030042437469
      ]
    }
  },
  {
    "_id": 119,
    "type": "Feature",
    "properties": {
      "objectId": 119,
      "id": 86,
      "traeger": "Kommunal",
      "strasse": "Friedrich-Hähnel-Straße 86",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Sonderpädagogisches Förderzentrum  \"Johannes Trüper \", Schule mit dem Förderschwerpunkt emotionale und soziale Entwicklung, Haus II",
      "kurzbezeichnung": "J.-Trüper-Schule, Haus 2",
      "telefon": "0371 229189",
      "email": "fs-trueper@schulen-chemnitz.de",
      "fax": "-",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": "LRS, Motorik/Konzentration",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/sfectrue/start/neuigkeiten.html",
      "traegerTyp": 10,
      "bezugNr": "9b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "fc05158c-63fd-4406-9106-65cc4590addf",
      "creationDate": 1702635596.415,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.415,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 482
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.895297700598,
        50.8044957626574
      ]
    }
  },
  {
    "_id": 111,
    "type": "Feature",
    "properties": {
      "objectId": 111,
      "id": 498,
      "traeger": "Frei",
      "strasse": "Seumestraße 2",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Internationales Stefan-Heym-Gymnasium",
      "kurzbezeichnung": "Internationales Stefan-Heym-Gymnasium",
      "telefon": "0371 66601-20",
      "email": "shg@fuu-sachsen.de",
      "fax": null,
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "https://stefan-heym-gymnasium.de/",
      "traegerTyp": 30,
      "bezugNr": null,
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "25f25aed-5ea1-4a44-be88-ed05cd1912e8",
      "creationDate": 1702635596.353,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.353,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1350
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9180880136631,
        50.8421656127373
      ]
    }
  },
  {
    "_id": 74,
    "type": "Feature",
    "properties": {
      "objectId": 74,
      "id": 98,
      "traeger": "Kommunal",
      "strasse": "Lutherstraße 2",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Wirtschaft I",
      "kurzbezeichnung": "BSZ Wirtschaft I",
      "telefon": "0371 400580",
      "email": "bsz-wirtschaft-1@schulen-chemnitz.de",
      "fax": "0371 40058115",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Berufsschule, Fachschule, Fachoberschule",
      "sprachen": null,
      "www": "www.bszI-wirtschaft-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "4",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "d2ab5e8f-22a0-4627-aad6-154e0ff5bfdd",
      "creationDate": 1702635596.056,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.056,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 540
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9354705644914,
        50.8262194947425
      ]
    }
  },
  {
    "_id": 125,
    "type": "Feature",
    "properties": {
      "objectId": 125,
      "id": 477,
      "traeger": "Kommunal",
      "strasse": "Arno-Schreiter-Straße 3",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schule mit dem Förderschwerpunkt Sprache „Ernst Busch“  - Oberschulteil",
      "kurzbezeichnung": "Schule FSP Sprache \"Ernst Busch\" - OS",
      "telefon": "0371 381660",
      "email": "fs-busch@schulen-chemnitz.de",
      "fax": "0371 3816626",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": "GTA, Deutsch, Mathematik, LRS, Ergotherapie, Motorik/Konzentration",
      "sprachen": null,
      "www": "http://www.shs-ernst-busch.de",
      "traegerTyp": 10,
      "bezugNr": "8b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "82a585e2-ec4c-4a50-b66c-50195cabcc88",
      "creationDate": 1702635596.462,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.462,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 472
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9033953947262,
        50.791601893186
      ]
    }
  },
  {
    "_id": 127,
    "type": "Feature",
    "properties": {
      "objectId": 127,
      "id": 66,
      "traeger": "Kommunal",
      "strasse": "Stollberger Straße 25",
      "plz": "09119",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Chemnitzer Schulmodell  (Grund- und Oberschule)",
      "kurzbezeichnung": "Chemnitzer Schulmodell (GS+OS)",
      "telefon": "0371 5338810",
      "email": "chemnitzer-schulmodell@schulen-chemnitz.de",
      "fax": "0371 533881218",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Hort, Stadtoffene Schule",
      "sprachen": "Englisch, Französisch",
      "www": "www.schulmodell.de",
      "traegerTyp": 10,
      "bezugNr": "24",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "83bebfe6-ce8b-4256-8ca6-8f6432badf8b",
      "creationDate": 1702635596.478,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.478,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 270
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.91265888046,
        50.8239270383139
      ]
    }
  },
  {
    "_id": 126,
    "type": "Feature",
    "properties": {
      "objectId": 126,
      "id": 479,
      "traeger": "Kommunal",
      "strasse": "Ernst-Wabra-Straße 34",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schule mit dem Förderschwerpunkt Sprache „Ernst Busch“  - Grundschulteil",
      "kurzbezeichnung": "Schule FSP Sprache \"Ernst Busch\" - GS",
      "telefon": "0371 381660",
      "email": "fs-busch@schulen-chemnitz.de",
      "fax": "0371 2668426",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Deutsch, Mathematik, LRS, Ergotherapie, Motorik/Konzentration",
      "sprachen": null,
      "www": "http://www.shs-ernst-busch.de",
      "traegerTyp": 10,
      "bezugNr": "8a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "29ac6aaf-9ab9-468d-8187-0cbe2b370940",
      "creationDate": 1702635596.478,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.478,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 471
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8803597808859,
        50.7874926432219
      ]
    }
  },
  {
    "_id": 68,
    "type": "Feature",
    "properties": {
      "objectId": 68,
      "id": 76,
      "traeger": "Kommunal",
      "strasse": "Reichenhainer Straße 210",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Sportgymnasium Chemnitz",
      "kurzbezeichnung": "Sportgymnasium",
      "telefon": "0371 4884600",
      "email": "gym-sport@schulen-chemnitz.de",
      "fax": "0371 4884699",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA, Profil: § 4 Gymnasium: vertieft sportliche Ausbildung; Eliteschule des Sports; Eliteschule des Fußballs\nleistungssportorientierte Zugangsbedingungen; Vorbereitungsklassen für Aussiedler-/Ausländerkinder",
      "sprachen": "1. Englisch, 2. Französisch, Russisch, 3. Latein (für Quereinsteiger nur im  Ausnahmefall)",
      "www": "www.sportgymnasium-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "10",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "01157163-9a03-451a-81b0-44ebf5a8ad1d",
      "creationDate": 1702635596.009,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.009,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 314
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.936586997522,
        50.802884141863
      ]
    }
  },
  {
    "_id": 97,
    "type": "Feature",
    "properties": {
      "objectId": 97,
      "id": 344,
      "traeger": "Frei",
      "strasse": "Emilienstraße 50",
      "plz": "09113",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "DPFA-Schulen gemeinnützige GmbH - Bildungszentrum Chemnitz",
      "kurzbezeichnung": "DPFA - Schulen gemeinnützige GmbH",
      "telefon": "0371 45901130",
      "email": "gl.schulen@dpfa.de",
      "fax": "0371 45901-111 ",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.dpfa.de/",
      "traegerTyp": 30,
      "bezugNr": "6",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "931f7402-1179-45ff-afa6-d45ea9641524",
      "creationDate": 1702635596.243,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.243,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1101
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9392525458278,
        50.8513927470994
      ]
    }
  },
  {
    "_id": 99,
    "type": "Feature",
    "properties": {
      "objectId": 99,
      "id": 367,
      "traeger": "Frei",
      "strasse": "Bernhardstraße 68",
      "plz": "09126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Bildungs- und InnovationsPortal Chemnitz - Berufsfachschule für Altenpflege",
      "kurzbezeichnung": "BIP Chemnitz",
      "telefon": "0371 5265-550",
      "email": "info@bip-chemnitz.de",
      "fax": "0371 5265-559",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.bip-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "30",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "6c4a897d-c533-48a6-a5ee-917b3028f017",
      "creationDate": 1702635596.259,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.259,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1300
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9466199667805,
        50.8292903474397
      ]
    }
  },
  {
    "_id": 124,
    "type": "Feature",
    "properties": {
      "objectId": 124,
      "id": 340,
      "traeger": "Kommunal",
      "strasse": "Dresdner Straße 178",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Planetenschule - Klinikschule Chemnitz, Haus I",
      "kurzbezeichnung": "Planetenschule -Klinikschule, Haus 1",
      "telefon": "0371 83441230",
      "email": "fs-planetenschule-klinikschule@schulen-chemnitz.de",
      "fax": "0371 83441239",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "LRS, Motorik/Konzentration",
      "sprachen": null,
      "www": "www.planetenschule-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "10a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "94887006-8f7f-4dac-8615-dbb785232f9b",
      "creationDate": 1702635596.462,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.462,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 491
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9538293331668,
        50.8512004371741
      ]
    }
  },
  {
    "_id": 77,
    "type": "Feature",
    "properties": {
      "objectId": 77,
      "id": 330,
      "traeger": "Kommunal",
      "strasse": "Annaberger Straße 186",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Technik III  -R.Hartmann-Schule-",
      "kurzbezeichnung": "BSZ Technik III - Hartmannschule",
      "telefon": "0371 4884900",
      "email": "bsz-technik-3-hartmannschule@schulen-chemnitz.de",
      "fax": "0371 4884999",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Berufsschule, Fachschule, Fachoberschule",
      "sprachen": null,
      "www": "www.rhs-chemnitz.de",
      "traegerTyp": 10,
      "bezugNr": "3",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "e6570072-c17c-4245-9e82-f3de94b70408",
      "creationDate": 1702635596.087,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.087,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 530
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9104159467436,
        50.8008634518694
      ]
    }
  },
  {
    "_id": 89,
    "type": "Feature",
    "properties": {
      "objectId": 89,
      "id": 148,
      "traeger": "Frei",
      "strasse": "Annaberger Straße 73",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "bsw - Fachschule für Technik Chemnitz Fachrichtung  Mechatronik im Bildungswerk der Sächsischen Wirtschaft gGmbH",
      "kurzbezeichnung": "bsw - Fachschulen für Technik",
      "telefon": "0351 56362322",
      "email": "bz-chemnitz@bsw-mail.de",
      "fax": "0351 56362323",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.fachschule-technik-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "26",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "0a296a26-1969-4880-be73-822267a3020b",
      "creationDate": 1702635596.181,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.181,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1260
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9205353393466,
        50.8238676212042
      ]
    }
  },
  {
    "_id": 94,
    "type": "Feature",
    "properties": {
      "objectId": 94,
      "id": 328,
      "traeger": "Frei",
      "strasse": "Flemmingstraße 8c",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufsbildende Schule am Berufsbildungswerk Chemnitz der SFZ Förderzentrum gGmbH \nam Berufsbildungswerk \nChemnitz der SFZ \nFörderzentrum gGmbH",
      "kurzbezeichnung": "SFZ Förderzentrum gGmbH Berufsbild. Schu",
      "telefon": "0371 3344-0",
      "email": "über Kontaktformular www.sfz-chemnitz.de",
      "fax": "0371 3344-350",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.sfz-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "9",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "52be36c0-5dd4-452e-9224-9ee5c36fe8b0",
      "creationDate": 1702635596.228,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.228,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1130
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8769838081166,
        50.8420242251265
      ]
    }
  },
  {
    "_id": 101,
    "type": "Feature",
    "properties": {
      "objectId": 101,
      "id": 494,
      "traeger": "Frei",
      "strasse": "Paul-Gruner-Straße 58",
      "plz": "09120",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufsfachschule für Sozialwesen der SBH Südost GmbH",
      "kurzbezeichnung": "BFS Sozialwesen SBH Südost GmbH",
      "telefon": "0371 4000510",
      "email": "info@s-b-h.deinfo-chemnitz@sbh-suedost.de",
      "fax": "0371 40005130",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.stiftung-bildung-handwerk.de/",
      "traegerTyp": 30,
      "bezugNr": "31",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "f62941f7-ccc6-46bd-b0d4-344c0ae54ad9",
      "creationDate": 1702635596.275,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.275,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1310
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.908241577471,
        50.8077030069542
      ]
    }
  },
  {
    "_id": 78,
    "type": "Feature",
    "properties": {
      "objectId": 78,
      "id": 333,
      "traeger": "Kommunal",
      "strasse": "Schloßstraße 3",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufliches Schulzentrum für Technik II  -Handwerkerschule-",
      "kurzbezeichnung": "BSZ Technik II - Handwerkerschule",
      "telefon": "0371 488-8000",
      "email": "bsz-technik-2-handwerkerschule@schulen-chemnitz.de",
      "fax": "0371 488-8099",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "Berufsschule, Berufliches Gymnasium, BVJ, Vorbereitungsklassen",
      "sprachen": null,
      "www": "www.bsz-handwerkerschule.de",
      "traegerTyp": 10,
      "bezugNr": "2",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "5481b7e5-87af-4062-b390-68e20dd082c3",
      "creationDate": 1702635596.087,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.087,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 520
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9156510937022,
        50.8383383631828
      ]
    }
  },
  {
    "_id": 87,
    "type": "Feature",
    "properties": {
      "objectId": 87,
      "id": 142,
      "traeger": "Frei",
      "strasse": "Zeisigwaldstraße 101",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Evangelische Berufsfachschule für Krankenpflege und Altenpflege der Bethanien-Krankenhaus Chemnitz gemeinnützige GmbH",
      "kurzbezeichnung": "Evangelische BFS Kranken-/Altenpflege",
      "telefon": "0371 4301020",
      "email": "schule@bethanien-sachsen.de",
      "fax": "0371 4301024",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.bethanien-sachsen.de",
      "traegerTyp": 30,
      "bezugNr": "23",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "29b5c797-b29a-45cf-828d-f90a2d95e308",
      "creationDate": 1702635596.165,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.165,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1280
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9630366891884,
        50.8396312463723
      ]
    }
  },
  {
    "_id": 90,
    "type": "Feature",
    "properties": {
      "objectId": 90,
      "id": 283,
      "traeger": "Frei",
      "strasse": "Chemnitztalstraße 66a",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Berufsschule und Berufsbildende Förderschule des Vereins zur beruflichen Förderung und Ausbildung e. V. (VBFA)",
      "kurzbezeichnung": "VBFA Berufsschule Chemnitz",
      "telefon": "0371 44983-0",
      "email": "bs2-chemnitz@vbfa.de",
      "fax": "0371 44983-26",
      "typ": 50,
      "art": "Berufsbildende Schule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.vbfa.de",
      "traegerTyp": 30,
      "bezugNr": "13b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "660a61d1-05ab-4ecd-8934-abdc79823e62",
      "creationDate": 1702635596.181,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.181,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1170
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9220483880177,
        50.8622370100306
      ]
    }
  },
  {
    "_id": 108,
    "type": "Feature",
    "properties": {
      "objectId": 108,
      "id": 363,
      "traeger": "Frei",
      "strasse": "Fürstenstraße 147",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Montessori-Schule Chemnitz - Freie integrative Schule -Gymnasium-",
      "kurzbezeichnung": "Montessori-Schule (Gym)",
      "telefon": "0371 2804228",
      "email": "sekundarstufe@montessoriverein-chemnitz.de",
      "fax": "0371 4323376",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.montessori-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "3c",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "353bfcc3-6be1-4471-b2bc-fc7ecf78c2f2",
      "creationDate": 1702635596.337,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.337,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 925
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9591959229599,
        50.8338112912545
      ]
    }
  },
  {
    "_id": 130,
    "type": "Feature",
    "properties": {
      "objectId": 130,
      "id": 482,
      "traeger": "Kommunal",
      "strasse": "Arno-Schreiter-Straße 1",
      "plz": "09123",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Alexander-von-Humboldt-Oberschule Chemnitz",
      "kurzbezeichnung": "Alexander-von-Humboldt-OS Chemnitz",
      "telefon": "0371 26212190",
      "email": "os-arnoschreiter1@schulen-chemnitz.de",
      "fax": "0371 262121919",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus",
      "profile": "GTA",
      "sprachen": null,
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4233037",
      "traegerTyp": 10,
      "bezugNr": "1a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "1927fc4c-31c0-4075-a6df-095b8f835f72",
      "creationDate": 1702635596.509,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.509,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 202
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.902724392555,
        50.7914847502766
      ]
    }
  },
  {
    "_id": 121,
    "type": "Feature",
    "properties": {
      "objectId": 121,
      "id": 89,
      "traeger": "Kommunal",
      "strasse": "Max-Schäller-Straße 1",
      "plz": "09122",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Janusz- Korczak-Schule, Schule mit dem Förderschwerpunkt geistige Entwicklung",
      "kurzbezeichnung": "J.-Korczak-Schule, FSP geistige Entwicklung",
      "telefon": "0371 225095",
      "email": "fs-korczak@schulen-chemnitz.de",
      "fax": "0371 225040",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "barrierefreies Schulhaus, temporäre Auslagerung der Oberstufen- und Werkstufenklassen an die ehemalige Grundschule Rottluf, Jegendweg 1a, 09116 Chemnitz",
      "profile": "GTA, Deutsch, Mathematik, Singen, Spielen, Tanzen, tiergestützte Therapie, Ergotherapie, Motopädie, Motorik/Konzentration, Schwimmen",
      "sprachen": null,
      "www": "www.janusz-korczak-schulechemnitz.de.tl",
      "traegerTyp": 10,
      "bezugNr": "11",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "f81522f4-0c59-4176-afc0-30a48eb7e84c",
      "creationDate": 1702635596.431,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.431,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 421
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8950628249514,
        50.7974301121235
      ]
    }
  },
  {
    "_id": 122,
    "type": "Feature",
    "properties": {
      "objectId": 122,
      "id": 90,
      "traeger": "Kommunal",
      "strasse": "Ernst-Moritz-Arndt-Straße 1a",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Schule  \"Am Zeisigwald \", Schule mit dem Förderschwerpunkt geistige Entwicklung",
      "kurzbezeichnung": "Schule \"Am Zeisigwald\", FSP geistige Entw.",
      "telefon": "0371 7008770",
      "email": "fs-amzeisigwald@schulen-chemnitz.de",
      "fax": "0371 70087718",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": "temporäre Auslagerung der Oberstufen- und Werkstufenklassen an die ehemalige Grundschule Rottluf, Jegendweg 1a, 09116 Chemnitz",
      "profile": "GTA, Ergotherapie, Logopädie, Physiotherapie, Motopädie",
      "sprachen": null,
      "www": "www.amzeisigwald.de",
      "traegerTyp": 10,
      "bezugNr": "12",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "21ae40d2-5528-472b-adc5-c1c5e4ce6f22",
      "creationDate": 1702635596.446,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.446,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 422
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9665728167273,
        50.8316116358909
      ]
    }
  },
  {
    "_id": 136,
    "type": "Feature",
    "properties": {
      "objectId": 136,
      "id": 476,
      "traeger": "Frei",
      "strasse": "Emilienstraße 50",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "DPFA-Schulen gemeinnützige GmbH -Oberschule-",
      "kurzbezeichnung": "DPFA-Regenbogen-Oberschule Chemnitz",
      "telefon": "0371 45901100",
      "email": "chemnitz.oberschule@dpfa.de",
      "fax": "0371 45901111",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.regenbogen-schulen.de",
      "traegerTyp": 30,
      "bezugNr": "24b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "ddaffd40-6c76-4ba0-8b8d-15137dd239c4",
      "creationDate": 1702635596.556,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.556,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 954
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9392525458278,
        50.8513927470994
      ]
    }
  },
  {
    "_id": 137,
    "type": "Feature",
    "properties": {
      "objectId": 137,
      "id": 487,
      "traeger": "Frei",
      "strasse": "Waldenburger Straße 63",
      "plz": "09116",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Friedrich August III. Oberschule",
      "kurzbezeichnung": "Friedrich August III. Oberschule",
      "telefon": "0371 382430",
      "email": "info@fa-os.eu",
      "fax": null,
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "https://fa-os.eu/",
      "traegerTyp": 30,
      "bezugNr": "34",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "d47ef171-848f-49f6-963a-388ffd34698d",
      "creationDate": 1702635596.556,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.556,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 975
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8774888058499,
        50.8310585585904
      ]
    }
  },
  {
    "_id": 129,
    "type": "Feature",
    "properties": {
      "objectId": 129,
      "id": 322,
      "traeger": "Kommunal",
      "strasse": "Ritterstraße 7",
      "plz": "09111",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Projekt  \"Produktives Lernen\"",
      "kurzbezeichnung": "Projekt  \"Produktives Lernen\"",
      "telefon": "0371 56190580",
      "email": "os-weerth-produktiveslernen@schulen-chemnitz.de",
      "fax": "0371 56190581",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "f60e28b3-2efe-45dc-8429-8e3e42397b7c",
      "creationDate": 1702635596.493,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.493,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 211
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9277031640016,
        50.8255564985822
      ]
    }
  },
  {
    "_id": 133,
    "type": "Feature",
    "properties": {
      "objectId": 133,
      "id": 117,
      "traeger": "Frei",
      "strasse": "Ludwig-Richter-Straße 21",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Evangelisches Schulzentrum Chemnitz (Oberschule)",
      "kurzbezeichnung": "Evangelisches Schulzentrum (OS)",
      "telefon": "0371 4443380",
      "email": "sekretariat-ms-gym@eszc.de",
      "fax": "0371 44433811",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.eszc.de",
      "traegerTyp": 30,
      "bezugNr": "2b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "de4aac49-6baa-45a0-85ed-01ae41df1fae",
      "creationDate": 1702635596.525,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.525,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 915
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9492516232175,
        50.8532880687338
      ]
    }
  },
  {
    "_id": 128,
    "type": "Feature",
    "properties": {
      "objectId": 128,
      "id": 238,
      "traeger": "Kommunal",
      "strasse": "Scharnhorststraße 2",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Projekt \"WERK-STATT-SCHULE\" (Stadtmission Chemnitz)",
      "kurzbezeichnung": "Projekt \"WERK-STATT-SCHULE\"",
      "telefon": "0371 8205803",
      "email": null,
      "fax": "-",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "2",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": 10,
      "bezugNr": "16",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "c13fc3e2-770b-471d-9b9a-f92999ba18d7",
      "creationDate": 1702635596.493,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.493,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 224
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9574577590282,
        50.8319797356975
      ]
    }
  },
  {
    "_id": 115,
    "type": "Feature",
    "properties": {
      "objectId": 115,
      "id": 81,
      "traeger": "Kommunal",
      "strasse": "Reichsstraße 45",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Friedrich- Fröbel-Schule, Schule mit dem Förderschwerpunkt Lernen",
      "kurzbezeichnung": "F.-Fröbel-Schule",
      "telefon": "0371 381650",
      "email": "fs-froebel@schulen-chemnitz.de",
      "fax": "0371 3816526",
      "typ": 40,
      "art": "Förderschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Deutsch, Mathematik, LRS, Ergotherapie, Motorik/Konzentration",
      "sprachen": " ",
      "www": "https://schuldatenbank.sachsen.de/index.php?id=100&institution_key=4220208",
      "traegerTyp": 10,
      "bezugNr": "5",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "f1c5eb03-08d5-445b-b5cb-b4bdee37c81c",
      "creationDate": 1702635596.384,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.384,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 440
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9068504559025,
        50.835447608084
      ]
    }
  },
  {
    "_id": 138,
    "type": "Feature",
    "properties": {
      "objectId": 138,
      "id": 492,
      "traeger": "Frei",
      "strasse": "Saydaer Straße 21",
      "plz": "09125",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "gruuna Schule gGmbH (Oberschule)",
      "kurzbezeichnung": "gruuna Schule gGmbH (Oberschule)",
      "telefon": "0371 33715680",
      "email": "info@gruuna.schule",
      "fax": "-",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.gruuna.schule",
      "traegerTyp": 30,
      "bezugNr": "32",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "89d1a9ea-1303-4ec6-82cc-6dd9e23c6893",
      "creationDate": 1702635596.571,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.571,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 972
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9352089883882,
        50.7978521601097
      ]
    }
  },
  {
    "_id": 131,
    "type": "Feature",
    "properties": {
      "objectId": 131,
      "id": 499,
      "traeger": "Kommunal",
      "strasse": "Vettersstraße 34",
      "plz": "9126",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Marianne-Brandt-Oberschule",
      "kurzbezeichnung": "Marianne-Brandt-OS",
      "telefon": "0371 33565250",
      "email": "os-mariannebrandt@schulen-chemnitz.de",
      "fax": null,
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": null,
      "bezeichnungZusatz": null,
      "profile": "GTA, Inklusion, jüdischer Religionsunterricht",
      "sprachen": null,
      "www": "https://cms.sachsen.schule/osmariannebrandt/start.html",
      "traegerTyp": 10,
      "bezugNr": null,
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "850b4e0f-f1f3-41af-9ead-7b447b7f3d38",
      "creationDate": 1702635596.509,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.509,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 1360
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9323428892073,
        50.8195696325865
      ]
    }
  },
  {
    "_id": 139,
    "type": "Feature",
    "properties": {
      "objectId": 139,
      "id": 67,
      "traeger": "Kommunal",
      "strasse": "Henriettenstraße 35",
      "plz": "09112",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Dr.-Wilhelm-André-Gymnasium",
      "kurzbezeichnung": "Dr.-Wilhelm-André-Gymnasium",
      "telefon": "0371 382140",
      "email": "gym-andre@schulen-chemnitz.de",
      "fax": "0371 3821424",
      "typ": 30,
      "art": "Gymnasium",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": "GTA, Profil: naturwissenschaftlich, künstlerisch, sportlich, Projekt Art meets Science",
      "sprachen": "1. Englisch, 2. Französisch, Russisch, Latein, Arbeitsgemeinschaft: vertieft Englisch",
      "www": "www.andre.c.sn.schule.de",
      "traegerTyp": 10,
      "bezugNr": "2a",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "b803cef4-a2ed-4999-b2a3-7f1ce203212c",
      "creationDate": 1702635596.571,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.571,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 302
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9024222464489,
        50.8354310560147
      ]
    }
  },
  {
    "_id": 135,
    "type": "Feature",
    "properties": {
      "objectId": 135,
      "id": 358,
      "traeger": "Frei",
      "strasse": "Sandstraße 102",
      "plz": "09114",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Waldorfschule Chemnitz (Oberschule)",
      "kurzbezeichnung": "Waldorfschule (OS)",
      "telefon": "0371 334076-0",
      "email": "info@waldorfschule-chemnitz.de",
      "fax": "0371 334076-99",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.waldorfschule-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "1b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "fbd055f0-4ec9-4f97-aca0-b4e1a6330f04",
      "creationDate": 1702635596.54,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.54,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 904
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.8980267295606,
        50.8620186720013
      ]
    }
  },
  {
    "_id": 134,
    "type": "Feature",
    "properties": {
      "objectId": 134,
      "id": 119,
      "traeger": "Frei",
      "strasse": "Fürstenstraße 147",
      "plz": "09130",
      "ort": "Chemnitz",
      "leistungen": null,
      "bezeichnung": "Montessori-Schule Chemnitz - Freie integrative Schule -Oberschule-",
      "kurzbezeichnung": "Montessori-Schule (OS)",
      "telefon": "0371 2804228",
      "email": "sekundarstufe@montessoriverein-chemnitz.de",
      "fax": "0371 4323376",
      "typ": 20,
      "art": "Oberschule",
      "standortTyp": "1",
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": "www.montessori-chemnitz.de",
      "traegerTyp": 30,
      "bezugNr": "3b",
      "gebietsArtNummer": 0,
      "nummer": 0,
      "globalId": "7f05dee2-776f-4c1b-977a-89c0be6e851c",
      "creationDate": 1702635596.54,
      "creator": "GISAdminChemnitz",
      "editDate": 1702635596.54,
      "editor": "GISAdminChemnitz",
      "barrierefrei": null,
      "integrativ": null,
      "snummer": 924
    },
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9591959229599,
        50.8338112912545
      ]
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|schools|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|integer¦null|true|none||none|
|» type|string|true|none||none|
|» properties|object|true|none||none|
|»» objectId|integer|true|none||none|
|»» id|integer|true|none||none|
|»» traeger|string|true|none||none|
|»» strasse|string|true|none||none|
|»» plz|string|true|none||none|
|»» ort|string|true|none||none|
|»» leistungen|string¦null|false|none||none|
|»» bezeichnung|string¦null|false|none||none|
|»» kurzbezeichnung|string¦null|false|none||none|
|»» telefon|string¦null|false|none||none|
|»» email|string¦null|false|none||none|
|»» fax|string¦null|false|none||none|
|»» typ|integer¦null|false|none||none|
|»» art|string¦null|false|none||none|
|»» standortTyp|string¦null|false|none||none|
|»» bezeichnungZusatz|string¦null|false|none||none|
|»» profile|string¦null|false|none||none|
|»» sprachen|string¦null|false|none||none|
|»» www|string¦null|false|none||none|
|»» traegerTyp|integer¦null|false|none||none|
|»» bezugNr|string¦null|false|none||none|
|»» gebietsArtNummer|integer¦null|false|none||none|
|»» sNummer|integer¦null|false|none||none|
|»» nummer|integer¦null|false|none||none|
|»» globalId|string¦null|false|none||none|
|»» creationDate|number¦null|false|none||none|
|»» creator|string¦null|false|none||none|
|»» editDate|number¦null|false|none||none|
|»» editor|string¦null|false|none||none|
|»» barrierefrei|integer¦null|false|none||none|
|»» integrativ|integer¦null|false|none||none|
|» geometry|object|true|none||none|
|»» type|string|true|none||none|
|»» coordinates|[number]|true|none||none|

## GET Find users by status active

GET /api/users/active

> Response Examples

> OK

```json
[
  {
    "_id": "664e32ef78d5667804355570",
    "email": "hafiz.tu@gmail.com",
    "status": "active",
    "favoriteFacility": {
      "_id": 6,
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          12.8850807101631,
          50.805262135884
        ]
      },
      "properties": {
        "objectId": 6,
        "id": 6,
        "traeger": "Kommunal",
        "strasse": "Straße Usti nad Labem 279",
        "plz": "09119",
        "ort": "Chemnitz",
        "leistungen": null,
        "bezeichnung": "Dr.-Salvador-Allende-Grundschule",
        "kurzbezeichnung": "Dr.-Salvador-Allende-GS",
        "telefon": "0371 271210",
        "email": "gs-allende@schulen-chemnitz.de",
        "fax": "0371 27121220",
        "typ": 10,
        "art": "Grundschule",
        "standortTyp": "1",
        "bezeichnungZusatz": null,
        "profile": "GTA, Hort, Stützpunktschule zur Integration von Schülern mit Sprachauffälligkeiten, Inklusion",
        "sprachen": null,
        "www": "www.allende-gs.de",
        "traegerTyp": 10,
        "bezugNr": "6",
        "gebietsArtNummer": 40,
        "nummer": 1102,
        "globalId": "4ba24609-dba2-47a9-9b63-a37ec81a8712",
        "creationDate": 1702635595.525,
        "creator": "GISAdminChemnitz",
        "editDate": 1702635595.525,
        "editor": "GISAdminChemnitz",
        "barrierefrei": null,
        "integrativ": null,
        "snummer": null
      },
      "category": null
    },
    "homeAddress": {
      "name": "49, Wasserschänkenstraße, Röhrsdorf, Chemnitz, Saxony, 09247, Germany",
      "placeId": "147130489",
      "coordinates": [
        50.870092406318406,
        12.823128715189542
      ]
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|string|true|none||none|
|» email|string|true|none||none|
|» status|string|true|none||none|
|» favoriteFacility|object|true|none||none|
|»» _id|integer|true|none||none|
|»» type|string|true|none||none|
|»» geometry|object|true|none||none|
|»»» type|string|true|none||none|
|»»» coordinates|[number]|true|none||none|
|»» properties|object|true|none||none|
|»»» objectId|integer|true|none||none|
|»»» id|integer|true|none||none|
|»»» traeger|string|true|none||none|
|»»» strasse|string|true|none||none|
|»»» plz|string|true|none||none|
|»»» ort|string|true|none||none|
|»»» leistungen|string¦null|false|none||none|
|»»» bezeichnung|string¦null|false|none||none|
|»»» kurzbezeichnung|string¦null|false|none||none|
|»»» telefon|string¦null|false|none||none|
|»»» email|string¦null|false|none||none|
|»»» fax|string¦null|false|none||none|
|»»» typ|integer¦null|false|none||none|
|»»» art|string¦null|false|none||none|
|»»» standortTyp|string¦null|false|none||none|
|»»» bezeichnungZusatz|string¦null|false|none||none|
|»»» profile|string¦null|false|none||none|
|»»» sprachen|string¦null|false|none||none|
|»»» www|string¦null|false|none||none|
|»»» traegerTyp|integer¦null|false|none||none|
|»»» bezugNr|string¦null|false|none||none|
|»»» gebietsArtNummer|integer¦null|false|none||none|
|»»» nummer|integer¦null|false|none||none|
|»»» globalId|string¦null|false|none||none|
|»»» creationDate|number¦null|false|none||none|
|»»» creator|string¦null|false|none||none|
|»»» editDate|number¦null|false|none||none|
|»»» editor|string¦null|false|none||none|
|»»» barrierefrei|integer¦null|false|none||none|
|»»» integrativ|integer¦null|false|none||none|
|»»» snummer|integer¦null|false|none||none|
|»» category|string|false|none||none|
|» homeAddress|object|true|none||none|
|»» name|string|true|none||none|
|»» placeId|string|true|none||none|
|»» coordinates|[number]|true|none||none|

## GET Find users by status deleted

GET /api/users/deleted

> Response Examples

> OK

```json
[
  {
    "_id": "665046ad938c6530788d5ba8",
    "email": "hafiz.tu@gmail.com",
    "status": "deleted",
    "favoriteFacility": {
      "_id": 10,
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          12.9579160646245,
          50.8524832484522
        ]
      },
      "properties": {
        "objectId": 10,
        "id": 10,
        "traeger": "Stadtmission Chemnitz e. V.",
        "strasse": "Dresdner Straße 214",
        "plz": "09131",
        "ort": "Chemnitz",
        "leistungen": "arbeitsweltbezogene Jugendsozialarbeit",
        "bezeichnung": null,
        "kurzbezeichnung": null,
        "telefon": "0371  45200449",
        "email": null,
        "fax": null,
        "typ": null,
        "art": null,
        "standortTyp": null,
        "bezeichnungZusatz": null,
        "profile": null,
        "sprachen": null,
        "www": null,
        "traegerTyp": null,
        "bezugNr": null,
        "gebietsArtNummer": null,
        "nummer": null,
        "globalId": null,
        "creationDate": null,
        "creator": null,
        "editDate": null,
        "editor": null,
        "barrierefrei": null,
        "integrativ": null,
        "snummer": null
      },
      "category": "social-teenager-project"
    },
    "homeAddress": {
      "name": "49, Wasserschänkenstraße, Röhrsdorf, Chemnitz, Saxony, 09247, Germany",
      "placeId": "147130489",
      "coordinates": [
        50.870092406318406,
        12.823128715189542
      ]
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|string|true|none||none|
|» email|string|true|none||none|
|» status|string|true|none||none|
|» favoriteFacility|object|true|none||none|
|»» _id|integer|true|none||none|
|»» type|string|true|none||none|
|»» geometry|object|true|none||none|
|»»» type|string|true|none||none|
|»»» coordinates|[number]|true|none||none|
|»» properties|object|true|none||none|
|»»» objectId|integer|true|none||none|
|»»» id|integer|true|none||none|
|»»» traeger|string|true|none||none|
|»»» strasse|string|true|none||none|
|»»» plz|string|true|none||none|
|»»» ort|string|true|none||none|
|»»» leistungen|string¦null|false|none||none|
|»»» bezeichnung|string¦null|false|none||none|
|»»» kurzbezeichnung|string¦null|false|none||none|
|»»» telefon|string¦null|false|none||none|
|»»» email|string¦null|false|none||none|
|»»» fax|string¦null|false|none||none|
|»»» typ|integer¦null|false|none||none|
|»»» art|string¦null|false|none||none|
|»»» standortTyp|string¦null|false|none||none|
|»»» bezeichnungZusatz|string¦null|false|none||none|
|»»» profile|string¦null|false|none||none|
|»»» sprachen|string¦null|false|none||none|
|»»» www|string¦null|false|none||none|
|»»» traegerTyp|integer¦null|false|none||none|
|»»» bezugNr|string¦null|false|none||none|
|»»» gebietsArtNummer|integer¦null|false|none||none|
|»»» nummer|integer¦null|false|none||none|
|»»» globalId|string¦null|false|none||none|
|»»» creationDate|number¦null|false|none||none|
|»»» creator|string¦null|false|none||none|
|»»» editDate|number¦null|false|none||none|
|»»» editor|string¦null|false|none||none|
|»»» barrierefrei|integer¦null|false|none||none|
|»»» integrativ|integer¦null|false|none||none|
|»»» snummer|integer¦null|false|none||none|
|»» category|string|false|none||none|
|» homeAddress|object|true|none||none|
|»» name|string|true|none||none|
|»» placeId|string|true|none||none|
|»» coordinates|[number]|true|none||none|

## PUT Update an existing user

PUT /api/users

> Body Parameters

```json
{
  "_id": "665046ad938c6530788d5ba8",
  "email": "hafiz.t@gmail.com",
  "status": "active",
  "oldPassword": "password",
  "newPassword": "password",
  "favoriteFacility": {
    "_id": 10,
    "type": "Feature",
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9579160646245,
        50.8524832484522
      ]
    },
    "properties": {
      "objectId": 10,
      "id": 10,
      "traeger": "Stadtmission Chemnitz e. V.",
      "strasse": "Dresdner Straße 214",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": "arbeitsweltbezogene Jugendsozialarbeit",
      "bezeichnung": null,
      "kurzbezeichnung": null,
      "telefon": "0371  45200449",
      "email": null,
      "fax": null,
      "typ": null,
      "art": null,
      "standortTyp": null,
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": null,
      "bezugNr": null,
      "gebietsArtNummer": null,
      "nummer": null,
      "globalId": null,
      "creationDate": null,
      "creator": null,
      "editDate": null,
      "editor": null,
      "barrierefrei": null,
      "integrativ": null,
      "snummer": null
    },
    "category": "social-teenager-project"
  },
  "homeAddress": {
    "name": "49, Wasserschänkenstraße, Röhrsdorf, Chemnitz, Saxony, 09247, Germany",
    "placeId": "147130489",
    "coordinates": [
      50.870092406318406,
      12.823128715189542
    ]
  }
}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| no |none|
|» _id|body|string| yes |none|
|» email|body|string| yes |none|
|» favoriteFacility|body|object| yes |none|
|»» _id|body|integer| yes |none|
|»» type|body|string| yes |none|
|»» properties|body|object| yes |none|
|»»» objectId|body|integer| yes |none|
|»»» id|body|integer| yes |none|
|»»» traeger|body|string| yes |none|
|»»» strasse|body|string| yes |none|
|»»» plz|body|string| yes |none|
|»»» ort|body|string| yes |none|
|»»» leistungen|body|null| yes |none|
|»»» bezeichnung|body|string| yes |none|
|»»» kurzbezeichnung|body|string| yes |none|
|»»» telefon|body|string| yes |none|
|»»» email|body|string| yes |none|
|»»» fax|body|string| yes |none|
|»»» typ|body|integer| yes |none|
|»»» art|body|string| yes |none|
|»»» standortTyp|body|string| yes |none|
|»»» bezeichnungZusatz|body|null| yes |none|
|»»» profile|body|string| yes |none|
|»»» sprachen|body|null| yes |none|
|»»» www|body|string| yes |none|
|»»» traegerTyp|body|integer| yes |none|
|»»» bezugNr|body|string| yes |none|
|»»» gebietsArtNummer|body|integer| yes |none|
|»»» nummer|body|integer| yes |none|
|»»» globalId|body|string| yes |none|
|»»» creationDate|body|number| yes |none|
|»»» creator|body|string| yes |none|
|»»» editDate|body|number| yes |none|
|»»» editor|body|string| yes |none|
|»»» barrierefrei|body|null| yes |none|
|»»» integrativ|body|null| yes |none|
|»»» snummer|body|integer| yes |none|
|»» geometry|body|object| yes |none|
|»»» type|body|string| yes |none|
|»»» coordinates|body|[number]| yes |none|
|» homeAddress|body|object| yes |none|
|»» name|body|string| yes |none|
|»» placeId|body|string| yes |none|
|»» coordinates|body|[number]| yes |none|

> Response Examples

> OK

```json
{
  "_id": "665046ad938c6530788d5ba8",
  "email": "hafiz.tu@gmail.com",
  "status": "active",
  "favoriteFacility": {
    "_id": 10,
    "type": "Feature",
    "geometry": {
      "type": "Point",
      "coordinates": [
        12.9579160646245,
        50.8524832484522
      ]
    },
    "properties": {
      "objectId": 10,
      "id": 10,
      "traeger": "Stadtmission Chemnitz e. V.",
      "strasse": "Dresdner Straße 214",
      "plz": "09131",
      "ort": "Chemnitz",
      "leistungen": "arbeitsweltbezogene Jugendsozialarbeit",
      "bezeichnung": null,
      "kurzbezeichnung": null,
      "telefon": "0371  45200449",
      "email": null,
      "fax": null,
      "typ": null,
      "art": null,
      "standortTyp": null,
      "bezeichnungZusatz": null,
      "profile": null,
      "sprachen": null,
      "www": null,
      "traegerTyp": null,
      "bezugNr": null,
      "gebietsArtNummer": null,
      "nummer": null,
      "globalId": null,
      "creationDate": null,
      "creator": null,
      "editDate": null,
      "editor": null,
      "barrierefrei": null,
      "integrativ": null,
      "snummer": null
    },
    "category": "social-teenager-project"
  },
  "homeAddress": {
    "name": "49, Wasserschänkenstraße, Röhrsdorf, Chemnitz, Saxony, 09247, Germany",
    "placeId": "147130489",
    "coordinates": [
      50.870092406318406,
      12.823128715189542
    ]
  }
}
```

> Incorrect password

```json
{
  "timestamp": 1716532110864,
  "status": 400,
  "error": "Bad Request",
  "trace": "org.springframework.web.server.ResponseStatusException: 400 BAD_REQUEST \"Incorrect password\"\n\tat com.chemnitz.youthconnect.services.UserService.updateUser(UserService.kt:30)\n\tat com.chemnitz.youthconnect.controllers.UserController.updateUser(UserController.kt:36)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method.callMethod(CallerImpl.kt:97)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance.call(CallerImpl.kt:113)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callDefaultMethod$kotlin_reflection(KCallableImpl.kt:207)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callBy(KCallableImpl.kt:112)\n\tat org.springframework.web.method.support.InvocableHandlerMethod$KotlinDelegate.invokeFunction(InvocableHandlerMethod.java:334)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:188)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:926)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:831)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014)\n\tat org.springframework.web.servlet.FrameworkServlet.doPut(FrameworkServlet.java:925)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:593)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:206)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:482)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:391)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1736)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\n",
  "message": "Incorrect password",
  "path": "/api/users"
}
```

> User Not Found

```json
{
  "timestamp": 1716490145359,
  "status": 404,
  "error": "Not Found",
  "trace": "org.springframework.web.server.ResponseStatusException: 404 NOT_FOUND \"User with ID 664e32ef78d566780435557 not found\"\n\tat com.chemnitz.youthconnect.services.UserService.updateUser(UserService.kt:24)\n\tat com.chemnitz.youthconnect.controllers.UserController.updateUser(UserController.kt:48)\n\tat jdk.internal.reflect.GeneratedMethodAccessor84.invoke(Unknown Source)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method.callMethod(CallerImpl.kt:97)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance.call(CallerImpl.kt:113)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callDefaultMethod$kotlin_reflection(KCallableImpl.kt:207)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callBy(KCallableImpl.kt:112)\n\tat org.springframework.web.method.support.InvocableHandlerMethod$KotlinDelegate.invokeFunction(InvocableHandlerMethod.java:334)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:188)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:926)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:831)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014)\n\tat org.springframework.web.servlet.FrameworkServlet.doPut(FrameworkServlet.java:925)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:593)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:206)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:482)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:391)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1736)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63)\n\tat java.base/java.lang.Thread.run(Thread.java:833)\n",
  "message": "User with ID 664e32ef78d566780435557 not found",
  "path": "/api/users"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Incorrect password|Inline|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|User Not Found|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|string|true|none||none|
|» email|string|true|none||none|
|» status|string|true|none||none|
|» favoriteFacility|object|true|none||none|
|»» _id|integer|true|none||none|
|»» type|string|true|none||none|
|»» geometry|object|true|none||none|
|»»» type|string|true|none||none|
|»»» coordinates|[number]|true|none||none|
|»» properties|object|true|none||none|
|»»» objectId|integer|true|none||none|
|»»» id|integer|true|none||none|
|»»» traeger|string|true|none||none|
|»»» strasse|string|true|none||none|
|»»» plz|string|true|none||none|
|»»» ort|string|true|none||none|
|»»» leistungen|string|true|none||none|
|»»» bezeichnung|null|true|none||none|
|»»» kurzbezeichnung|null|true|none||none|
|»»» telefon|string|true|none||none|
|»»» email|null|true|none||none|
|»»» fax|null|true|none||none|
|»»» typ|null|true|none||none|
|»»» art|null|true|none||none|
|»»» standortTyp|null|true|none||none|
|»»» bezeichnungZusatz|null|true|none||none|
|»»» profile|null|true|none||none|
|»»» sprachen|null|true|none||none|
|»»» www|null|true|none||none|
|»»» traegerTyp|null|true|none||none|
|»»» bezugNr|null|true|none||none|
|»»» gebietsArtNummer|null|true|none||none|
|»»» nummer|null|true|none||none|
|»»» globalId|null|true|none||none|
|»»» creationDate|null|true|none||none|
|»»» creator|null|true|none||none|
|»»» editDate|null|true|none||none|
|»»» editor|null|true|none||none|
|»»» barrierefrei|null|true|none||none|
|»»» integrativ|null|true|none||none|
|»»» snummer|null|true|none||none|
|»» category|string|true|none||none|
|» homeAddress|object|true|none||none|
|»» name|string|true|none||none|
|»» placeId|string|true|none||none|
|»» coordinates|[number]|true|none||none|

HTTP Status Code **400**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» timestamp|integer|true|none||none|
|» status|integer|true|none||none|
|» error|string|true|none||none|
|» trace|string|true|none||none|
|» message|string|true|none||none|
|» path|string|true|none||none|

HTTP Status Code **404**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» timestamp|integer|true|none||none|
|» status|integer|true|none||none|
|» error|string|true|none||none|
|» trace|string|true|none||none|
|» message|string|true|none||none|
|» path|string|true|none||none|

## DELETE Delete an existing user

DELETE /api/users/665046ad938c6530788d5ba

> Response Examples

> No Content

```json
null
```

```json
{
  "timestamp": 1716537175636,
  "status": 404,
  "error": "Not Found",
  "trace": "org.springframework.web.server.ResponseStatusException: 404 NOT_FOUND \"User with ID 665046ad938c6530788d5ba not found\"\n\tat com.chemnitz.youthconnect.services.UserService.deleteUser$lambda$1(UserService.kt:40)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:403)\n\tat com.chemnitz.youthconnect.services.UserService.deleteUser(UserService.kt:39)\n\tat com.chemnitz.youthconnect.controllers.UserController.deleteUser(UserController.kt:41)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method.callMethod(CallerImpl.kt:97)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance.call(CallerImpl.kt:113)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callDefaultMethod$kotlin_reflection(KCallableImpl.kt:207)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callBy(KCallableImpl.kt:112)\n\tat org.springframework.web.method.support.InvocableHandlerMethod$KotlinDelegate.invokeFunction(InvocableHandlerMethod.java:334)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:188)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:926)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:831)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014)\n\tat org.springframework.web.servlet.FrameworkServlet.doDelete(FrameworkServlet.java:936)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:596)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:206)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:482)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:391)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1736)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\n",
  "message": "User with ID 665046ad938c6530788d5ba not found",
  "path": "/api/users/665046ad938c6530788d5ba"
}
```

> Record Not Found

```json
{
  "timestamp": 1716537175636,
  "status": 404,
  "error": "Not Found",
  "trace": "org.springframework.web.server.ResponseStatusException: 404 NOT_FOUND \"User with ID 665046ad938c6530788d5ba not found\"\n\tat com.chemnitz.youthconnect.services.UserService.deleteUser$lambda$1(UserService.kt:40)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:403)\n\tat com.chemnitz.youthconnect.services.UserService.deleteUser(UserService.kt:39)\n\tat com.chemnitz.youthconnect.controllers.UserController.deleteUser(UserController.kt:41)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method.callMethod(CallerImpl.kt:97)\n\tat kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance.call(CallerImpl.kt:113)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callDefaultMethod$kotlin_reflection(KCallableImpl.kt:207)\n\tat kotlin.reflect.jvm.internal.KCallableImpl.callBy(KCallableImpl.kt:112)\n\tat org.springframework.web.method.support.InvocableHandlerMethod$KotlinDelegate.invokeFunction(InvocableHandlerMethod.java:334)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:188)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:926)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:831)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014)\n\tat org.springframework.web.servlet.FrameworkServlet.doDelete(FrameworkServlet.java:936)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:596)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:206)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:175)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:150)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:482)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:391)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:896)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1736)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\n",
  "message": "User with ID 665046ad938c6530788d5ba not found",
  "path": "/api/users/665046ad938c6530788d5ba"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|204|[No Content](https://tools.ietf.org/html/rfc7231#section-6.3.5)|No Content|undefined|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Record Not Found|Inline|

### Responses Data Schema

HTTP Status Code **404**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» timestamp|integer|true|none||none|
|» status|integer|true|none||none|
|» error|string|true|none||none|
|» trace|string|true|none||none|
|» message|string|true|none||none|
|» path|string|true|none||none|

## POST Login an existing user

POST /api/auth/login

> Body Parameters

```json
{
  "email": "hafiz.tu@gmail.com",
  "password": "password"
}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| no |none|
|» email|body|string| yes |none|
|» password|body|string| yes |none|

> Response Examples

> OK

```json
{
  "message": "success"
}
```

> Bad Request

```json
{
  "message": "user not found!"
}
```

```json
{
  "message": "invalid password!"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|
|400|[Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1)|Bad Request|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» message|string|true|none||none|

HTTP Status Code **400**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» message|string|true|none||none|

## GET FInd authenticated user details

GET /api/auth/user

> Body Parameters

```json
{
  "email": "string",
  "password": "string"
}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| no |none|
|» email|body|string| yes |none|
|» password|body|string| yes |none|

> Response Examples

> OK

```json
{
  "_id": "664e32ef78d5667804355570",
  "email": "hafiz.tu@gmail.com",
  "status": "active",
  "favoriteFacility": null,
  "homeAddress": null
}
```

> 401 Response

```json
{
  "message": "string"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|
|401|[Unauthorized](https://tools.ietf.org/html/rfc7235#section-3.1)|Unauthorized|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|string|true|none||none|
|» email|string|true|none||none|
|» status|string|true|none||none|
|» favoriteFacility|null|true|none||none|
|» homeAddress|null|true|none||none|

HTTP Status Code **401**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» message|string|true|none||none|

## POST Register a new user 

POST /api/auth/register

> Body Parameters

```json
{
  "email": "hafiz.tu@gmail.com",
  "password": "password",
  "favoriteFacility": null,
  "homeAddress": null
}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| no |none|
|» email|body|string| yes |none|
|» password|body|string| yes |none|
|» favoriteFacility|body|null| yes |none|
|» homeAddress|body|null| yes |none|

> Response Examples

> OK

```json
{
  "_id": "664f90056b539814fda11a00",
  "email": "hafiz.tu@gmail.com",
  "status": "active",
  "favoriteFacility": null,
  "homeAddress": null
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» _id|string|true|none||none|
|» email|string|true|none||none|
|» status|string|true|none||none|
|» favoriteFacility|null|true|none||none|
|» homeAddress|null|true|none||none|

## POST Logout the current user

POST /api/auth/logout

> Body Parameters

```json
{}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| no |none|

> Response Examples

> OK

```json
{
  "message": "success"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» message|string|true|none||none|

# Data Schema

