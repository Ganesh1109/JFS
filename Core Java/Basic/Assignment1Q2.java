import java.util.Scanner;

class AmstrongNumBetweenRange{
    public static int[] amstrongNumbersInRange(int min, int max) {
        for (int i = min; i <= max;i++){
            if (AmstrongOrNot.amstrongCheck(i)) {
                System.out.print(i+" ");
            }
        }
        return null;
    }
}
public class Assignment1Q2 {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter the first number-");
        int min = s2.nextInt();
        System.out.print("Enter the number-");
        int max = s2.nextInt();
        AmstrongNumBetweenRange.amstrongNumbersInRange(min,max);
    }
}
