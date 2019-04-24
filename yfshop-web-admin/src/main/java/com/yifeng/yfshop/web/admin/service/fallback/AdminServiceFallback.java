package com.yifeng.yfshop.web.admin.service.fallback;

import com.google.common.collect.Lists;
import com.yifeng.yfshop.common.domain.TbSysUser;
import com.yifeng.yfshop.common.dto.BaseResult;
import com.yifeng.yfshop.common.dto.constants.HttpStatusConstants;
import com.yifeng.yfshop.common.dto.hystrix.Fallback;
import com.yifeng.yfshop.common.dto.utils.MapperUtils;
import com.yifeng.yfshop.web.admin.service.AdminService;
import org.springframework.stereotype.Component;


@Component
public class AdminServiceFallback implements AdminService {

    @Override
    public String get(String userCode) {
        try {
            String json = MapperUtils.obj2json(new TbSysUser());
            return json;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String save(String tbSysUserJson, String optsBy) {
        return Fallback.badGateway();
    }

    @Override
    public String page(int pageNum, int pageSize, String tbSysUserJson) {
        return Fallback.badGateway();
    }
}
