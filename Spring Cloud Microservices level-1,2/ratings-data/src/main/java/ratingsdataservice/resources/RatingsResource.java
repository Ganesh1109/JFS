package ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ratingsdataservice.models.Rating;
import ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	/*@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("123", 4),
				new Rating("456", 3)
		);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}*/
	
	//this is not good way bcz an api is returning lists
	@RequestMapping("/users/{userId}")
	//public List<Rating> getUserRating(@PathVariable("userId") String userId) {
	public UserRating getUserRating(@PathVariable("userId") String userId) {

		List<Rating> ratings = Arrays.asList(
				new Rating("5",5),
				new Rating("3",1)
				);
		//return ratings;  this is for returning the lists given for every api call
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}

}