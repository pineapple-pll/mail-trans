package com.mailplug.trans.module.mail.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "mail_box")
public class MailBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mail_box_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mail_user_id")
    private MailUser mailUser;

    private String mailBoxName; //기존 메일박스 이름

    private int mailplugMailBoxId; // 변경된 메일박스 id
}
