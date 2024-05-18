package com.chemnitz.youthconnect.models

import org.springframework.data.mongodb.core.mapping.Field

data class Geometry(
    @Field("type")
    val type: String,

    @Field("coordinates")
    val coordinates: List<Double>
)
