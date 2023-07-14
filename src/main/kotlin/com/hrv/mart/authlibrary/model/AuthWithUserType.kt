package com.hrv.mart.authlibrary.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class AuthWithUserType (
    val userId: String,
    val userType: UserType
) {
    companion object {
        fun parseFrom (auth: AppWriteAuth, userType: UserType) =
            AuthWithUserType(
                userId = auth.userId,
                userType = userType
            )
    }
}