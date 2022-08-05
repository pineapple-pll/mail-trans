package com.mailplug.trans.module.mail.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mail")
@Getter
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mail_id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mail_user_id")
    private MailUser mailUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mail_box_id")
    private MailBox mailBox;

    private LocalDateTime mailDate; // 시차계산 필요 x

    private String fileLocation;

    @Enumerated(EnumType.STRING)
    private TransStatus transStatus;
}
