package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.QrcodeMegaMapper;
import com.seehope.mds.core.service.QrcodeMegaService;
@Service
public class QrcodeMegaServiceImpl implements QrcodeMegaService{

    @Resource
    private QrcodeMegaMapper qrcodeMegaMapper;

}
