
public class Ex4 {
	
	public static void main(String [] args) {
	
	String firstName = "Hugh";
	String lastName = "Winchester";
	String fullName = firstName + " " + lastName;
	System.out.println(fullName);
	
	
	NumberOfPies a = new NumberOfPies(8,2);
	NumberOfPies b = new NumberOfPies(6,3);
	NumberOfPies c = new NumberOfPies(7,3);
	
	System.out.println(a.howMuchDoesEachPersonGet());
	System.out.println(b.howMuchDoesEachPersonGet());
	System.out.println(c.howMuchDoesEachPersonGet());

	PrintMessage message = new PrintMessage("This is the message that is going to be printed.");
	
	message.printMessageOut();
	
	AreaOfCircle compCircle = new AreaOfCircle(5.6);
	compCircle.compArea();
	
	System.out.println(compCircle.summariseCircle());
	
	String unaltered = "This string is unaltered";
	System.out.println(unaltered);
	
	String altered = concatonater(unaltered);
	
	System.out.println(altered);
	System.out.println(unaltered);
	
	System.out.println("");
	
	int sum = 5*(4+11-6)/3+2;
	
	System.out.println(sum);
	

	
	
	}
	
	public static String concatonater(String str) {
		
		return str + " this has been added on the end";
		
	}
	
	
}
