package com.example.financial_management;

import com.example.financial_management.entity.Employee;
import com.example.financial_management.service.impl.EmployeeServiceImpl;
import com.example.financial_management.vo.EmpVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class FinancialManagementApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    EmployeeServiceImpl employeeService;

    @Test
    void contextLoads() {
        List<EmpVO> empVOS = employeeService.EmpVOPage(2);
        empVOS.forEach(System.out::println);
    }
    @Test
    void test1() {
        List<EmpVO> empVOS = employeeService.allEmpVO();
        empVOS.forEach(System.out::println);
    }
    @Test
    void test() {
        List<Employee> list = employeeService.list();
        list.forEach(System.out::println);
    }

}
