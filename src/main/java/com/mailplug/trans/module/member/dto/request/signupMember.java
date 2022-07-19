package com.mailplug.trans.module.member.dto.request;

import com.mailplug.trans.module.member.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class signupMember {
    private String memberId;
    private String password;
    private String name;
    private Integer age;
    private String gender;
    private String profile;
    private String country;
    private String phone;
    private String email;
    private String active;
    private String address;

//    public User toEntity(String encryptedPassword) {
//    }
}
