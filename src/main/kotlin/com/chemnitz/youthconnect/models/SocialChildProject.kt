package com.chemnitz.youthconnect.models

import Properties
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
    val properties: Properties,

    @Field("geometry")
    val geometry: Geometry
)

