package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.QrcodeReferenceMapper;
import com.seehope.mds.core.service.QrcodeReferenceService;
@Service
public class QrcodeReferenceServiceImpl implements QrcodeReferenceService{

    @Resource
    private QrcodeReferenceMapper qrcodeReferenceMapper;

}
