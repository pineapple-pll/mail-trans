package com.mailplug.trans.module.mail.service;

import com.mailplug.trans.module.mail.dao.member.MemberRepository;
import com.mailplug.trans.module.mail.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getMemberList() {

        return memberRepository.findAll();

    }
}
