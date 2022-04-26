package Q10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Q10.xml");
		Triangle t = (Triangle) context.getBean("tri");
  		t.draw();
  		context.close();
	}
}
