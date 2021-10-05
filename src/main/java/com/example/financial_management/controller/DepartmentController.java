package com.example.financial_management.controller;


import com.example.financial_management.entity.Department;
import com.example.financial_management.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping("/all_employee/allDepName")
    @ResponseBody
    public List<Department>allDepName(){
        List<Department> dname = departmentService.list(null);
        return dname;
    }
}

