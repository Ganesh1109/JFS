package springbootconfigure;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetController {

	//getting value of my.greeting from application.properties and read it ad a string and return in greeting() method.
	//if my.greeting not available then error occurs while running the application.
	
	//in application.properties if we give a value for my.greeting from githubrepo that will override the already given assigned value in application.properties
	@Value("${my.greeting}")  
	private String greetingMessage;
	
	//giving default value to the my.greeting if my.greetings is not assigned to any value in application.properties
	@Value("${my.greeting: default value}")  
	private String greetingMessagee;
	
	//this returns the list of values that are assigned in  application.properties
	@Value("${my.list.values}")
	private List<String> listValues;
	
	//this returns the hard coded value in @Value in the below line
	@Value("some static message")
	private String staticMessage;
	
	
	//the given values of application.properties will be override with the values from a file in github repo.
	@Value("#{${dbValues}}")
	private Map<String,String> dbValues;
	
	@Autowired
	private DBSettings dbSettings;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String greeting() {
		//return "Hello";  //here we are giving the direct hardcoded return value
		//return  listValues + greetingMessagee + staticMessage + dbValues ;  //here we are getting the return value from the application.properties for that we created a private String and assigned the value of app.properties to this private String.
		return dbSettings.getConnection() + dbSettings.getHost() + dbSettings.getPort() + greetingMessage;
	}
	
	//this returns all the details about the sources and profiles that are active at that time
	@GetMapping("/envdetails")
	public String envDetails() {
		return env.getProperty(greetingMessage);
	}
	
}
