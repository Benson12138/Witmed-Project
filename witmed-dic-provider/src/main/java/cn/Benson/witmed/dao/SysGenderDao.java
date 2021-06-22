package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysGender;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-性别信息数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface SysGenderDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysGender> findListByQuery(SysGender query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysGender entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysGender entity) throws Exception;
}
