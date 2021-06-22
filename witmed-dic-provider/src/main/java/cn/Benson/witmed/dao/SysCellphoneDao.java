package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysCellphone;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-联系电话类型数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@Repository
public interface SysCellphoneDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysCellphone> findListByQuery(SysCellphone query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysCellphone entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysCellphone entity) throws Exception;
}
