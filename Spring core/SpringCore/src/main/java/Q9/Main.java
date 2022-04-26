package Q9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Q9.xml");
		context.registerShutdownHook();
		Triangle t = (Triangle) context.getBean("tri");
  		t.say();
  		context.close();
	}
}
