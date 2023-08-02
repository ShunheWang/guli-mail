package com.maison.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.common.utils.PageUtils;
import com.maison.gulimail.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-07-31 16:19:49
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

