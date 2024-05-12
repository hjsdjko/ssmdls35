package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JieshuxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JieshuxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JieshuxuexiView;


/**
 * 结束学习
 *
 * @author 
 * @email 
 * @date 2022-03-04 15:23:14
 */
public interface JieshuxuexiService extends IService<JieshuxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieshuxuexiVO> selectListVO(Wrapper<JieshuxuexiEntity> wrapper);
   	
   	JieshuxuexiVO selectVO(@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
   	
   	List<JieshuxuexiView> selectListView(Wrapper<JieshuxuexiEntity> wrapper);
   	
   	JieshuxuexiView selectView(@Param("ew") Wrapper<JieshuxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieshuxuexiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JieshuxuexiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JieshuxuexiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JieshuxuexiEntity> wrapper);
}

