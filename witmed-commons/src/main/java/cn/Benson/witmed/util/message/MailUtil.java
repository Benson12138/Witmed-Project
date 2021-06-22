package cn.Benson.witmed.util.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

@Component("mailUtil")
public class MailUtil {
	@Autowired
	private JavaMailSender mailSender;

	public void sendMail() throws Exception{
		//创建邮件信息对象
		MimeMessage mailMessage = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true);
		//设定发件人信息
		messageHelper.setFrom("wzb514808468@163.com");
		//设定收件人信息
		messageHelper.setTo("514808468@qq.com") ;
		//设置抄送人信息
		messageHelper.setCc("wzb514808468@163.com");
		//设置邮件主题
		messageHelper.setSubject("王智斌");
		//设置邮件内容
		messageHelper.setText("<h1><mark>王智斌</mark></h1><h1>18706714326</h1>",true);
		//使用 mailSender 发送邮件
		mailSender.send(mailMessage);
	}
}
