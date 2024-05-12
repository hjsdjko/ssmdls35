package com.dao;

import com.entity.ZixishiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixishiyuyueVO;
import com.entity.view.ZixishiyuyueView;


/**
 * 自习室预约
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:23:14
 */
public interface ZixishiyuyueDao extends BaseMapper<ZixishiyuyueEntity> {
	
	List<ZixishiyuyueVO> selectListVO(@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);
	
	ZixishiyuyueVO selectVO(@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);
	
	List<ZixishiyuyueView> selectListView(@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);

	List<ZixishiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);
	
	ZixishiyuyueView selectView(@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);
	

}
