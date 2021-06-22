package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysBloodGroup;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-ABO血型类型数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface SysBloodGroupDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysBloodGroup> findListByQuery(SysBloodGroup query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysBloodGroup entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysBloodGroup entity) throws Exception;
}
