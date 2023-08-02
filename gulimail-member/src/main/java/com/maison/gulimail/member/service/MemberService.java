package com.maison.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.common.utils.PageUtils;
import com.maison.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-01 19:05:25
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

