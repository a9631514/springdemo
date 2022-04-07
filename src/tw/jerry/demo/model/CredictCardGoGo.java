package tw.jerry.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CredictCardGoGo implements CredictCard {

	public CredictCardGoGo() {
	}

	@Override
	public void uesCard(String message) {
		System.out.println("GoGo card: " + message);

	}

}
