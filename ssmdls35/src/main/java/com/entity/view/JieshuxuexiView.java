package com.entity.view;

import com.entity.JieshuxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 结束学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 15:23:14
 */
@TableName("jieshuxuexi")
public class JieshuxuexiView  extends JieshuxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JieshuxuexiView(){
	}
 
 	public JieshuxuexiView(JieshuxuexiEntity jieshuxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, jieshuxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
