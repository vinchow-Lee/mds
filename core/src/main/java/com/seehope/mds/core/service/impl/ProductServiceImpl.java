package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.ProductMapper;
import com.seehope.mds.core.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductMapper productMapper;

}
