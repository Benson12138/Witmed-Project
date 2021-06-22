package cn.Benson.witmed.service;

import cn.Benson.witmed.base.pojo.vo.PageVO;
import cn.Benson.witmed.pojo.system.entity.SysBloodGroup;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-ABO血型类型业务层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface SysBloodGroupService {
	/**
	 * 分页查询
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<SysBloodGroup> getPageByQuery(SysBloodGroup query, PageVO<SysBloodGroup> pageVO) throws Exception;

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysBloodGroup> getListByQuery(SysBloodGroup query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(SysBloodGroup entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(SysBloodGroup entity) throws Exception;

	/**
	 * 根据 主键 查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysBloodGroup getById(String id) throws Exception;


	/**
	 * 根据 编码 查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	SysBloodGroup getByCode(String code) throws Exception;

}
