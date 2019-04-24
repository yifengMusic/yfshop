package com.yifeng.yfshop.common.web.service;

import com.yifeng.yfshop.common.dto.hystrix.Fallback;

/**
 * 通用服务消费者接口
 * <p>Title: BaseClientService</p>
 * <p>Description: </p>
 *
 * @author Yifeng
 * @version 1.0.0
 * @date 2018/8/12 13:56
 */
public interface BaseClientService {
    default String page(int pageNum, int pageSize, String domainJson) {
        return Fallback.badGateway();
    }
}
