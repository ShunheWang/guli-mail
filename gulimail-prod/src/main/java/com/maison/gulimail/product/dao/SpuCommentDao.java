package com.maison.gulimail.product.dao;

import com.maison.gulimail.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-07-31 16:19:49
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
