package com.example.financial_management.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.financial_management.entity.Employee;
import com.example.financial_management.vo.EmpVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    @Select("select e.eid ,e.ename,e.sex,e.password,e.entry_date" +
            ",e.basic_salary,d.dname,p.pname from employee e,department d,position p " +
            "where e.department_id = d.did and e.position_id = p.pid")
    List<EmpVO> allEmpVO();
    @Select("select e.eid ,e.ename,e.sex,e.password,e.entry_date" +
            ",e.basic_salary,d.dname,p.pname from employee e,department d,position p " +
            "where e.department_id = d.did and e.position_id = p.pid ${ew.customSqlSegment}")
    IPage<EmpVO> EmpVOPage(Page<EmpVO> page, @Param(Constants.WRAPPER) Wrapper<EmpVO> wrapper);
}
