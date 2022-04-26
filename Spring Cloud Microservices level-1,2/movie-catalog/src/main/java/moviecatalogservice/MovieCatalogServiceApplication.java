package moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class MovieCatalogServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
		//by the below code the httpComponentsClientHttpRequestFactory will wait for 3 seconds to get response for the request if not it throws error. 
		/*HttpComponentsClientHttpRequestFactory clientHttpRequest = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequest.setConnectTimeout(3000);  //here we set the timelimit for 3sec
		return new RestTemplate(clientHttpRequest);*/
	}

	//this is created for not creating instance class every time but creating on it's own when ever a catalogItem is called. this is similar like restTemplate
	/*@Bean
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();
	}*/
	
}