package com.example.financial_management;

import com.example.financial_management.entity.Employee;
import com.example.financial_management.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class FinancialManagementApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        System.out.println(dataSource);
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    void test1() {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
    }
    @Test
    void test2() {
        List<Employee> employees = employeeMapper.selectList(null);
        employees.forEach(System.out::println);
    }

}
