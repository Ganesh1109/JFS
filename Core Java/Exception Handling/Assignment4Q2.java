import java.util.Scanner;
class divison  {
    public static void solve() throws UnsupportedOperationException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Dividend number:");
        int dividend = s.nextInt();
        System.out.print("Enter Divisor number:");
        int divisor = s.nextInt();
        try {
            if (divisor == 0) {
                throw new UnsupportedOperationException();
            }
            int result = dividend / divisor;
            System.out.print("Result is:" + result);
        } 
        catch (UnsupportedOperationException e) {
            e.printStackTrace();
        } 
    }
}
public class Assignment4Q2 {
    public static void main(String[] args)  {
        divison.solve();
        }
}
