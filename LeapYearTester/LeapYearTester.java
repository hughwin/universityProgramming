import java.time.LocalDate;
import java.time.Period;

public class LeapYearTester {

	public static void main(String[] args) {

		boolean a = leapYearTester(2500); // false 
		boolean b = leapYearTester(2200); // false 
		boolean c = leapYearTester(2000); // true
		boolean d = leapYearTester(800);
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		int first = months("Feb", 2500);
		int second = months("Feb", 2000);
		int third = months ("Jan", 2019);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		LocalDate today = LocalDate.now();
		LocalDate myBirthday = LocalDate.of(1990, 9, 25);
		
		System.out.println(howOldAmI(myBirthday, today));
		
		myBirthday = LocalDate.of(1990, 9, 26);	
		
		System.out.println(howOldAmI(myBirthday, today));
		
		for (int i = 0 ; i <= 2000; i++) {
			System.out.println(i + " " + leapYearTester(i));
		}
		
		
		

	}
	
	public static boolean leapYearTester(int year) {
		
		
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0){
				return false;
			}

			return true;
			
		}
		
		return false;

		
	}
	
	public static int months(String month, int year) {
		
		if (month.equals("Jan")) {
			
			return 31;
			
		}
		
		if (month.equals("Feb")) {
			
			if (leapYearTester(year)) {
				return 29;
			}
			else {return 28;}
		}
		
		if (month.equals("Mar")) {
			return 31;
		}
		
		if (month.equals("Apr")) {
			return 30;
		}
		
		if (month.equals("May")) {
			return 31;
		}
		
		if (month.equals("Jun")) {
			return 30;
		}
		
		if (month.equals("Jul")) {
			return 31;
		}
		
		if (month.equals("Aug")) {
			return 31;
		}
		
		if (month.equals("Sep")) {
			return 30;
		}
		
		if (month.equals("Oct")) {
			return 31;
		}
		
		if (month.equals("Nov")) {
			return 30;
		}
		
		if (month.equals("Dec")) {
			return 31;
		}
		return 0;
		
		
	}
	
	public static int howOldAmI(LocalDate birthDate, LocalDate currentDate) {
		
		if ((birthDate != null) && (currentDate != null)) {
			return Period.between(birthDate, currentDate).getYears();
		}
		else {return 0;}
	}

}
