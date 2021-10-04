package com.example.financial_management.service.impl;

import com.example.financial_management.entity.Bill;
import com.example.financial_management.mapper.BillMapper;
import com.example.financial_management.service.IBillService;
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
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements IBillService {

}
