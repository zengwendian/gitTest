package com.qingshixun.project.eshop.sckill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingshixun.project.eshop.sckill.mapper.GoodsMapper;
import com.qingshixun.project.eshop.sckill.pojo.vo.GoodsVo;

@Service
public class GoodsService {

	@Autowired
	GoodsMapper goodsMapper;
	
	public List<GoodsVo> listGoodsVo() {
		return goodsMapper.listGoodsVo();
	}

}
