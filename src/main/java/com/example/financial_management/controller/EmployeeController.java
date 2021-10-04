package com.example.financial_management.controller;


import com.example.financial_management.service.impl.EmployeeServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 前端控制器
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
    @ApiOperation("admin登陆判断")
    public String adminLogin(@RequestParam("username") String username
            , @RequestParam("password") String password, Model model) {
        boolean login = employeeService.is_login(username, password);
        if(login){
            return "index";
        }else {
            model.addAttribute("error", "登录失败,请检查用户名和密码");
            return "login";
        }
    }
}

