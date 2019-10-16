
public class Main {

	public static void main(String[] args) {

		
		ArrayOfPrimitives a = new ArrayOfPrimitives();
		a.populateArray();
		System.out.println(a.toString());
		System.out.println(a.getAverage());
		
		System.out.println("\n");
		
		ArrayOfInts b = new ArrayOfInts();
		b.populateArray();
		
		System.out.println("\n");
		
		System.out.println(b.toString());
		System.out.println(b.findFirstOccurance(3));
		System.out.println(b.findFirstOccurance(32));
		System.out.println(b.findFirstOccurance(45));
		
		System.out.println(b.findLastOccurance(3));
		System.out.println(b.findFirstOccurance(32));
		System.out.println(b.findFirstOccurance(45));
		
		System.out.println("\n");
		
		System.out.println(b.findAllOccurances(3));
		
		System.out.println("\n");
		
		MultiDimensionalArrays c = new MultiDimensionalArrays(7,7);
		c.populateArray();
		System.out.println(c.toString());

		
		
	}

}
