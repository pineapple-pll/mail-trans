package com.mailplug.trans.module.member.dao.member;


import com.mailplug.trans.module.member.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}
