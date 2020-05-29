package com.zdp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sesshomaru
 * @date 2020/5/29
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaBackUp2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBackUp2Application.class,args);
        log.info("============Eureka服务启动成功===========");
    }
}
