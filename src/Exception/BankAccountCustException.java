package Exception;

public class BankAccountCustException {
	double balance;
	public BankAccountCustException(double initialBalance){
		balance=initialBalance;
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new InsufficientFundException("Insufficient Funds to Withdraw, Your available balance is "+ balance);
		}
		else {
			balance=balance-amount;
			System.out.println("Successfully withdraw, Total amount is remaining "+ balance);
		}
	}
	public static void main(String[] args) {
		
		BankAccountCustException b=new BankAccountCustException(2000);
		try {
			b.withdraw(2100);
			
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
