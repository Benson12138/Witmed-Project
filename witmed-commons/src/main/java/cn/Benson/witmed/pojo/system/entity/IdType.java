package cn.Benson.witmed.pojo.system.entity;

import cn.Benson.witmed.base.pojo.entity.BaseEntity;

/**
 * 智慧医疗-系统功能-证件类型实体类信息
 */
public class IdType extends BaseEntity {
	private static final long serialVersionUID = -4213833172788997884L;
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
