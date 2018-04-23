package com.hyb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yibo on 2018/4/23.
 */
@SpringBootApplication
public class Application {

    /**
     * app日志
     */
    private static Logger appLogger = LoggerFactory.getLogger("appLogger");

    public static Logger getAppLogger() {
        return appLogger;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}