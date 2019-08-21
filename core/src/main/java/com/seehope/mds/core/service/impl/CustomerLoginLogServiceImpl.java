package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.CustomerLoginLogMapper;
import com.seehope.mds.core.service.CustomerLoginLogService;
@Service
public class CustomerLoginLogServiceImpl implements CustomerLoginLogService{

    @Resource
    private CustomerLoginLogMapper customerLoginLogMapper;

}
