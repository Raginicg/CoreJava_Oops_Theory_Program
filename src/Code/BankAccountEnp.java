package Code;

/*
 * Hiding the data behind the method
 */
public class BankAccountEnp {

//	If the variable is private we can not access outside the class
	private long accountNumber;
	private String accountHolderName;
	
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
