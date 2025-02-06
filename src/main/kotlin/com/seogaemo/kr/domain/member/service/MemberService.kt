package com.seogaemo.kr.domain.member.service

import com.seogaemo.kr.domain.member.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService (
    private val memberRepository: MemberRepository
) {
    fun getMember(id: String) = memberRepository.findById(id)
}
