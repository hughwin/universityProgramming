
public class AreaOfCircle {
	
	private double radius;
	
	public AreaOfCircle(double radius) {
		
		this.radius = radius; 
		
	}
	
	public double compArea(){
		double area =  Math.PI * (radius * radius);
		System.out.println(area);
		return area;
	}
	
	public double compCircumference(){
		double circumfrence = 2 * Math.PI * radius;
		return circumfrence;
	}
	
	public String summariseCircle() {
		return compArea() + " " + compCircumference();
	}
	
}
