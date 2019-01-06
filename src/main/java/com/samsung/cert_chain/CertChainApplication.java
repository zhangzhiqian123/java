package com.samsung.cert_chain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan("com.samsung.cert_chain.mapper")

public class CertChainApplication {

    public static void main(String[] args) {
        SpringApplication.run(CertChainApplication.class, args);
    }

}

