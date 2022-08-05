package com.mailplug.trans.module.mail.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mail_user")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MailUser {

    @Id
    @Column(name = "mail_user_id")
    private String id; //기존 id (숫자 or 메일계정)

    private String accountId;

    private String name;

    @OneToMany(mappedBy = "mailUser")
    private List<Mail> mailList = new ArrayList<>();

    @OneToMany(mappedBy = "mailUser")
    private List<MailBox> mailBoxList = new ArrayList<>();
}
