package com.yifeng.yfshop.service.sso.mapper;

import com.yifeng.yfshop.common.domain.TbSysUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

@Repository
public interface TbSysUserMapper extends MyMapper<TbSysUser> {
}