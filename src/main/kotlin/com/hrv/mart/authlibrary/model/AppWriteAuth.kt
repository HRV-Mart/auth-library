package com.hrv.mart.authlibrary.model

import com.hrv.mart.userlibrary.model.User

data class AppWriteAuth (
    val userId: String,
    val createdAt: String,
    val updatedAt: String,
    val name: String,
    val email: String,
    val emailVerification: Boolean
) {
    fun toUser() =
        User(
            emailId = email,
            name = name
        )
}