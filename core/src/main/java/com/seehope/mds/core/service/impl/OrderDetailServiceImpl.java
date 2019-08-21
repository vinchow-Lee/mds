package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.OrderDetailMapper;
import com.seehope.mds.core.service.OrderDetailService;
@Service
public class OrderDetailServiceImpl implements OrderDetailService{

    @Resource
    private OrderDetailMapper orderDetailMapper;

}
