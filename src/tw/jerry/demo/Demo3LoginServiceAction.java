package tw.jerry.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.service.LoginService;

public class Demo3LoginServiceAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		LoginService service = context.getBean("loginService", LoginService.class);
		
		boolean result1 = service.checkLogin("jerry", "pwdd");
		
		System.out.println("result1: " + result1);
		
		LoginService service2 = (LoginService) context.getBean("loginService2");
		
		boolean result2 = service2.checkLogin("jerry", "pwdd");
		
		System.out.println("result2: " + result2);
		
		context.close();
	}

}
