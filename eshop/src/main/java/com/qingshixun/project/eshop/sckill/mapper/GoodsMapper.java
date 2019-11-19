package com.qingshixun.project.eshop.sckill.mapper;

import java.util.List;

import com.qingshixun.project.eshop.sckill.pojo.vo.GoodsVo;
import com.qingshixun.project.eshop.web.MyBatisRepository;

@MyBatisRepository
public interface GoodsMapper {

	public List<GoodsVo> listGoodsVo();
	

	
	
}
