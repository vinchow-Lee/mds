package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.OrderMapper;
import com.seehope.mds.core.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderMapper orderMapper;

}
