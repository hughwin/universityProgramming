import java.util.Scanner;
public class Lab3Ex1 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		getNameAndAge(keyboard);
		
		
		System.out.println("Please enter your name, followed by the return key.");
		String userEntry = keyboard.nextLine();
		System.out.println("Hello " + userEntry);
		System.out.println("How old are you? Enter your age in the line below.");
		int age = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println(userEntry + ", you are " + age);
		
		System.out.println("Okay, we're going to work out the size of a circle.");
		System.out.println("Enter the size of your circle below");
		
		double radiusOfCircle = keyboard.nextDouble();
		
		AreaOfCircle a = new AreaOfCircle(radiusOfCircle);
		
		a.compArea();
		
		
		
	}
	
	public static void getNameAndAge(Scanner keyboard) {
		
		System.out.println("Enter your first name and age seperated by a space");
		String name = keyboard.next();
		int age = keyboard.nextInt();
		
		System.out.println("You are: " + name + "\n and you are " + age);
		
		
		
		
	}
}
