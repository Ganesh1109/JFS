package collections;

import java.util.TreeMap;
public class A6Q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 938135840, "Ganesh");
		contact.put((long) 950572984, "Sukumar");
		contact.put((long) 942586243, "RISHI");
		contact.put((long) 947686577, "vamsi");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}