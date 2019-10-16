import java.util.Random;

public class ArrayOfPrimitives {
	
	private double[] array;
	
	public ArrayOfPrimitives() {
		
		this.array = new double[100];
		
	}
	
	public void populateArray() {
		
		Random randInt = new Random();
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = randInt.nextDouble();
			
		}
		System.out.println(array.length);
	}
	
	public double getAverage() {
		
		double sum = 0.0; 
		
		for (int i = 0 ; i < array.length ; i++) {
			
			sum += array[i];
		}
		
		return sum / array.length;
		
	}
	
	public String toString() {
		
		String str = "";
		
		for(int i = 0 ; i < array.length ; i++){
			str += array[i];
		}
		
		return str;
	}
 

}
