package tw.jerry.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.LoginDao;

public class Demo2LoginDaoAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LoginDao loginDao = context.getBean("loginDao", LoginDao.class);
		
		boolean result = loginDao.checkLogin("jetty", "pwdd222");
		
		System.out.println("result: " + result);
		
		context.close();

	}

}
