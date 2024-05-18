package com.chemnitz.youthconnect.models

import Properties
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Document(collection = "users")
data class User(
    @Id
    val _id: String? = null,

    @Field("email")
    val email: String,

    @Field("password")
    private var _password: String? = null, // Password field made optional

    @Field("status")
    var status: String = "active",

    @Field("favoriteFacility")
    var favoriteFacility: FavoriteFacility? = null,

    @Field("homeAddress")
    var homeAddress: HomeAddress? = null
) {
    // Constructor to initialize email and password
    constructor(email: String, password: String) : this(null, email, password, "active", null, null)

    // Function to compare provided password with hashed password
    fun comparePassword(plainTextPassword: String): Boolean {
        return BCryptPasswordEncoder().matches(plainTextPassword, _password)
    }
}

data class FavoriteFacility(
    @Field("_id")
    val _id: Int,
    @Field("type")
    val type: String,
    @Field("geometry")
    val geometry: Geometry?,
    @Field("properties")
    val properties: Properties?,
    @Field("category")
    val category: String?
)

data class HomeAddress(
    @Field("street")
    val street: String?,

    @Field("city")
    val city: String?,

    @Field("zipCode")
    val zipCode: String?,

    @Field("coordinates")
    val coordinates: List<Double>
)