package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysAllergySymptoms;

import java.util.List;
/**
 * <b>智慧医疗-系统功能-过敏症状类型数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
public interface SysAllergySymptomsDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysAllergySymptoms> findListByQuery(SysAllergySymptoms query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysAllergySymptoms entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysAllergySymptoms entity) throws Exception;
}
