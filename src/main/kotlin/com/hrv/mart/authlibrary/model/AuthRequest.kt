package com.hrv.mart.authlibrary.model

data class AuthRequest (
    val jwt: String,
    val userType: UserType = UserType.USER
)