import java.util.ArrayList;
class CurrentAccount extends A2Q3 
{
    int creditLimit = 5000;
    public CurrentAccount(String name) 
    {
        super(name);
    }
    public int withdraw(int amount) 
    {
        if (getCash() > amount) 
        {
            totalDeposits -= amount;
            return -(amount);
        }
        else if((getCash()+creditLimit)>amount)
        {
            this.creditLimit -= amount-totalDeposits;
            totalDeposits -= amount;
            return -(amount);
        }
        else
        {
            return 0;
        }
    }
    public int getCash() 
    {
        return (totalDeposits);
    }
}
class SavingsAccount extends A2Q3 
{
    int fixedDepositAmount = 50000;
	public SavingsAccount(String name) 
	{
		super(name);
	}
	public int getCash() 
	{
	    return (fixedDepositAmount+totalDeposits);
	}
	public int withdraw(int amount) 
	{
	    if (getCash() > amount)
	    {
	        totalDeposits -= amount;
	        return -(amount);
	    } 
	    else {
	        return 0;
	    }
	}
}
public  class A2Q3
{
    static ArrayList<Integer> totalCashInBank;
    @SuppressWarnings("unused")
	private String name;
    protected int totalDeposits=0;
    public A2Q3(String name) 
    {
        this.name = name;
    }
    public int deposit(int amount) 
    {
        this.totalDeposits += amount;
        return amount;
    }
    public int withdraw(int amount)
    {
        if (totalDeposits > amount)
        {
            totalDeposits -= amount;
            return -amount;
        } else 
        {
            return 0;
        }
    }
    public static int totalCashInBank(ArrayList<Integer> cash)
    {
        int total = 0;
        for(int i =0;i<cash.size();i++)
        {
            total += cash.get(i);
        }
        return total;
    }
    public int getCash()
    {
        return totalDeposits;
    }
    public static void main(String[] args) 
    {
        totalCashInBank = new ArrayList<Integer>();
        A2Q3 acc1 = new SavingsAccount("acc1");
        A2Q3 acc2 = new CurrentAccount("acc2");
        SavingsAccount acc3 = new SavingsAccount("acc3");
        CurrentAccount acc4 = new CurrentAccount("acc4");
        totalCashInBank.add(acc1.deposit(500));
        totalCashInBank.add(acc2.deposit(600));
        totalCashInBank.add(acc3.deposit(700));
        totalCashInBank.add(acc4.deposit(1000));
        totalCashInBank.add(acc3.withdraw(2000));
        totalCashInBank.add(acc2.withdraw(200));
        System.out.println("Balance amount : "+totalCashInBank((totalCashInBank)));
    }
 }