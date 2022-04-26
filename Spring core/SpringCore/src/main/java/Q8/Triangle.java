package Q8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangle {

	private String name;
	
	public void hi() {

		System.out.println("Hello " + name);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@PostConstruct
	public void myInit() {
		System.out.println("initializing in annotation");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("Destroying using annotation");
	}
}
