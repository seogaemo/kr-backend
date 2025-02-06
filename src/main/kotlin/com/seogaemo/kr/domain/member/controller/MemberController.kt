package com.seogaemo.kr.domain.member.controller

import com.seogaemo.kr.domain.member.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController(
    private val memberService: MemberService
) {
    @GetMapping("/{id}")
    // RequestParam 은 query string
    fun getMember (@PathVariable(required = true) id: String) = memberService.getMember(id)
}