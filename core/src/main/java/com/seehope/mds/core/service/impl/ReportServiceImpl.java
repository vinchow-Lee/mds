package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.ReportMapper;
import com.seehope.mds.core.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService{

    @Resource
    private ReportMapper reportMapper;

}
