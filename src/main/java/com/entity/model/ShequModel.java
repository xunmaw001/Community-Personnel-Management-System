package com.entity.model;

import com.entity.ShequEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 社区信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShequModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 社区名称
     */
    private String shequName;


    /**
     * 社区类型
     */
    private Integer shequTypes;


    /**
     * 社区详情
     */
    private String shequContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：社区名称
	 */
    public String getShequName() {
        return shequName;
    }


    /**
	 * 设置：社区名称
	 */
    public void setShequName(String shequName) {
        this.shequName = shequName;
    }
    /**
	 * 获取：社区类型
	 */
    public Integer getShequTypes() {
        return shequTypes;
    }


    /**
	 * 设置：社区类型
	 */
    public void setShequTypes(Integer shequTypes) {
        this.shequTypes = shequTypes;
    }
    /**
	 * 获取：社区详情
	 */
    public String getShequContent() {
        return shequContent;
    }


    /**
	 * 设置：社区详情
	 */
    public void setShequContent(String shequContent) {
        this.shequContent = shequContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
