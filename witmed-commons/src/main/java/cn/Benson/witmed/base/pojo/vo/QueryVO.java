package cn.Benson.witmed.base.pojo.vo;

import java.io.Serializable;
/**
 * <b>智慧医疗-系统查询视图信息</b>
 * @param <E>
 *
 * @author Arthur
 * @version 1.0.0
 */
public class QueryVO<E> implements Serializable {
	private static final long serialVersionUID = 3081560041356703798L;
	private E query;                        //查询对象

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}

	private PageVO<E> pageVO;               //分页对象
}
