package com.example.financial_management.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api("页面跳转控制")
public class IndexController {

    @RequestMapping({"/", "/login"})
    @ApiOperation(value = " 跳转登录页",httpMethod ="GET")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    @ApiOperation(value = "跳转主页",httpMethod ="GET")
    public String index() {
        return "index";
    }

    @RequestMapping("/table_basic")
    @ApiOperation(value = "table_basic",httpMethod ="GET")
    public String table_basic() {
        return "table_basic";
    }

    @RequestMapping("/table_complete")
    @ApiOperation(value = "table_complete",httpMethod ="GET")
    public String table_complete() {
        return "table_complete";
    }

    @RequestMapping("/notice_manage")
    @ApiOperation(value = "notice_manage",httpMethod ="GET")
    public String chart_line() {
        return "all_notice";
    }

    @RequestMapping("/add_notice")
    @ApiOperation(value = "add_notice",httpMethod ="GET")
    public String add_notice() {
        return "add_notice";
    }

    @RequestMapping("/chart_columnar")
    @ApiOperation(value = "chart_columnar",httpMethod ="GET")
    public String chart_columnar() {
        return "chart_columnar";
    }

    @RequestMapping("/chart_pie")
    @ApiOperation(value = "chart_pie",httpMethod ="GET")
    public String chart_pie() {
        return "chart_pie";
    }

    @RequestMapping("/form_basic")
    @ApiOperation(value = "form_basic",httpMethod ="GET")
    public String form_basic() {
        return "form_basic";
    }

    @RequestMapping("/form_validate")
    @ApiOperation(value = "form_validate",httpMethod ="GET")
    public String form_validate() {
        return "form_validate";
    }

    @RequestMapping("/all_employee")
    @ApiOperation(value = "all_employee",httpMethod ="GET")
    public String all_employee() {
        return "all_employee";
    }

    @RequestMapping("/add_employee")
    @ApiOperation(value = "add_employee",httpMethod ="GET")
    public String add_employee() {
        return "add_employee";
    }

}
