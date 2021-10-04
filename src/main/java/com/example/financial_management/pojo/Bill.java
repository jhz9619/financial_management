package com.example.financial_management.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

  private long bid;
  private String bimage;
  private long departmentId;
  private String bname;
  private String btopic;



}
