package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.CustomerMapper;
import com.seehope.mds.core.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Resource
    private CustomerMapper customerMapper;

}
