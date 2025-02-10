package com.seogaemo.kr.domain.auth.controller

import com.seogaemo.kr.domain.auth.dto.request.SigninRequest
import com.seogaemo.kr.domain.auth.dto.response.JsonWebTokenResponse
import com.seogaemo.kr.domain.auth.dto.response.RefreshTokenRequest
import com.seogaemo.kr.domain.auth.service.SigninService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/signin")
class SigninController(private val signinService: SigninService) {

    @PostMapping("")
    fun auth(@RequestBody request: SigninRequest): ResponseEntity<JsonWebTokenResponse> {
        val jsonWebTokenResponse = signinService.auth(request)
        return ResponseEntity.ok(jsonWebTokenResponse)
    }

    @PostMapping("/refresh")
    fun refresh(@RequestBody request: RefreshTokenRequest): ResponseEntity<JsonWebTokenResponse> {
        val jsonWebTokenResponse = signinService.refresh(request.refreshToken)
        return ResponseEntity.ok(jsonWebTokenResponse)
    }
}