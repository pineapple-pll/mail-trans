package com.mailplug.trans.module.transconfig.controller;

import com.mailplug.trans.module.transconfig.domain.Config;
import com.mailplug.trans.module.transconfig.service.ConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/trans/configs")
public class ConfigController {

    private final ConfigService configService;

    @GetMapping("/{domain}")
    public Config getConfig() {

        return configService.getConfig();
    }
}
