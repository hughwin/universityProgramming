import java.lang.reflect.Array;
import java.util.Random;


public class ArrayOfInts {

	private int[] array;

	public ArrayOfInts() {
		this.array = new int[100];
	}

	public void populateArray() {

		Random randInt = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = randInt.nextInt(10) + 1;

		}
		System.out.println(array.length);
	}

	public int findFirstOccurance(int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public int findLastOccurance(int num) {
		for (int i = array.length -1; i >=0 ; i--) {
			if (array[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public String findAllOccurances(int num) {
		int[] allOccurances = new int[100];
		
		for (int i = 0 ; i < allOccurances.length ; i++) {
			allOccurances[i] = -1;
		}
		
		
		int arrayCounter = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			
			if (array[i] == num) {
				allOccurances[arrayCounter] = i;
				arrayCounter++;					
			}

		}
		return toString(allOccurances);	
		
	}
	
	public String toString() {
		
		String str = "";
		
		for(int i = 0 ; i < array.length ; i++){
			str += array[i] + " ";
		}
		
		return str;
	}
	
	public String toString(int[] array) {
		
		String str = "";
		
		for(int i = 0 ; i < array.length ; i++){
			str += array[i] + " ";
		}
		
		return str;
	}


}
