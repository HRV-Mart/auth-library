package com.hrv.mart.authlibrary.repository

import com.hrv.mart.apicall.APICaller
import com.hrv.mart.authlibrary.model.AuthRequest
import com.hrv.mart.authlibrary.model.AuthResponse
import com.hrv.mart.authlibrary.model.UserType
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.stereotype.Repository
import org.springframework.web.reactive.function.client.WebClient

@Repository
class AuthRepository(
    @Value("\${hrv.mart.auth.url}")
    private val authServerUrl: String
)
{
    private val webClientBuilder = WebClient.builder()
    private val apiCall = APICaller(webClientBuilder)

    fun createAdminAuth(jwt: String, response: ServerHttpResponse) =
        createAuth(AuthRequest(jwt, UserType.ADMIN), response)
    fun createUserAuth(jwt: String, response: ServerHttpResponse) =
        createAuth(AuthRequest(jwt, UserType.USER), response)
    private fun createAuth(authRequest: AuthRequest, response: ServerHttpResponse) =
        apiCall
            .postRequest(authServerUrl, AuthResponse::class.java, authRequest, response)
}
