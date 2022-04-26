import java.util.*;
class AmstrongOrNot {
	public static boolean amstrongCheck(int num) {
		int a,b,c=0,temp;
		temp = num;
		while(temp>0) {
			a=temp%10;
			b=a*a*a;
			c= c+b;
			temp = temp/10;
		}
		return c==num; 
	}
public class Assignment1Q1{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter number -");
		int num = s1.nextInt();
		if(AmstrongOrNot.amstrongCheck(num))
			System.out.print("the given number "+num+" is amstrong number");
		else
			System.out.print("the given number "+num+" is not amstrong number");
				
	}
	
}
}
