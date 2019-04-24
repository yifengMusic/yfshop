package com.yifeng.yfshop.common.mapper;

import com.yifeng.yfshop.common.domain.TbPostsPost;
import com.yifeng.yfshop.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbPostsPostMapper extends MyMapper<TbPostsPost> {
}