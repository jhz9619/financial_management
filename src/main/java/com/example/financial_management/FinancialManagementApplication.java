package com.example.financial_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableTransactionManagement
@MapperScan("com.example.financial_management.mapper")
public class FinancialManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialManagementApplication.class, args);
    }

}
