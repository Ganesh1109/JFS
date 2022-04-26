package Q1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q1Test {

	private static ApplicationContext context;

	@Test
	public void test() {
		context = new ClassPathXmlApplicationContext("Q1.xml");
		Customer c = (Customer) context.getBean("cust");
		assertEquals(23, c.getCustID());
	}
}