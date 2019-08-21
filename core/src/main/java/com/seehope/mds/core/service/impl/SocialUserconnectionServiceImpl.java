package com.seehope.mds.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.seehope.mds.core.mapper.SocialUserconnectionMapper;
import com.seehope.mds.core.service.SocialUserconnectionService;
@Service
public class SocialUserconnectionServiceImpl implements SocialUserconnectionService{

    @Resource
    private SocialUserconnectionMapper socialUserconnectionMapper;

}
