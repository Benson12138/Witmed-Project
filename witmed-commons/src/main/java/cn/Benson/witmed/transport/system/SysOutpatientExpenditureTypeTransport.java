package cn.Benson.witmed.transport.system;

import cn.Benson.witmed.base.pojo.vo.PageVO;
import cn.Benson.witmed.base.pojo.vo.QueryVO;
import cn.Benson.witmed.pojo.system.entity.SysOutpatientExpenditureType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-门诊费用类型传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@FeignClient("project-dic-provider")
@RequestMapping("/system/trans/sysoutpatientexpendituretype")
public interface SysOutpatientExpenditureTypeTransport {
	/**
	 * 分页查询
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<SysOutpatientExpenditureType> getPageByQuery(QueryVO<SysOutpatientExpenditureType> queryVO) throws Exception;

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<SysOutpatientExpenditureType> getListByQuery(SysOutpatientExpenditureType query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(SysOutpatientExpenditureType entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody SysOutpatientExpenditureType entity) throws Exception;

	/**
	 * 根据 主键 查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	SysOutpatientExpenditureType getById(@RequestParam String id) throws Exception;


	/**
	 * 根据 编码 查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	SysOutpatientExpenditureType getByCode(@RequestParam String code) throws Exception;
}
