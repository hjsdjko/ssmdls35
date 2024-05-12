package com.entity.view;

import com.entity.ZixishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 自习室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 15:23:13
 */
@TableName("zixishi")
public class ZixishiView  extends ZixishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixishiView(){
	}
 
 	public ZixishiView(ZixishiEntity zixishiEntity){
 	try {
			BeanUtils.copyProperties(this, zixishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
