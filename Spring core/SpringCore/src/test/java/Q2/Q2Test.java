package Q2;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q2Test {

	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q2.xml");	      
	    Question q= (Question) context.getBean("List");   
	    ArrayList <String> l = new ArrayList<String>();
	    l.add("i am Ganesh");
	    l.add("i am from Vijayawada");
	    Question qL = new Question(1,"who are you? where r u from?",l);
	    assertEquals(q.toString(), qL.toString());

	}
	
}