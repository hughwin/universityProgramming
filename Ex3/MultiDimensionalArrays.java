
public class MultiDimensionalArrays {
	
	private int[][] arrays;

	public MultiDimensionalArrays(int numberOfRows, int numberOfColumns) {
		
		this.arrays = new int[numberOfRows][numberOfRows];
		
	}
	
	public void populateArray() {
		

		
		for (int i = 0 ; i < arrays.length ; i++) {
			for (int k = 0 ; k < arrays[i].length; k++) {
				if (i <= k) {
				arrays[i][k] = k;
				}
				
			}

		}
		
	}
	
	public String toString() {
		
		String str = "";
		
		for (int i = 0 ; i < arrays.length ; i++) {
			for (int k = 0 ; k < arrays[i].length; k++) {
				str += arrays[i][k] + " ";
			}
			str += "\n";
		
	}
		return str;
	
}
}
