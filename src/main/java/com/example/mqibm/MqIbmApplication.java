package com.example.mqibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement  //ibm 的事务处理
@SpringBootApplication
public class MqIbmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqIbmApplication.class, args);
    }

}
