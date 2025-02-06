package com.seogaemo.kr.domain.auth.dto.request

data class AuthenticationRequest(
    val email: String,
    val password: String
)