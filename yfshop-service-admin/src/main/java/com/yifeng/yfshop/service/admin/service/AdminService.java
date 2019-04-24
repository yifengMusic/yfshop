package com.yifeng.yfshop.service.admin.service;


import com.yifeng.yfshop.common.domain.TbSysUser;
import com.yifeng.yfshop.common.service.BaseService;

public interface AdminService extends BaseService<TbSysUser> {


    /**
     * 注册
     *
     * @param tbSysUser
     */
    void register(TbSysUser tbSysUser);

    /**
     * 登录
     *
     * @param loginCode     登录账号
     * @param plantPassword 明文登录密码
     * @return
     */
    TbSysUser login(String loginCode, String plantPassword);
}
