package com.example.financial_management.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.financial_management.entity.Employee;
import com.example.financial_management.vo.EmpVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
public interface IEmployeeService extends IService<Employee> {

    List<EmpVO> allEmpVO();
    List<EmpVO> EmpVOPage(int start);
}
