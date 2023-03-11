
public class StringArgs {

	public static void main(String[] args) {
		//System.out.println("Greetings "+args[0]+ " "+args[1]);
		//javac then java to run from TERMINAL
		
		//enhanced loop
		int[] array1 = new int[3];
		if(array1 != null) {
		for(int value : array1) {
			System.out.println(value);
	}
		}
		int [] array2 = new int[] {11,22,33,44,55};
		System.out.println(array2[0]); //11
		
		int noOfVacationDays = 50;
		String result = noOfVacationDays >= 50 ? "Vacation days exhausted" : "Still more days";
		System.out.println(result);
		
		boolean falseFlag = false;
		boolean trueFlag = true;
		
		//System.out.println("OR operator >> "+(falseFlag || trueFlag)); //true
		//System.out.println("AND operator >> "+(falseFlag && trueFlag)); //false
		
		if(falseFlag) {
			System.out.println("It's not false");
		}else {
			System.out.println("So this gets printed");
		}
	}
	
	
//while loop, condition is checked 1st
//do while loop, condition is checked after


}