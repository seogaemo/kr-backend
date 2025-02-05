package com.seogaemo.kr.domain.member.domain

import jakarta.persistence.*

// JPA 설정
@Entity
@Table(name = "member")

// 코틀린에서는 생성자 매개변수로 선언된 변수는 알아서 클래스 속성으로 선언된대
class Member (
    // ID 설정 (필수)
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @Column(name = "email")
    val email: String? = null,
)