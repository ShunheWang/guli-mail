package com.maison.gulimail.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maison.gulimail.coupon.entity.SeckillSkuRelationEntity;
import com.maison.gulimail.coupon.service.SeckillSkuRelationService;
import com.maison.common.utils.PageUtils;
import com.maison.common.utils.R;



/**
 * 秒杀活动商品关联
 *
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-01 18:54:47
 */
@RestController
@RequestMapping("coupon/seckillskurelation")
public class SeckillSkuRelationController {
    @Autowired
    private SeckillSkuRelationService seckillSkuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("coupon:seckillskurelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillSkuRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
//    @RequiresPermissions("coupon:seckillskurelation:info")
    public R info(@PathVariable("id") Long id){
		SeckillSkuRelationEntity seckillSkuRelation = seckillSkuRelationService.getById(id);

        return R.ok().put("seckillSkuRelation", seckillSkuRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("coupon:seckillskurelation:save")
    public R save(@RequestBody SeckillSkuRelationEntity seckillSkuRelation){
		seckillSkuRelationService.save(seckillSkuRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("coupon:seckillskurelation:update")
    public R update(@RequestBody SeckillSkuRelationEntity seckillSkuRelation){
		seckillSkuRelationService.updateById(seckillSkuRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		seckillSkuRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
