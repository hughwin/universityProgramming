
public class Student extends Person {

	private double GPA;

	public Student(String name, int age) {
		super(name, age);
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public String toString() {
		return getName() + "'s GPA is " + GPA;}

}
