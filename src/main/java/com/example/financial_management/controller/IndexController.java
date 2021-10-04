package com.example.financial_management.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api("页面跳转控制")
public class IndexController {

    @RequestMapping({"/","/login"})
    @ApiOperation(" 跳转登录页")
    public String login() {
        return "login";
    }

    @RequestMapping("/index.html")
    @ApiOperation("跳转主页")
    public String index() {
        return "index";
    }

    @RequestMapping("/table_basic.html")
    @ApiOperation("table_basic")
    public String table_basic() {
        return "table_basic";
    }

    @RequestMapping("/table_complete.html")
    @ApiOperation("table_complete")
    public String table_complete() {
        return "table_complete";
    }

    @RequestMapping("/chart_line.html")
    @ApiOperation("chart_line")
    public String chart_line() {
        return "chart_line";
    }

    @RequestMapping("/chart_columnar.html")
    @ApiOperation("chart_columnar")
    public String chart_columnar() {
        return "chart_columnar";
    }

    @RequestMapping("/chart_pie.html")
    @ApiOperation("chart_pie")
    public String chart_pie() {
        return "chart_pie";
    }

    @RequestMapping("/form_basic.html")
    @ApiOperation("form_basic")
    public String form_basic() {
        return "form_basic";
    }

    @RequestMapping("/form_validate.html")
    @ApiOperation("form_validate")
    public String form_validate() {
        return "form_validate";
    }

}
