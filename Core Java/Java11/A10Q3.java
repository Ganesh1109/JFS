import java.util.List;
import java.util.stream.Collectors;

public class A10Q3 {

	public static void main(String[] args) {
		
		
		String Sen = "A\n"
				+ "quick\n"
				+ "brown\n"
				+ "fox\n"
				+ "jumps\n"
				+ "over\n"
				+ "the\n"
				+ "lazy\n"
				+ "dog";
		
		//Sen.lines().forEach(System.out::println);
		List<String> list = Sen.lines().collect(Collectors.toList());
		System.out.println(list);
	}
}