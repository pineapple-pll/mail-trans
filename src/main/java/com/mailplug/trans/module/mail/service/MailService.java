package com.mailplug.trans.module.mail.service;

import com.mailplug.trans.module.mail.dao.member.MailRepository;
import com.mailplug.trans.module.mail.domain.MailUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MailService {

    private final MailRepository memberRepository;

    public List<MailUser> getMemberList() {

        return memberRepository.findAll();

    }
}
