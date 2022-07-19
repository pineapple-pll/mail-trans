package com.mailplug.trans.module.member.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mailplug.trans.module.member.dto.request.signupMember;
import com.mailplug.trans.module.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/trans/members")
public class MemberController {

    private final MemberService memberService;

    @Value("${pineapple.authServer}")
    private String authServer;

//    @Autowired
//    private ObjectMapper objectMapper;

//    @GetMapping
//    public List<User> getMemberList() {
//
//        return memberService.getMemberList();
//    }

    @GetMapping("/signup")
    public String signup() {
        return "page-register";
    }

//    @PostMapping("/signup")
//    public String signupPost(signupMember member, Model model) throws JsonProcessingException {


        // auth-server가 따로 rest api로 있을 때 요청하는 방법
        // 헤더설정
//        org.springframework.http.HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
//
//        // Object Mapper를 통한 JSON 바인딩
//        String entityBody = objectMapper.writeValueAsString(member);
//
//        // HttpEntity에 헤더 및 params 설정
//        HttpEntity entity = new HttpEntity(entityBody, httpHeaders);
//
//        // RestTemplate의 exchange 메서드를 통해 URL에 HttpEntity와 함께 요청
//        StringBuilder sb = new StringBuilder();
//        RestTemplate restTemplate = new RestTemplate();
//        String loginUrl =  "/auth/members/signup";
//        sb.append(authServer).append(loginUrl);
//
//        ResponseEntity<String> responseEntity = restTemplate.exchange(sb.toString(), HttpMethod.POST, entity, String.class);
//        return "page-register";
//    }

}
