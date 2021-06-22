package cn.Benson.witmed.pojo.system.entity;

import cn.Benson.witmed.base.pojo.entity.BaseEntity;

public class SysGender extends BaseEntity {
	private static final long serialVersionUID = 4898085321378699257L;

	private String id;                              //主键
	private String text;                            //文本
	private String code;                            //编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
