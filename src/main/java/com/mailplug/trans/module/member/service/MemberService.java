package com.mailplug.trans.module.member.service;

import com.mailplug.trans.module.member.dao.member.UserRepository;
import com.mailplug.trans.module.member.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final UserRepository userRepository;

    public List<User> getMemberList() {

        return userRepository.findAll();

    }
}
