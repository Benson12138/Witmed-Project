package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysIndividualRiskIdentification;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * <b>智慧医疗-系统功能-个体危险性标识数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@Repository
public interface SysIndividualRiskIdentificationDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysIndividualRiskIdentification> findListByQuery(SysIndividualRiskIdentification query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysIndividualRiskIdentification entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysIndividualRiskIdentification entity) throws Exception;
}
