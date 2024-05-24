package com.chemnitz.youthconnect.dtos

import com.chemnitz.youthconnect.models.FavoriteFacility
import com.chemnitz.youthconnect.models.HomeAddress

data class UpdateUserDTO(
    val _id: String? = null,
    val email: String? = null,
    var oldPassword: String? = null,
    var newPassword: String? = null,
    val status: String? = null,
    val favoriteFacility: FavoriteFacility? = null,
    val homeAddress: HomeAddress? = null
)
