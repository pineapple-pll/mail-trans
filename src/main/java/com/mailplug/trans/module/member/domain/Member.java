package com.mailplug.trans.module.member.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name="member")
@RequiredArgsConstructor

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mb_userid")
    private String memberId;
    @NotEmpty
    private String name;
    private String active;
    private String password;

    @Builder(builderClassName = "SignUpBuilder", builderMethodName = "SignUpBuilder")
    public Member(String memberId, @NotEmpty String name, String active, String password) {
        this.memberId = memberId;
        this.name = name;
        this.active = active;
        this.password = password;
    }
}
