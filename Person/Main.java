
public class Main {

	public static void main(String[] args) {
		Person a = new Person("Hugh", 29);
		System.out.println((a.toString()));
		
		Person d = new Person("Jeremy", 25);
		
		
		BankAccount b = new BankAccount(a);
		System.out.println(b.getAccNumber());
		
		BankAccount c = new BankAccount(d);
		System.out.println(c.getAccNumber());
		
		
		c.deposit(100.00);
		c.withdraw(50.50);
		c.withdraw(60.00);
		System.out.println(c.toString());
		
		
		b.deposit(100.00);
		b.transferFunds(75.00, c);
		
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		
		Student poorStudent = new Student("Sarah", 19);
		poorStudent.setGPA(4.0);
		System.out.println(poorStudent.toString());
		
		SavingsAccount sarahAccount = new SavingsAccount(poorStudent, 0.1);
		sarahAccount.deposit(100.00);
		
		sarahAccount.addInterestRate();
		System.out.println(sarahAccount.toString());
		
		
		
	}

}
