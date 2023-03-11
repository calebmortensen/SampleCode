
public class Demo {

	public static void main(String[] args) {
		
		int _x = 1;
		int $y = 2;
		
		int[] array = new int[3];
		array[0]=0;
		array[1]=15;
		array[2]=22;
		for(int i=0; i<array.length; i++) {
			System.out.println("The value of index is "+i+ " and array value is: "+array[i]);
			
		}
		
		int[][] matrix = new int[5][5];
		int initialValue = 10;
		
		for(int row = 0; row<5; row++) {
			for(int col =0; col<5; col++) {
				matrix[row][col] = initialValue++;
				System.out.println("\t"+matrix[row][col]);
			}
			System.out.println();
		}

	}

}
