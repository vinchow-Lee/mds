package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.QrcodeMicroMapper;
import com.seehope.mds.core.service.QrcodeMicroService;
@Service
public class QrcodeMicroServiceImpl implements QrcodeMicroService{

    @Resource
    private QrcodeMicroMapper qrcodeMicroMapper;

}
