/* Gavin Broussard
 * 895890468
 * CSC 4330
 * Fall2020Testing Assignment
 * 
 * This file serves as basic utilities.
 * Method creation was driven by UtilitiesTest.java.
 *  
 */
public class Utilities {
	
/* Selection sort method that takes an array as input 
 * and sorts it in ascending order 
 */
	public static void SelectionSort(int[] array) {
		int len = array.length;
		
		for (int i = 0; i < len-1; i++) {
			int min = i;
			for (int j = i+1; j < len; j++) {		
				if (array[j] < array[min])
					min = j;
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	
/* Method that takes an array as input and returns either true or false
 * depending on whether there is a repeated number or not
 */
	public static boolean RepeatedNumber(int array[]) {
		
		int len = array.length;
        boolean ifPresent = false;
 
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (array[i] == array[j]) {
                	ifPresent = true;
                }
            }
        }
        return ifPresent;
	}
	
	public static int Fibonacci(int num) {
		if (num <= 1)
			return num;
		return Fibonacci(num -1) + Fibonacci(num -2);
	}
	
	/* This method was provided by the assignment.
	 * The objective was to design tests with full path coverage.
	 * Then, create two mutant methods.
	 * See UtilitiesTest.java getResultsTest() for path coverage.
	 */
	public static int getResults(int num) {
		if(num < 0)
			num = num * -1;
		if(num >= 20) {
			if(num % 2 == 0)
				return num;
			else
				return num + 1;
		}
		else {
			num = num + 20;
			if(num % 2 == 0)
				return num;
			else return num + 1;
		}
	}
	
	public static int getResultsFirstMutant(int num) {
		// inverted all comparison signs
		if(num > 0)
			num = num * -1;
		if(num <= 20) {
			if(num % 2 != 0)
				return num;
			else
				return num + 1;
		}
		else {
			num = num + 20;
			if(num % 2 != 0)
				return num;
			else return num + 1;
		}
	}
	
	public static int getResultsSecondMutant(int num) {
		if(num < 5) // 0 changed to 5
			num = num + 16; // add 16
		if(num >= 20) {
			if(num % 2 == 0)
				return num;
			else
				return num + 1;
		}
		else {
			num = num + 20;
			if(num % 2 == 0)
				return num;
			else return num + 1;
		}
	}
}
