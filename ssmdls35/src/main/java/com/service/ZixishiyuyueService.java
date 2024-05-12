package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixishiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixishiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixishiyuyueView;


/**
 * 自习室预约
 *
 * @author 
 * @email 
 * @date 2022-03-04 15:23:14
 */
public interface ZixishiyuyueService extends IService<ZixishiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixishiyuyueVO> selectListVO(Wrapper<ZixishiyuyueEntity> wrapper);
   	
   	ZixishiyuyueVO selectVO(@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);
   	
   	List<ZixishiyuyueView> selectListView(Wrapper<ZixishiyuyueEntity> wrapper);
   	
   	ZixishiyuyueView selectView(@Param("ew") Wrapper<ZixishiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixishiyuyueEntity> wrapper);
   	

}

