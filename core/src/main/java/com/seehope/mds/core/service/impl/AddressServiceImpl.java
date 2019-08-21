package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.AddressMapper;
import com.seehope.mds.core.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{

    @Resource
    private AddressMapper addressMapper;

}
