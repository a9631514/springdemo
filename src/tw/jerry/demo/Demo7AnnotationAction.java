package tw.jerry.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.Student;

public class Demo7AnnotationAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student stu1 = (Student) context.getBean("student");
		
		stu1.setId(1);
		stu1.setName("Tim");
		stu1.setNickname("Tim 哥");
		
		System.out.println("nickname: "+ stu1.getNickname());
		
		context.close();
		
	}

}
