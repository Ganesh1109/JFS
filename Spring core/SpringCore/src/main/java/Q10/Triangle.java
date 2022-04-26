package Q10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{
	private static ApplicationContext context;
	
	public void draw() {
		System.out.println("hello");
	}
	
	@SuppressWarnings("static-access")
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	 public static Object getBean(String beanName){
		 System.out.println(beanName);
		  return context.getBean(beanName);
	}

	public void setBeanName(String name) {
		System.out.println("bean name : "+name);
	}
	
	
}