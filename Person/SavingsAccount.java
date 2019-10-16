
public class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(Person person, double interestRate) {
		super(person);
		this.setInterestRate(interestRate);
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterestRate() {
		double amountToBeAdded = interestRate * this.getBalance();
		this.deposit(amountToBeAdded);
	}

	public void withdraw(double amount) {
		if((this.getBalance() - amount) > 0) {
			this.withdraw(amount);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	
	

}
