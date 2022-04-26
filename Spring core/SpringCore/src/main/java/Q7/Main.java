package Q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Q7.xml");
		Customer c1 = (Customer) context.getBean("Customer1");
		Customer c2 = (Customer) context.getBean("Customer2");
		System.out.println(c1.custString());
		System.out.println(c2.custString());		
	}

}