package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 维修分配
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-15 15:27:22
 */
@TableName("weixiufenpei")
public class WeixiufenpeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiufenpeiEntity() {
		
	}
	
	public WeixiufenpeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 维修编号
	 */
					
	private String weixiubianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 上传图片
	 */
					
	private String shangchuantupian;
	
	/**
	 * 维修分类
	 */
					
	private String weixiufenlei;
	
	/**
	 * 维修内容
	 */
					
	private String weixiuneirong;
	
	/**
	 * 是否优先
	 */
					
	private String shifouyouxian;
	
	/**
	 * 要求备注
	 */
					
	private String yaoqiubeizhu;
	
	/**
	 * 房间号
	 */
					
	private String fangjianhao;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 房间名称
	 */
					
	private String fangjianmingcheng;
	
	/**
	 * 房间位置
	 */
					
	private String fangjianweizhi;
	
	/**
	 * 住户账号
	 */
					
	private String zhuhuzhanghao;
	
	/**
	 * 住户姓名
	 */
					
	private String zhuhuxingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 维修账号
	 */
					
	private String weixiuzhanghao;
	
	/**
	 * 维修姓名
	 */
					
	private String weixiuxingming;
	
	/**
	 * 分配时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fenpeishijian;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：维修编号
	 */
	public void setWeixiubianhao(String weixiubianhao) {
		this.weixiubianhao = weixiubianhao;
	}
	/**
	 * 获取：维修编号
	 */
	public String getWeixiubianhao() {
		return weixiubianhao;
	}
	/**
	 * 设置：物品名称
	 */
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
	/**
	 * 设置：上传图片
	 */
	public void setShangchuantupian(String shangchuantupian) {
		this.shangchuantupian = shangchuantupian;
	}
	/**
	 * 获取：上传图片
	 */
	public String getShangchuantupian() {
		return shangchuantupian;
	}
	/**
	 * 设置：维修分类
	 */
	public void setWeixiufenlei(String weixiufenlei) {
		this.weixiufenlei = weixiufenlei;
	}
	/**
	 * 获取：维修分类
	 */
	public String getWeixiufenlei() {
		return weixiufenlei;
	}
	/**
	 * 设置：维修内容
	 */
	public void setWeixiuneirong(String weixiuneirong) {
		this.weixiuneirong = weixiuneirong;
	}
	/**
	 * 获取：维修内容
	 */
	public String getWeixiuneirong() {
		return weixiuneirong;
	}
	/**
	 * 设置：是否优先
	 */
	public void setShifouyouxian(String shifouyouxian) {
		this.shifouyouxian = shifouyouxian;
	}
	/**
	 * 获取：是否优先
	 */
	public String getShifouyouxian() {
		return shifouyouxian;
	}
	/**
	 * 设置：要求备注
	 */
	public void setYaoqiubeizhu(String yaoqiubeizhu) {
		this.yaoqiubeizhu = yaoqiubeizhu;
	}
	/**
	 * 获取：要求备注
	 */
	public String getYaoqiubeizhu() {
		return yaoqiubeizhu;
	}
	/**
	 * 设置：房间号
	 */
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：房间名称
	 */
	public void setFangjianmingcheng(String fangjianmingcheng) {
		this.fangjianmingcheng = fangjianmingcheng;
	}
	/**
	 * 获取：房间名称
	 */
	public String getFangjianmingcheng() {
		return fangjianmingcheng;
	}
	/**
	 * 设置：房间位置
	 */
	public void setFangjianweizhi(String fangjianweizhi) {
		this.fangjianweizhi = fangjianweizhi;
	}
	/**
	 * 获取：房间位置
	 */
	public String getFangjianweizhi() {
		return fangjianweizhi;
	}
	/**
	 * 设置：住户账号
	 */
	public void setZhuhuzhanghao(String zhuhuzhanghao) {
		this.zhuhuzhanghao = zhuhuzhanghao;
	}
	/**
	 * 获取：住户账号
	 */
	public String getZhuhuzhanghao() {
		return zhuhuzhanghao;
	}
	/**
	 * 设置：住户姓名
	 */
	public void setZhuhuxingming(String zhuhuxingming) {
		this.zhuhuxingming = zhuhuxingming;
	}
	/**
	 * 获取：住户姓名
	 */
	public String getZhuhuxingming() {
		return zhuhuxingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：维修账号
	 */
	public void setWeixiuzhanghao(String weixiuzhanghao) {
		this.weixiuzhanghao = weixiuzhanghao;
	}
	/**
	 * 获取：维修账号
	 */
	public String getWeixiuzhanghao() {
		return weixiuzhanghao;
	}
	/**
	 * 设置：维修姓名
	 */
	public void setWeixiuxingming(String weixiuxingming) {
		this.weixiuxingming = weixiuxingming;
	}
	/**
	 * 获取：维修姓名
	 */
	public String getWeixiuxingming() {
		return weixiuxingming;
	}
	/**
	 * 设置：分配时间
	 */
	public void setFenpeishijian(Date fenpeishijian) {
		this.fenpeishijian = fenpeishijian;
	}
	/**
	 * 获取：分配时间
	 */
	public Date getFenpeishijian() {
		return fenpeishijian;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}
