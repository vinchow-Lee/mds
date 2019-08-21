package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.AgentMapper;
import com.seehope.mds.core.service.AgentService;
@Service
public class AgentServiceImpl implements AgentService{

    @Resource
    private AgentMapper agentMapper;

}
