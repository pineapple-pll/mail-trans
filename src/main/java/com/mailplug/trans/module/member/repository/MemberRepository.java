package com.mailplug.trans.module.member.repository;


import com.mailplug.trans.module.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findAll();

    List<Member> findByName(String memberId);

    Member findByMemberId(String memberId);
}
