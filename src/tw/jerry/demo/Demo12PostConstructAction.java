package tw.jerry.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Employee;

public class Demo12PostConstructAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = context.getBean("employee",Employee.class);
		
		emp.setId(1);
		emp.setName("Mary");
		
		
		System.out.println("id: "+ emp.getId());
		System.out.println("Name: "+ emp.getName());
		System.out.println("vacation: "+ emp.getVacation());
		
		context.close();
		
	}

}
