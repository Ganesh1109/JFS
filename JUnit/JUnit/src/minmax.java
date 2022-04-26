import java.util.Arrays;

public class minmax {
	public static String findMinMax(int[] arr) {
        int min = (Arrays.stream(arr).min().getAsInt());
        int max = (Arrays.stream(arr).max().getAsInt());
        return "Min is "+ min+" Max is "+max;
    }
}
