package com.maison.gulimail.order.dao;

import com.maison.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-02 10:14:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
