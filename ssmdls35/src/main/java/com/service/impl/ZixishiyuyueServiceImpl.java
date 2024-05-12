package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZixishiyuyueDao;
import com.entity.ZixishiyuyueEntity;
import com.service.ZixishiyuyueService;
import com.entity.vo.ZixishiyuyueVO;
import com.entity.view.ZixishiyuyueView;

@Service("zixishiyuyueService")
public class ZixishiyuyueServiceImpl extends ServiceImpl<ZixishiyuyueDao, ZixishiyuyueEntity> implements ZixishiyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixishiyuyueEntity> page = this.selectPage(
                new Query<ZixishiyuyueEntity>(params).getPage(),
                new EntityWrapper<ZixishiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixishiyuyueEntity> wrapper) {
		  Page<ZixishiyuyueView> page =new Query<ZixishiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixishiyuyueVO> selectListVO(Wrapper<ZixishiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixishiyuyueVO selectVO(Wrapper<ZixishiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixishiyuyueView> selectListView(Wrapper<ZixishiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixishiyuyueView selectView(Wrapper<ZixishiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
