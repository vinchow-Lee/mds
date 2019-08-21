package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.ProductCategoryMapper;
import com.seehope.mds.core.service.ProductCategoryService;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

    @Resource
    private ProductCategoryMapper productCategoryMapper;

}
