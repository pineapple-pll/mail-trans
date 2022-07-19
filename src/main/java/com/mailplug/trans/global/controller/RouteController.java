package com.mailplug.trans.global.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/route")
public class RouteController {

//    private DatabaseMapper databaseMapper;
//
//    public RouteController(DatabaseMapper databaseMapper) {
//        this.databaseMapper = databaseMapper;
//    }
//
//    @GetMapping("/a")
//    public String getA(HttpSession session) {
//        session.setAttribute("db_key","db01");
//        return databaseMapper.findDbName();
//    }
//
//    @GetMapping("/b")
//    public String getB(HttpSession session) {
//        session.setAttribute("db_key","db02");
//        return databaseMapper.findDbName();
//    }


}
