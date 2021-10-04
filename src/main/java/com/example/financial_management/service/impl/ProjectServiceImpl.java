package com.example.financial_management.service.impl;

import com.example.financial_management.entity.Project;
import com.example.financial_management.mapper.ProjectMapper;
import com.example.financial_management.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements IProjectService {

}
