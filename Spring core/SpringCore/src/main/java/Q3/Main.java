package Q3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Q3.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");

        System.out.println("Balance of id 1 : "+controller.getBalance(1));
        System.out.println("Balance of id 2 : "+controller.getBalance(2));
        System.out.println("\ndeposit into id 1 : "+controller.deposit(1,5000));
        System.out.println("withdrraw from id 1 : "+controller.withdraw(1,2000));
        System.out.println("\nBalance of id 1 : "+controller.getBalance(1));
        System.out.println("\nFund transfer from id 1 to id 2 : "+controller.fundTransfer(1,2,500));
        System.out.println("\nBalance of id 1 : "+controller.getBalance(1));
        System.out.println("Balance of id 2 : "+controller.getBalance(2));
        context.close();
       
    }
}