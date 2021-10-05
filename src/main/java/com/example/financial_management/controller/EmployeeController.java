package com.example.financial_management.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.financial_management.entity.Employee;
import com.example.financial_management.service.impl.EmployeeServiceImpl;
import com.example.financial_management.vo.EmpVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public String adminLogin(@ApiParam("用户名") @RequestParam("username") String username
            ,@ApiParam("密码") @RequestParam("password") String password, Model model) {
        boolean login = employeeService.is_login(username, password);
        if(login){
            return "index";
        }else {
            model.addAttribute("error", "登录失败,请检查用户名和密码");
            return "login";
        }
    }

    @RequestMapping("/all_employee/allEmp/{pageNum}")
    @ResponseBody
    @ApiOperation("查看所有员工")
    public List<EmpVO> allEmp(@PathVariable int pageNum){
        List<EmpVO> empVOS = employeeService.EmpVOPage(pageNum);
        return empVOS;
    }
    @RequestMapping("/all_employee/EmpNums")
    @ResponseBody
    @ApiOperation("员工总数")
    public int EmpNums(){
        List<EmpVO> empVOS = employeeService.allEmpVO();
        return empVOS.size();
    }

    @RequestMapping("/all_employee/updateEmp")
    @ApiOperation("管理员修改员工")
    @ResponseBody
    public String updateEmp(Employee employee){
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        wrapper.eq("eid", employee.getEid());
        employeeService.update(employee, wrapper);
       return "success";
    }

    @RequestMapping("/all_employee/deleteEmp")
    @ApiOperation("管理员删除员工")
    @ResponseBody
    public String deleteEmp(int eid){
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        wrapper.eq("eid", eid);
        employeeService.remove(wrapper);
        return "success";
    }
    @RequestMapping("/add_employee/addEmp")
    @ApiOperation("管理员增加员工")
    @ResponseBody
    public String addEmp(Employee employee){
        employeeService.save(employee);
        return "success";
    }

}

