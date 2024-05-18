package com.chemnitz.youthconnect.dtos

data class UserUpdateDTO(
    val _id: String,
    val email: String,
    val favoriteFacility: FavoriteFacilityDTO,
    val homeAddress: HomeAddressDTO?
)

data class FavoriteFacilityDTO(
    val _id: Int,
    val type: String,
    val properties: FacilityPropertiesDTO,
    val geometry: GeometryDTO
)

data class FacilityPropertiesDTO(
    val objectId: Int,
    val id: Int,
    val traeger: String,
    val leistungen: String,
    val bezeichnung: String?,
    val kurzbezeichnung: String?,
    val strasse: String,
    val plz: String,
    val ort: String,
    val telefon: String,
    val email: String?,
    val fax: String?
)

data class GeometryDTO(
    val type: String,
    val coordinates: List<Double>
)

data class HomeAddressDTO(
    val street: String?,
    val city: String?,
    val zipCode: String?,
    val coordinates: List<Double>?
)
