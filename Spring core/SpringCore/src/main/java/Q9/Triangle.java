package Q9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean{
	
	public void say() {
		System.out.println("Hello");
		
	}
	public void afterPropertiesSet() throws Exception {  //this is executed before all in bean before default-init given in beans
		System.out.println("Initializing Bean is printing");
		
	}
	public void destroy() throws Exception {  //this is executed after all beans are done executing before default-destroy-method
		System.out.println("Disposable of Bean is printing");
	}
	
	public void myInit() {  //this method is called in default-init in beans but this will be executed after init-method in bean
		System.out.println("method myInit is called in beans of Q9.xml as default is printing");
	}
	public void myDestroy() {  //this is a method which is used to call in default in beans
		System.out.println("method myDestroy is called in beans of Q9.xml as default is printing");
}
}