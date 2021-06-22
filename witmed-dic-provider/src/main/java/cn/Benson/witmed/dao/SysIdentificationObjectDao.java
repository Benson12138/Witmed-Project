package cn.Benson.witmed.dao;

import cn.Benson.witmed.pojo.system.entity.SysIdentificationObject;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * <b>智慧医疗-系统功能-姓名标识对象类型数据持久层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@Repository
public interface SysIdentificationObjectDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<SysIdentificationObject> findListByQuery(SysIdentificationObject query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(SysIdentificationObject entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(SysIdentificationObject entity) throws Exception;
}
