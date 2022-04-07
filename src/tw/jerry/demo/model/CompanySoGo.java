package tw.jerry.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CompanySoGo {
	
	@Autowired
	@Qualifier(value = "credictCardHappy")
	private CredictCard credictCard;
	
	
	public CompanySoGo() {
	}
	
	public void usecard() {
		credictCard.uesCard("來sogo刷卡送雨傘");
	}

}
