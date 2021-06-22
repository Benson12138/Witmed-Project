package cn.Benson.witmed.pojo.system.entity;

import cn.Benson.witmed.base.pojo.entity.BaseEntity;
/**
 * <b>智慧医疗-系统功能-个体危险性标识信息实体信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public class SysIndividualRiskIdentification extends BaseEntity {
	private static final long serialVersionUID = 7794645638400343939L;
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
