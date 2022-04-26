package Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("bankrepo")
public class BankAccountrepositoryImpl implements BankAccountRepository {

    private BankAccount1 Account1;
    private BankAccount1 Account2;

    public BankAccount1 getBankAccount1() {
		return Account1;
	}

    @Autowired
	public void setBankAccount1(BankAccount1 bankAccount1) {
		this.Account1 = bankAccount1;
	}


	public BankAccount1 getBankAccount2() {
		return Account2;
	}

	@Autowired
	public void setBankAccount2(BankAccount1 bankAccount2) {
		this.Account2 = bankAccount2;
	}
  
    public double getBalance(long accountId) {

        if(this.Account1.getAccountId()==accountId){
           return Account1.getAccountBalance();
        }
        else{
           return Account2.getAccountBalance();
        }

    }

    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.Account1.getAccountId()==accountId){
             updatedBal = newBalance;
             Account1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             Account2.setAccountBalance(updatedBal);
         }

        return updatedBal;
    }
}