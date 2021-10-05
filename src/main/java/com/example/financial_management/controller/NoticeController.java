package com.example.financial_management.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.financial_management.entity.Notice;
import com.example.financial_management.service.impl.NoticeServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Li
 * @since 2021-10-04
 */
@RestController
public class NoticeController {
    @Autowired
    NoticeServiceImpl noticeService;

    @GetMapping("/notice_manage/allNotices")
    @ResponseBody
    @ApiOperation("查看所有公告")
    public List<Notice> allNotices(){
        List<Notice> list = noticeService.list();
        return list;
    }

    @PostMapping ("/notice_manage/modifyNotice")
    @ResponseBody
    @ApiOperation("管理员修改公告")
    public String modifyNotice(Notice notice){
        QueryWrapper<Notice> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("nid", notice.getNid());
        noticeService.update(notice,queryWrapper);
        return "success";
    }

    @PostMapping("/add_notice/addNotice")
    @ResponseBody
    @ApiOperation("管理员添加公告")
    public String addNotice(Notice notice){
        noticeService.save(notice);
        return "success";
    }
    @PostMapping("/notice_manage/deleteNotice")
    @ResponseBody
    @ApiOperation("管理员删除公告")
    public String deleteNotice(Notice notice){
        noticeService.removeById(notice);
        return "success";
    }

}

