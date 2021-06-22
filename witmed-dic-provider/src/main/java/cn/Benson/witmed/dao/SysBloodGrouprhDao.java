package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysBloodGrouprh;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-Rh血型类型数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@Repository
public interface SysBloodGrouprhDao {
	/**
	 * 根据查询对象查询列表
	 *
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysBloodGrouprh> findListByQuery(SysBloodGrouprh query) throws Exception;

	/**
	 * 保存对象
	 *
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysBloodGrouprh entity) throws Exception;

	/**
	 * 修改对象
	 *
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysBloodGrouprh entity) throws Exception;
}