package com.fujieid.oauth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lapati5
 */
@SpringBootApplication
public class OauthServiceApplication implements ApplicationRunner {

    @Value("${server.port}")
    private int port;

    public static void main(String[] args) {
        SpringApplication.run(OauthServiceApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("========启动成功=========");
        System.out.println("http://localhost:" + port);
        System.out.println("登录页面：http://localhost:8888/oauth/login");

    }
}
