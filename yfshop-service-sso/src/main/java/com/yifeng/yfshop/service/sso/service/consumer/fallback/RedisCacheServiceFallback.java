package com.yifeng.yfshop.service.sso.service.consumer.fallback;

import com.google.common.collect.Lists;
import com.yifeng.yfshop.common.dto.BaseResult;
import com.yifeng.yfshop.common.dto.constants.HttpStatusConstants;
import com.yifeng.yfshop.common.dto.hystrix.Fallback;
import com.yifeng.yfshop.common.dto.utils.MapperUtils;
import com.yifeng.yfshop.service.sso.service.consumer.RedisCacheService;
import org.springframework.stereotype.Component;

@Component
public class RedisCacheServiceFallback implements RedisCacheService {
    @Override
    public String put(String key, String value, long seconds) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
