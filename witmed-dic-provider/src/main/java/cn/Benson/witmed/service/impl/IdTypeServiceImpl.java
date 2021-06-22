package cn.Benson.witmed.service.impl;

import cn.Benson.witmed.base.pojo.vo.PageVO;
import cn.Benson.witmed.pojo.system.entity.IdType;
import cn.Benson.witmed.util.IdGenerator;
import cn.Benson.witmed.dao.IdTypeDao;
import cn.Benson.witmed.service.IdTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-证件类型业务层接口实现类</b>
 * @author Arthur
 * @version 1.0.0
 */
@Service("IdTypeService")
@Transactional
public class IdTypeServiceImpl implements IdTypeService {
	@Autowired
	private IdTypeDao dao;
	@Autowired
	private IdGenerator idGenerator;
	/**
	 * 分页查询
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<IdType> getPageByQuery(IdType query,PageVO<IdType> pageVO) throws Exception {
		//要想进行分页查询，先打开PageHelper分页过滤器，pageHelper将会自动紧跟列表进行分页查询
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//以下的列表查询将会自动分页
		List<IdType> list =dao.findListByQuery(query);

		//要想获得分页查询的各个数据，需要pageInfo对象
		PageInfo<IdType> pageInfo = new PageInfo<IdType>(list);
		//从 PageInfo 中提取数据
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalSize((long)pageInfo.getPages());
		return pageVO;
	}

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<IdType> getListByQuery(IdType query) throws Exception {

		return dao.findListByQuery(query);
	}

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(IdType entity) throws Exception {
		//设定主键
		entity.setId(idGenerator.createId());
		//进行保存
		if(dao.save(entity)>0){
			return true;
		}
		return false;
	}

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(IdType entity) throws Exception {
		if (dao.update(entity)>0){
			return true;
		}
		return false;
	}

	/**
	 * 根据 主键 查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public IdType getById(String id) throws Exception {
		//创建查询参数
		IdType query = new IdType();
		query.setId(id);
		//进行列表查询
		List<IdType> list = dao.findListByQuery(query);
		if(list!=null&& !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据 编码 查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public IdType getByCode(String code) throws Exception {
		IdType query = new IdType();
		query.setCode(code);
		//进行列表查询
		List<IdType> list = dao.findListByQuery(query);
		if(list!=null&& !list.isEmpty()){
			return list.get(0);
		}

		return null;
	}
}
