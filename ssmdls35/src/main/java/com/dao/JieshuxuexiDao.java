package com.dao;

import com.entity.JieshuxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieshuxuexiVO;
import com.entity.view.JieshuxuexiView;


/**
 * 结束学习
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:23:14
 */
public interface JieshuxuexiDao extends BaseMapper<JieshuxuexiEntity> {
	
	List<JieshuxuexiVO> selectListVO(@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
	
	JieshuxuexiVO selectVO(@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
	
	List<JieshuxuexiView> selectListView(@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);

	List<JieshuxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
	
	JieshuxuexiView selectView(@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
}
