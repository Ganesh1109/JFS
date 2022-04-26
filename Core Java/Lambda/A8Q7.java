import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A8Q7 {
    public static String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        @SuppressWarnings("rawtypes")
		Consumer <Map.Entry>  c=(i)-> sb.append(i.getKey()).append(i.getValue());
        Set< Map.Entry <String, Integer> > s  = map.entrySet();
        s.forEach(c);
        return sb.toString();
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Ganesh",11);
        m.put("VamsiP",12);
        m.put("Manikanta",13);
        Consumer C = (i) -> System.out.println(convertKeyValueToString(m));
        C.accept(m);
    }
}