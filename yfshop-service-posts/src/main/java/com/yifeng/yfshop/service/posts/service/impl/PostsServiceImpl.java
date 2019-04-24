package com.yifeng.yfshop.service.posts.service.impl;

import com.yifeng.yfshop.common.domain.TbPostsPost;
import com.yifeng.yfshop.common.mapper.TbPostsPostMapper;
import com.yifeng.yfshop.common.service.impl.BaseServiceImpl;
import com.yifeng.yfshop.service.posts.service.PostsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostsServiceImpl extends BaseServiceImpl<TbPostsPost, TbPostsPostMapper> implements PostsService {
}

