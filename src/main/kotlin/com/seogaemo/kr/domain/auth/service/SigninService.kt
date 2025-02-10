package com.seogaemo.kr.domain.auth.service

import com.seogaemo.kr.domain.auth.dto.request.SigninRequest
import com.seogaemo.kr.domain.auth.dto.response.JsonWebTokenResponse
import org.springframework.stereotype.Service

@Service
interface SigninService {
    fun auth(request: SigninRequest): JsonWebTokenResponse
    fun refresh(token: String): JsonWebTokenResponse
}

