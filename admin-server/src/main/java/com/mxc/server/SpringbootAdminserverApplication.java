package com.mxc.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 马秀成
 * @date 2019/1/31
 * @jdk.version 1.8
 * @desc
 */
@SpringBootApplication
@EnableAdminServer
public class SpringbootAdminserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminserverApplication.class, args);
    }
}