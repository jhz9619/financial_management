package com.example.financial_management.controller;


import com.example.financial_management.entity.Department;
import com.example.financial_management.service.impl.DepartmentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
@Controller
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @GetMapping("/all_employee/allDepName")
    @ResponseBody
    @ApiOperation("查看所有部门信息")
    public List<Department>allDepName(){
        List<Department> dname = departmentService.list(null);
        return dname;
    }
}

