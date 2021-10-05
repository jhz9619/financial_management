package com.example.financial_management.controller;


import com.example.financial_management.entity.Position;
import com.example.financial_management.service.impl.PositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

public class PositionController {
    @Autowired
    PositionServiceImpl positionService;

    @RequestMapping("/all_employee/allPName")
    @ResponseBody
    public List<Position> allDepName() {
        List<Position> list = positionService.list();
        return list;
    }
}

