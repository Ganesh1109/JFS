
public class stringbuffer {
	public static void main(java.lang.String[] args) {
		StringBuffer s1 = new StringBuffer();
		s1.append("StringBuffer");
		System.out.println(s1);
		s1.append(" is a peer class of String");
		System.out.println(s1);
		s1.append(" that provides much of");
		s1.append(" the functionality of strings");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("It is used to _ at the specified index position");
		System.out.println(s2);
		s2.insert(15, "insert text");
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("This method returns the reversed object on which it was called");
		//s3.reverse();
		System.out.println(s3.reverse());
		
		System.out.println("----------------------------------------------");
		StringBuilder sb1 = new StringBuilder();
		sb1.append("StringBuilder");
		System.out.println(sb1);
		sb1.append(" is a peer class of String");
		System.out.println(sb1);
		sb1.append(" that provides much of");
		sb1.append(" the functionality of strings");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("It is used to _ at the specified index position");
		System.out.println(sb2);
		sb2.insert(15, "insert text");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("This method returns the reversed object on which it was called");
		//s3.reverse();
		System.out.println(sb3.reverse());
		
	}

}
