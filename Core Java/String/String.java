public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String s1 = "Hello World";
		int len = s1.length();
		System.out.println(len);	
		
		java.lang.String s2= "Hello";
		s2=s2.concat("How are you?");
		System.out.println(s2);
		
		java.lang.String str= "Java String pool refers to collection of Strings which are stored in heap memory";
		java.lang.String s3=str.toLowerCase();
		System.out.println(s3);
		
		java.lang.String s4=str.toUpperCase();
		System.out.println(s4);
		
		java.lang.String s5=str.replace("a","$");
		System.out.println(s5);
		
		if(str.contains("collection")) {
		System.out.println(true);}
		else {System.out.println(false);}
		
		boolean s7 = str.equals("java string pool refers to collection of strings which are stored in heap memory");
		System.out.println(s7);
		
		boolean s8 = str.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory");
		System.out.println(s8);		
	}
}
