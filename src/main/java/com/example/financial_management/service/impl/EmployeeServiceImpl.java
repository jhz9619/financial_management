package com.example.financial_management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.financial_management.entity.Employee;
import com.example.financial_management.mapper.EmployeeMapper;
import com.example.financial_management.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {


    public boolean is_login(String username,String password){
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        wrapper.eq("ename", username)
                .eq("password", password);
        Employee employee = getOne(wrapper);
        return employee!=null;
    }
}
