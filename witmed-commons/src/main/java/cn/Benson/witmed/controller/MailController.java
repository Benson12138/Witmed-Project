package cn.Benson.witmed.controller;

import cn.Benson.witmed.util.message.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("mailController")
public class MailController {
	@Autowired
	private MailUtil mailUtil;

	@GetMapping("/send")
	public String sendMail() throws Exception{
		mailUtil.sendMail();
		return "success";
	}
}
