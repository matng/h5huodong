package com.jeecg.p3.shaketicket.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActShaketicketConfig:活动奖项配置表<br>
 * @author pituo
 * @since：2015年12月24日 11时08分29秒 星期四 
 * @version:1.0
 */
public class WxActShaketicketConfig implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	//update-begin--Author:zhangweijian  Date: 20180329 for：新增奖项名字字段
	/**
	 *
	 */
	private String awardsName;
		return awardsName;
	}
	public void setAwardsName(String awardsName) {
		this.awardsName = awardsName;
	}
	//update-end--Author:zhangweijian  Date: 20180329 for：新增奖项名字字段
	/**
		return probability;
	}
	public void setProbability(Double probability) {
		this.probability = probability;
	}
	public Integer getAmount() {
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
}
