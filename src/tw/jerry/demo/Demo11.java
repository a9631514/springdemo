package tw.jerry.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Phone;

public class Demo11 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    Phone phone = (Phone) context.getBean("myPhone",Phone.class);
	    
	    System.out.println("id: "+ phone.getId());
	    System.out.println("phonename: "+ phone.getPhoneName());
	    System.out.println("phoneBrand: "+ phone.getPhoneBrand());
	    
	    context.close();
		
	}

}
