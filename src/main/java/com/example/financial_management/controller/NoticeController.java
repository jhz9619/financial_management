package com.example.financial_management.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.financial_management.entity.Notice;
import com.example.financial_management.service.impl.NoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/notice_manage/allNotices")
    public List<Notice> allNotices(){
        List<Notice> list = noticeService.list();
        return list;
    }
    @RequestMapping("/notice_manage/modifyNotice")
    @ResponseBody
    public String modifyNotice(Notice notice){
        QueryWrapper<Notice> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("nid", notice.getNid());
        noticeService.update(notice,queryWrapper);
        return "success";
    }

    @RequestMapping("/add_notice/addNotice")
    @ResponseBody
    public String addNotice(Notice notice){
        noticeService.save(notice);
        return "success";
    }
    @RequestMapping("/notice_manage/deleteNotice")
    @ResponseBody
    public String deleteNotice(Notice notice){
        noticeService.removeById(notice);
        return "success";
    }

}

