import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class Assignment4Q3 {
    static double current_balance = 100;
    
    public static void main(String[] args) throws RuntimeException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to withdrawal : ");
        int n = s.nextInt();
        try {
            if (current_balance > 0 && current_balance < n){
                throw new InsufficientResourcesException("InsufficientBalance ");
            }  
        }
        catch (InsufficientResourcesException isb) {
            isb.printStackTrace();
        }
        try {
        	if (n < 0) {
                throw new IllegalBankTransactionException();
            }
        }
        catch (IllegalBankTransactionException ilb) {
            ilb.printStackTrace();
        }
    }
}