import java.util.Scanner;

interface myadd{
	int add(int a,int b);
}

interface mysub{
	int sub(int a,int b);
}

interface mymul{
	int mul(int a,int b);
}

interface mydiv{
	int div(int a,int b);
}

public class A8Q1 {
public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
	   	System.out.print("Enter number 1 : ");
	   	int num1 = n1.nextInt();
	   	System.out.print("Enter number 2 : ");
	   	int num2 = n1.nextInt();
		myadd A = (a,b) -> {return (a+b);};
		System.out.println("number 1 + number 2 : "+ A.add(num1,num2));
		mysub S = (a,b) -> {return (a-b);};
		System.out.println("number 1 - number 2 : "+S.sub(num1, num2));
		mymul M = (a,b) -> {return (a*b);};
		System.out.println("number 1 * number 2 : "+M.mul(num1, num2));
		mydiv D = ( a, b) -> {return (int) (a/b);};
		System.out.println("number 1 / number 2 : "+D.div(num1, num2));
	}
}