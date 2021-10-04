package com.example.financial_management.controller;


import com.example.financial_management.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @RequestMapping("/adminLogin")
    public String adminLogin(@RequestParam("username") String username
            , @RequestParam("password") String password,@RequestParam(value = "remember",required = false)String is_remember
            , HttpSession session
            , HttpServletResponse response){
        boolean login = employeeService.is_login(username, password);
        if(login){
            if(is_remember!=null){

            }
            return "index";
        }
        return "index";
    }
}

