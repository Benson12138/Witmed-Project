package cn.Benson.witmed.pojo.system.entity;

import cn.Benson.witmed.base.pojo.entity.BaseEntity;
/**
 * <b>智慧医疗-系统功能-地址类型数据实体信息</b>
 * @author Arthur
 * @version 1.0.0
 */
public class SysAddress extends BaseEntity {
	private static final long serialVersionUID = 1926754318496606838L;
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
