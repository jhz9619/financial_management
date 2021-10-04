package com.example.financial_management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Employee对象", description = "")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("员工编号")
    @TableId(value = "eid", type = IdType.AUTO)
    private Integer eid;

    @ApiModelProperty("用户名")
    private String ename;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("入职时间")
    private LocalDate entryDate;

    @ApiModelProperty("基本工资")
    private Double basicSalary;

    @ApiModelProperty("部门编号")
    private Integer departmentId;

    @ApiModelProperty("对应职务")
    private Integer positionId;


}
