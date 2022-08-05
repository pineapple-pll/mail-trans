package com.mailplug.trans.module.mail.controller;

import com.mailplug.trans.module.mail.domain.MailUser;
import com.mailplug.trans.module.mail.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/trans/members")
public class MailController {

    private final MailService mailService;

    @GetMapping
    public List<MailUser> getMemberList() {

        return mailService.getMemberList();
    }

}
