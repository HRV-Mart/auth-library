package com.hrv.mart.authlibrary.model

import com.hrv.mart.userlibrary.model.User

data class Auth (
    val createdAt: String,
    val updatedAt: String,
    val name: String,
    val email: String,
    val emailVerification: Boolean,
    val userType: UserType = UserType.USER
) {
    fun toUser() =
        User(
            emailId = email,
            name = name
        )
}