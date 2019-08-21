package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.CustomerPointLogMapper;
import com.seehope.mds.core.service.CustomerPointLogService;
@Service
public class CustomerPointLogServiceImpl implements CustomerPointLogService{

    @Resource
    private CustomerPointLogMapper customerPointLogMapper;

}
