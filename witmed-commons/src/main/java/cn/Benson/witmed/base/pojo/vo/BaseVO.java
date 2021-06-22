package cn.Benson.witmed.base.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class BaseVO implements Serializable {
	private static final long serialVersionUID = -837245159054337777L;
	private String status;                          // 系统状态：0-禁用，1-启用
	private Date createTime;                        // 创建时间
	private Date updateTime;                        // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
