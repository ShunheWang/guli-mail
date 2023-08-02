package com.maison.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.common.utils.PageUtils;
import com.maison.gulimail.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-07-31 16:19:49
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

