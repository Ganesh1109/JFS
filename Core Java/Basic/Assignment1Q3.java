import java.util.Scanner;
class SiCi {
    public static double simpleInterest(double principalAmount, int time, double interestRate){
        double si;
        si = principalAmount * time * interestRate/100 ;
        return si;
    }
    public static double compoundInterest(double principalAmount, int time, double interestRate){
        double ci = principalAmount * (Math.pow(1 + interestRate / 100, time));
        return ci ;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner s3= new Scanner(System.in);
        System.out.print("Please enter your principle amount - ");
        double a = s3.nextDouble();
        System.out.print("Please enter the time - ");
        int t = s3.nextInt();
        System.out.print("Please enter the interest rate - ");
        double i = s3.nextDouble();
        System.out.print("Please select your choice : 1 - simple interest , 2 : Compound interest - ");
        int c = s3.nextInt();
        if(c == 1 ){
            System.out.print(SiCi.simpleInterest(a,t,i));
        }
        else if (c == 2) System.out.print(SiCi.compoundInterest(a, t, i));
    }
}