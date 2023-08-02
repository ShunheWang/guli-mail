package com.maison.gulimail.coupon.dao;

import com.maison.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-01 18:54:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
