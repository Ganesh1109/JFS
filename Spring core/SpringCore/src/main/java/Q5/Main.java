package Q5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Q5.xml");
		context.registerShutdownHook();
		
		
		Shape t = (Shape) context.getBean("tri");
  		t.draw();
  		
		
		Shape s = (Shape) context.getBean("circle");
		s.draw();
		 
	}
}
