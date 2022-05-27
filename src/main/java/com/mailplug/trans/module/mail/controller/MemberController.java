package com.mailplug.trans.module.mail.controller;

import com.mailplug.trans.module.mail.domain.Member;
import com.mailplug.trans.module.mail.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/trans/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public List<Member> getMemberList() {

        return memberService.getMemberList();
    }

}
