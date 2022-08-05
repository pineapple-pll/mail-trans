package com.mailplug.trans.module.mail.dao.member;


import com.mailplug.trans.module.mail.domain.MailUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<MailUser, String> {
}
