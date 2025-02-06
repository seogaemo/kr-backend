package com.seogaemo.kr.domain.member.repository

import com.seogaemo.kr.domain.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

// jpa 가 JpaRepository 를 찾아서 인터페이스를 런타임 때 자동으로 CRUD 가 생성된대
// 2번째 제네릭은 ID 타입임
interface MemberRepository : JpaRepository<Member, String>
