package com.example.financial_management.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpVO {

    private Integer eid;
    private String ename;
    private String sex;
    private String password;
    private LocalDate entryDate;
    private Double basicSalary;
    private String dname;
    private String pname;
}
