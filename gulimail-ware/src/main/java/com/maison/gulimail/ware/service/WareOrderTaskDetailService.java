package com.maison.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.common.utils.PageUtils;
import com.maison.gulimail.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-02 10:24:49
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

