package com.example.financial_management;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class MyCode {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        FastAutoGenerator.create("jdbc:mysql://47.113.216.99:3306/FinancialManagement", "root", "123456")
                .globalConfig(builder -> builder.author("Li")
                        .enableSwagger()
                        .outputDir(projectPath + "/src/main/java"))
                .packageConfig(builder -> builder.parent("com.example")
                        .moduleName("financial_management"))
                .strategyConfig(builder -> builder.addInclude("bill","department","employee","notice","position","project")
                        .entityBuilder()
                        .enableLombok()
                        .idType(IdType.AUTO))
                .execute();
    }
}
