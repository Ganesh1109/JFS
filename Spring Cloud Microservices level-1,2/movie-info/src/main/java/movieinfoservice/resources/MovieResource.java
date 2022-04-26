package movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import movieinfoservice.models.Movie;
import movieinfoservice.models.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		//return new Movie(movieId, "Test name");  //this jst returns the movieId name we give and "Test Name"
		int i=Integer.valueOf(movieId);
		//we r collecting the data from the moviedb website
		MovieSummary movieSummary = restTemplate.getForObject(
				"https://api.themoviedb.org/3/movie/" + i + "?api_key=" + apiKey,
				MovieSummary.class);
		return new Movie(movieId,movieSummary.getTitle(),movieSummary.getOverview());
	}
}