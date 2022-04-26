import java.util.Scanner;

public class Assignment4Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Dividend Value : ");
		int Dividend = sc.nextInt();
		System.out.print("Enter the Divisor Value : ");
		int Divisor =sc.nextInt();
		try {		
		int Result = Dividend/Divisor;
		System.out.println("Result is "+Result);
		}
		catch (ArithmeticException e)
		{
			throw new ArithmeticException("Divisor is 0");
			//e.printStackTrace();
		}
	}
}