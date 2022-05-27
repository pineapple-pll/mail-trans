package com.mailplug.trans.module.mail.dao.member;


import com.mailplug.trans.module.mail.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {


}
