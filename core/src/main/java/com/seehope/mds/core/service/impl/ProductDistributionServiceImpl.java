package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.ProductDistributionMapper;
import com.seehope.mds.core.service.ProductDistributionService;
@Service
public class ProductDistributionServiceImpl implements ProductDistributionService{

    @Resource
    private ProductDistributionMapper productDistributionMapper;

}
