package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.WarehouseMapper;
import com.seehope.mds.core.service.WarehouseService;
@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Resource
    private WarehouseMapper warehouseMapper;

}
