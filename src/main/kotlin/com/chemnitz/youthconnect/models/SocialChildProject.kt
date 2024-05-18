package com.chemnitz.youthconnect.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "social_child_projects")
data class SocialChildProject(
    @Id
    val _id: Int? = null,

    @Field("type")
    val type: String,

    @Field("properties")
    val properties: SocialChildProjectProperties,

    @Field("geometry")
    val geometry: Geometry
)

data class SocialChildProjectProperties(
    @Field("OBJECTID")
    val objectId: Int,

    @Field("ID")
    val id: Int,

    @Field("TRAEGER")
    val traeger: String,

    @Field("LEISTUNGEN")
    val leistungen: String,

    @Field("BEZEICHNUNG")
    val bezeichnung: String?,

    @Field("KURZBEZEICHNUNG")
    val kurzbezeichnung: String?,

    @Field("STRASSE")
    val strasse: String,

    @Field("PLZ")
    val plz: String,

    @Field("ORT")
    val ort: String,

    @Field("TELEFON")
    val telefon: String?,

    @Field("EMAIL")
    val email: String?,

    @Field("FAX")
    val fax: String?
)
