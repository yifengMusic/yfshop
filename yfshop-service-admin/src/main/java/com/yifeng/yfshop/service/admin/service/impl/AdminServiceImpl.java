package com.yifeng.yfshop.service.admin.service.impl;

import com.yifeng.yfshop.common.domain.TbSysUser;
import com.yifeng.yfshop.common.mapper.TbSysUserMapper;
import com.yifeng.yfshop.common.service.impl.BaseServiceImpl;
import com.yifeng.yfshop.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseServiceImpl<TbSysUser, TbSysUserMapper> implements AdminService {

    @Autowired
    private TbSysUserMapper tbSysUserMapper;

    @Transactional(readOnly = false)
    @Override
    public void register(TbSysUser tbSysUser) {
        tbSysUserMapper.insert(tbSysUser);
    }

    @Override
    public TbSysUser login(String loginCode, String plantPassword) {
        Example example = new Example(TbSysUser.class);
        example.createCriteria().andEqualTo("loginCode", loginCode);

        TbSysUser tbSysUser = tbSysUserMapper.selectOneByExample(example);
        if (tbSysUser != null) {
            String password = DigestUtils.md5DigestAsHex(plantPassword.getBytes());
            if (password.equals(tbSysUser.getPassword())) {
                return tbSysUser;
            }
        }

        return null;
    }
}