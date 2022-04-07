package tw.jerry.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.jerry.demo.model.CredictCard;

public class Demo8ComponentAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CredictCard card = context.getBean("credictCardGoGo",CredictCard.class);
		
		card.uesCard("買咚咚");
		
		
		context.close();
	}

}
