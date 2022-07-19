package com.mailplug.trans.module.transconfig.service;

import com.mailplug.trans.module.transconfig.domain.Config;
import com.mailplug.trans.module.transconfig.repository.ConfigRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ConfigService {

    private final ConfigRepository configRepository;

    public Config getConfig() {

        return new Config();
    }
}
