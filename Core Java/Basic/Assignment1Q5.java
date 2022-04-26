import java.util.Scanner;

class TaxAmount{
    public static double calculateTaxAmount(int ctc){
    	double tax=0;
    	if(ctc<180000) {tax=0;}
    	else if(ctc>=181001 && ctc<=300000) {tax=(ctc/100)*10;}
    	else if(ctc>=300001 && ctc<=500000) {tax=(ctc/100)*20;}
    	else if(ctc>=500001 && ctc<=1000000) {tax=(ctc/100)*30;}
        return tax;
    }

}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner s5 = new Scanner(System.in);
    	System.out.print("Enter ctc value - ");
    	int ctc = s5.nextInt();
    	System.out.print("tax amount is - "+TaxAmount.calculateTaxAmount(ctc));
    	
    	
    }
}