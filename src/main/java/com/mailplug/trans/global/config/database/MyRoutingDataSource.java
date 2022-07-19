package com.mailplug.trans.global.config.database;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class MyRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        Object dbKey = "db01";
        try {
            dbKey = RequestContextHolder
                    .getRequestAttributes()
                    .getAttribute("db_key", RequestAttributes.SCOPE_SESSION);
        } catch (NullPointerException e) {
            System.out.println("exception");
        }

        return "current:" + dbKey;
    }
}
