package cn.Benson.witmed.pojo.system.entity;

import cn.Benson.witmed.base.pojo.entity.BaseEntity;
/**
 * <b>智慧医疗-系统功能-Rh血型信息实体信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public class SysBloodGrouprh extends BaseEntity {
	private static final long serialVersionUID = 4900806462023903969L;
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
