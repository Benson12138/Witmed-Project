package cn.Benson.witmed.transport.system;

import cn.Benson.witmed.base.pojo.vo.PageVO;
import cn.Benson.witmed.base.pojo.vo.QueryVO;
import cn.Benson.witmed.pojo.system.entity.SysPaymentMethods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧医疗-系统功能-支付方式类型传输层接口</b>
 * @author Arthur
 * @version 1.0.0
 */
@FeignClient("project-dic-provider")
@RequestMapping("/system/trans/syspaymentmethods")
public interface SysPaymentMethodsTransport {
	/**
	 * 分页查询
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<SysPaymentMethods> getPageByQuery(QueryVO<SysPaymentMethods> queryVO) throws Exception;

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<SysPaymentMethods> getListByQuery(SysPaymentMethods query) throws Exception;

	/**
	 * 保存对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(SysPaymentMethods entity) throws Exception;

	/**
	 * 修改对象
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody SysPaymentMethods entity) throws Exception;

	/**
	 * 根据 主键 查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	SysPaymentMethods getById(@RequestParam String id) throws Exception;


	/**
	 * 根据 编码 查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	SysPaymentMethods getByCode(@RequestParam String code) throws Exception;
}
