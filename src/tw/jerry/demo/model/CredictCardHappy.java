package tw.jerry.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CredictCardHappy implements CredictCard {

	public CredictCardHappy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void uesCard(String message) {
		System.out.println("Happy card: " + message);

	}

}
