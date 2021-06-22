package cn.Benson.witmed.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <h1>基础控制层类</h1>
 * <p>
 *     基础控制层类依赖注入了：<b>HttpServletRequest</b>&nbsp;、&nbsp;<b>HttpServletResponse</b>
 *     &nbsp;和&nbsp;<b>HttpSession</b>&nbsp;。<br/>
 *     其他功能控制层类都<b>必须继承于本基础控制层类</b>。
 * </p>
 *
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}
