package com.example.financial_management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.financial_management.entity.Employee;
import com.example.financial_management.mapper.EmployeeMapper;
import com.example.financial_management.service.IEmployeeService;
import com.example.financial_management.vo.EmpVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
@Service
@Transactional
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {


    /**
     * 根据用户名密码判断登陆
     *
     * @param username
     * @param password
     * @return
     */
    public boolean is_login(String username, String password) {
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        wrapper.eq("ename", username)
                .eq("password", password);
        Employee employee = getOne(wrapper);
        return employee != null;
    }

    @Override
    public List<EmpVO> allEmpVO() {
        EmployeeMapper baseMapper = this.baseMapper;
        List<EmpVO> empVOS = baseMapper.allEmpVO();
        return empVOS;
    }
    @Override
    public List<EmpVO> EmpVOPage(int start) {
        EmployeeMapper baseMapper = this.baseMapper;
        Page<EmpVO> page = new Page<>(start,8);
        QueryWrapper<EmpVO> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("eid");
        IPage<EmpVO> empVOS = baseMapper.EmpVOPage(page, wrapper);
        List<EmpVO> records = empVOS.getRecords();
        return records;
    }
}
