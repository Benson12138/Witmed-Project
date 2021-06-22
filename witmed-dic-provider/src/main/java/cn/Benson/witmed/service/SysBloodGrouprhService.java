package cn.Benson.witmed.service;

import cn.Benson.witmed.base.pojo.vo.PageVO;
import cn.Benson.witmed.pojo.system.entity.SysBloodGrouprh;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-Rh血型类型业务层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface SysBloodGrouprhService {
	/**
	 * 分页查询
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<SysBloodGrouprh> getPageByQuery(SysBloodGrouprh query, PageVO<SysBloodGrouprh> pageVO) throws Exception;

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysBloodGrouprh> getListByQuery(SysBloodGrouprh query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(SysBloodGrouprh entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(SysBloodGrouprh entity) throws Exception;

	/**
	 * 根据 主键 查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysBloodGrouprh getById(String id) throws Exception;


	/**
	 * 根据 编码 查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	SysBloodGrouprh getByCode(String code) throws Exception;

}
