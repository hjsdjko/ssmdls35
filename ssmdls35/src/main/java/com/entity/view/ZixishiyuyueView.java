package com.entity.view;

import com.entity.ZixishiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 自习室预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 15:23:14
 */
@TableName("zixishiyuyue")
public class ZixishiyuyueView  extends ZixishiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixishiyuyueView(){
	}
 
 	public ZixishiyuyueView(ZixishiyuyueEntity zixishiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, zixishiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
