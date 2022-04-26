public class A1Q3 {
	public static  void withdraw(int n) throws Exception {
        int Balance = 1000;
        if (n > Balance) {
            throw new InsufficientFundsExpcetion("funds not sufficient");
        }
	
	}

}