package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.CustomerPresentLogMapper;
import com.seehope.mds.core.service.CustomerPresentLogService;
@Service
public class CustomerPresentLogServiceImpl implements CustomerPresentLogService{

    @Resource
    private CustomerPresentLogMapper customerPresentLogMapper;

}
