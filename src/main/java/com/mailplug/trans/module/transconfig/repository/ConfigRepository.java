package com.mailplug.trans.module.transconfig.repository;

import com.mailplug.trans.module.transconfig.domain.Config;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfigRepository extends JpaRepository<Config, Long> {

    List<Config> findAll();

    Config findByDomain(String domain);
}
