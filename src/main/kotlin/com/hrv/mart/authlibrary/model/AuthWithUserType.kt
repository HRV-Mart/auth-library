package com.hrv.mart.authlibrary.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class AuthWithUserType (
    val userId: String,
    val userType: UserType
)