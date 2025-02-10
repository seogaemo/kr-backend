package com.seogaemo.kr.domain.auth.dto.response

data class JsonWebTokenResponse(
    val accessToken: String,
    val refreshToken: String
)