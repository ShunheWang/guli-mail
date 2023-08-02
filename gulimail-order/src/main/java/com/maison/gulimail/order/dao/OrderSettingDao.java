package com.maison.gulimail.order.dao;

import com.maison.gulimail.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-02 10:14:16
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
