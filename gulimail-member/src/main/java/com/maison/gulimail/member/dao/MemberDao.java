package com.maison.gulimail.member.dao;

import com.maison.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author maison.wang
 * @email maisonwangsh@gmail.com
 * @date 2023-08-01 19:05:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
