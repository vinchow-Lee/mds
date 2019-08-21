package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.PresentMapper;
import com.seehope.mds.core.service.PresentService;
@Service
public class PresentServiceImpl implements PresentService{

    @Resource
    private PresentMapper presentMapper;

}
