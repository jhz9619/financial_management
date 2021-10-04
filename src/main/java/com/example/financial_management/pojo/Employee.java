package com.example.financial_management.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  private long eid;
  private String ename;
  private String sex;
  private String password;
  private java.sql.Date entryDate;
  private double basicSalary;
  private long departmentId;
  private long positionId;



}
