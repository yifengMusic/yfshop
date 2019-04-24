package com.yifeng.yfshop.common.dto.hystrix;


import com.google.common.collect.Lists;
import com.yifeng.yfshop.common.dto.BaseResult;
import com.yifeng.yfshop.common.dto.constants.HttpStatusConstants;
import com.yifeng.yfshop.common.dto.utils.MapperUtils;

/**
 * 通用的熔断方法
 * <p>Title: Fallback</p>
 * <p>Description: </p>
 *
 * @author Yifeng
 * @version 1.0.0
 * @date 2018/8/8 10:57
 */
public class Fallback {
    /**
     * 502
     *
     * @return
     */
    public static String badGateway() {
        BaseResult baseResult = BaseResult.notOk(Lists.newArrayList(
                new BaseResult.Error(
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                        HttpStatusConstants.BAD_GATEWAY.getContent())));
        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
