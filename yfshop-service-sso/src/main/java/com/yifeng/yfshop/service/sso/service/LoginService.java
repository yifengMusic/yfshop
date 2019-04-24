package com.yifeng.yfshop.service.sso.service;

import com.yifeng.yfshop.common.domain.TbSysUser;

/**
 * 登录业务
 * <p>Title: LoginService</p>
 * <p>Description: </p>
 *
 * @author Yifeng
 * @version 1.0.0
 * @date 2018/8/8 10:48
 */
public interface LoginService {
    /**
     * 登录
     *
     * @param loginCode
     * @param plantPassword
     * @return
     */
    public TbSysUser login(String loginCode, String plantPassword);
}
