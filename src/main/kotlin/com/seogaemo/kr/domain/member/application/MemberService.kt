package com.seogaemo.kr.domain.member.application

import com.seogaemo.kr.domain.member.dao.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService (
    private val memberRepository: MemberRepository
) {
    fun getMember(id: String) = memberRepository.findById(id)
}
