package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.WehcatMapper;
import com.seehope.mds.core.service.WehcatService;
@Service
public class WehcatServiceImpl implements WehcatService{

    @Resource
    private WehcatMapper wehcatMapper;

}
