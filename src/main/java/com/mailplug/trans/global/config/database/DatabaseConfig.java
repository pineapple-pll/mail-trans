package com.mailplug.trans.global.config.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DatabaseConfig {
    @Value("${mailplug.db-url}")
    private String dbUrl;

    @Value("${mailplug.db-user}")
    private String dbUser;

    @Value("${mailplug.db-password}")
    private String dbPassword;

    @Bean
    public DataSource createRouterDatasource() {
        AbstractRoutingDataSource routingDataSource = new MyRoutingDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>();

        targetDataSources.put("current:db01",
                createDataSource(dbUrl + "/yunjea0312_test", dbUser, dbPassword));

        targetDataSources.put("current:db02",
                createDataSource(dbUrl + "/tf_gm66_gjueackr",dbUser, dbPassword));


        routingDataSource.setTargetDataSources(targetDataSources);

        return routingDataSource;
    }

    private DataSource createDataSource(String url, String user, String password) {
        com.zaxxer.hikari.HikariDataSource dataSource =
                new com.zaxxer.hikari.HikariDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl(url);
        return dataSource;
    }
}
