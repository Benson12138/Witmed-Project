package cn.Benson.witmed.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 45668652412469680L;
	private String status;                          // 系统状态：0-禁用，1-启用
	private String creator;                         // 创建人
	private Date createTime;                        // 创建时间
	private String reviser;                         // 修改人
	private Date updateTime;                        // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getReviser() {
		return reviser;
	}

	public void setReviser(String reviser) {
		this.reviser = reviser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
