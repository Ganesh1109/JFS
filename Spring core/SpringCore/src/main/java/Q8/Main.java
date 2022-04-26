package Q8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Q8.xml");
		context.registerShutdownHook();
		Triangle t = (Triangle) context.getBean("tri");
  		t.hi();
  		context.close();
	}
}
