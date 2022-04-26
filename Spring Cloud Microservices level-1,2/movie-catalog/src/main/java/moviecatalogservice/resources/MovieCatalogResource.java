package moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import moviecatalogservice.models.CatalogItem;
import moviecatalogservice.models.Movie;
import moviecatalogservice.models.Rating;
import moviecatalogservice.models.UserRating;
import moviecatalogservice.services.MovieInfo;
import moviecatalogservice.services.UserRatingInfo;

/*
@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//private WebClient.Builder webClientBuilder;
	
	//@Autowired
	//private DiscoveryClient discoveryClient;   //used to do advanced load balancing in server from the clients.
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId) {
			
		//  this is used for printing directly these default values. instead of this wwe r using ratingdata app's data.
		//  List<Rating> ratings = Arrays.asList( 
		//  	new Rating("123",5), 
		//	new Rating("1234",3), 
		//	new Rating("12345",2) 
		// ); 
		 
		//returning the default catalogItem provided.
		//return ratings.stream().map(rating -> new CatalogItem("RRR","Test",5))
		//.collect(Collectors.toList());
		
		//for directly using restTemplate
		//UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/" + userId,UserRating.class);

		//we had renamed localhost:8083 into ratings-data-service as the spring.application.name for this port is ratings-data-service. when we call localhost:8083/ratingsdata/users/g it'll work as it 
		UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId,UserRating.class);

  		//this is returning values to catalogItem by getting name from the movieInfo application and description is default and ratings will be coming from the ratings list we provided in list ratings.
		return ratings.getUserRating().stream().map(rating ->{
			// for each movie ID, call movie info service and get details
			//below line is by using restTemplate
			//Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(),Movie.class);
			
			//for using movie-info-service in eureka server
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(),Movie.class);
			
			// put them all together
			return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating());
		})
				.collect(Collectors.toList());
	}
	
}*/

//here we r calling using webClientBuilder instead of restTemplate.his WebClientBuilder will give instance of the movie class.this needs to be in 65.
/*Movie movie = webClientBuilder.build()
.get()  //get call
.uri("http://localhost:8082/movies/" + rating.getMovieId())  //from where request needs to be done 
.retrieve() //retrieve the data from the url
.bodyToMono(Movie.class)  //what ever body we get it need to be converted into an instance of movie class. bodyToMono means Decoding the body to the given target type this is asynchronous. mono means u'll get the data but not now, when the data came u can do whatever u wanna do of that data.
.block();*/



//Hystrix

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	MovieInfo movieInfo;
	
	@Autowired
	UserRatingInfo userRatingInfo;
	
	@RequestMapping("/{userId}")
	//@HystrixCommand(fallbackMethod = "getFallbackCatalog")  not needed as all methods have their own hystrix
	public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId) {
		UserRating ratings = userRatingInfo.getUserRating(userId);
		return ratings.getUserRating().stream()
				.map(rating ->{return movieInfo.getCatalogItem(rating);})
				.collect(Collectors.toList());
	}	
}