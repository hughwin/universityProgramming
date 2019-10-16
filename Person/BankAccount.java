
public class BankAccount {
	
	private String accName; 
	static int accNumber;
	private double accBalance;
	private int nextAccountNumber;
	
	public BankAccount(Person person) {
		accName = person.getName();
		accBalance = 0.0;
		nextAccountNumber = accNumber++;
			
	}
	
	public double getBalance() {
		return accBalance;
	}

	public int getAccNumber() {
		return accNumber;
	}
	
	public void deposit(double amount) {
		this.accBalance += amount;
	}
	
	public void withdraw(double amount) {
		this.accBalance -= amount;
	}
	
	public void transferFunds(double amount, BankAccount transferredTo) {
		transferredTo.deposit(amount);
		accBalance -= amount;
	}
	
	public String toString() {
		return ("Account name: " + accName + "\n") + ("Account number: " + accNumber + "\n") + ("Account balance: " + accBalance);
		
	}


}
