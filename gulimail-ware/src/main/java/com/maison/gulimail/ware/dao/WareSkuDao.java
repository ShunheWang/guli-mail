package com.maison.gulimail.ware.dao;

import com.maison.gulimail.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-02 10:24:49
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
