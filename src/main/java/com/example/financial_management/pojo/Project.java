package com.example.financial_management.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

  private long projectid;
  private String projectname;
  private double projectrevenue;
  private double projectpay;
  private long departmentId;


}
