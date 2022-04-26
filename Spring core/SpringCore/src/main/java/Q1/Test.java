package Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) 
	{
		context = new ClassPathXmlApplicationContext("Q1.xml");
		Customer c = (Customer) context.getBean("cust");
		c.displayInfo();
	}
}
