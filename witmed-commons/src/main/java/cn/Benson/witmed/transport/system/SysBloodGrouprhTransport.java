package cn.Benson.witmed.transport.system;

import cn.Benson.witmed.base.pojo.vo.PageVO;
import cn.Benson.witmed.base.pojo.vo.QueryVO;
import cn.Benson.witmed.pojo.system.entity.SysBloodGrouprh;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-Rh血型类型传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@FeignClient("project-dic-provider")
@RequestMapping("/system/trans/sysbloodgrouprh")
public interface SysBloodGrouprhTransport {
	/**
	 * 分页查询
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<SysBloodGrouprh> getPageByQuery(QueryVO<SysBloodGrouprh> queryVO) throws Exception;

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<SysBloodGrouprh> getListByQuery(SysBloodGrouprh query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(SysBloodGrouprh entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody SysBloodGrouprh entity) throws Exception;

	/**
	 * 根据 主键 查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	SysBloodGrouprh getById(@RequestParam String id) throws Exception;


	/**
	 * 根据 编码 查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	SysBloodGrouprh getByCode(@RequestParam String code) throws Exception;
}
