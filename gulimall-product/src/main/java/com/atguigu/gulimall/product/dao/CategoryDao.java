package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author SatanKiss
 * @email 2036736521@qq.com
 * @date 2024-06-01 20:02:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
