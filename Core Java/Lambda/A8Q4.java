import java.util.ArrayList;
import java.util.Arrays;

public class A8Q4 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String> (Arrays.asList("Sukumarp","Manikanta", "Ganesh", "Rishi"));
        array.removeIf(s -> ((s.length())%2 != 0));
        System.out.println(array);
    }
}