package com.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {

	
	//����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ������InternalResourceViewResolver��ͼ���������������µĽ�����
	//prefix + returnValue + suffix,��/WEB-INF/views/success.jsp
	@RequestMapping("/helloworld")
	public String hello()
	{
		System.out.println("com.handlers.hello-hello()");
		return "success";
	}
	
	
	
}
