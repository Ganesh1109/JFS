package Q2;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q2.xml");	      
	    Question list= (Question) context.getBean("List");   
	    System.out.println("List Injection:\n"+list);
	   
	    Question set= (Question) context.getBean("Set");  
	    System.out.println("\nSet Injection:\n"+set);
	    
	    Question map= (Question) context.getBean("Map");  
	    System.out.println("\nMapInjection:\n"+map.toStringMap());
	}
}