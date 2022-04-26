package moviecatalogservice.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import moviecatalogservice.models.Rating;
import moviecatalogservice.models.UserRating;

@Service
public class UserRatingInfo {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackCatalogUserRating")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		return restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" +userId, UserRating.class);
	}
	
	public UserRating getFallbackCatalogUserRating(@PathVariable("userId") String userId) {
		UserRating userRating = new UserRating();
		userRating.setUserRating(Arrays.asList(
				new Rating("0",0)
				));
		return userRating;
	}
	
}
