/* Gavin Broussard
 * 895890468
 * CSC 4330
 * Fall2020Testing Assignment
 * 
 * Tests were created before implementing each method.
 * 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilitiesTest {
	
	//creating new reference to Utilities.java callled util 
	Utilities util = new Utilities(); 
	
	@Test
	public void SelectionSortTest() {
		
		//creating test int arrays to be sorted
		int[] test01 = {0,1,2,3,4,5,6,7,8,9}; //base case, already sorted 
		int[] test02 = {9,8,7,6,5,4,3,2,1,0};
		int[] test03 = {3,2,4,1,5,8,6,7,0,9};
		int[] test04 = {9,0,7,8,5,6,4,3,2,1};
		
		//using Utilities to sort the test arrays
		util.SelectionSort(test01);
		util.SelectionSort(test02);
		util.SelectionSort(test03);
		util.SelectionSort(test04);
	
		//creating expected int array
		int[] expected = {0,1,2,3,4,5,6,7,8,9};
		
		//using assertions import to compare the test arrays with the expected array
		assertArrayEquals(expected,test01);
		assertArrayEquals(expected,test02);
		assertArrayEquals(expected,test03);
		assertArrayEquals(expected,test04);
	}
	
	@Test
	public void RepeatedNumberTest() {
		
		int[] test01 = {0,1,2,3,4,5,6,7,8,9}; //base case
		int[] test02 = {0,1,2,3,4,5,6,7,8,8};
		int[] test03 = {0,0,1,1,2,2,3,3,4,4};
		int[] test04 = {0,3,3,4,5,6,6,7,8,9};
	
		boolean actual01 = util.RepeatedNumber(test01);
		boolean actual02 = util.RepeatedNumber(test02);
		boolean actual03 = util.RepeatedNumber(test03);
		boolean actual04 = util.RepeatedNumber(test04);
		
		assertFalse(actual01);
		assertTrue(actual02);
		assertTrue(actual03);
		assertTrue(actual04);
	}
	
	@Test
	public void FibonacciTest() {
		
		int test01 = 1;
		int test02 = 2;
		int test03 = 11;
		int test04 = 37;

		int actual01 = util.Fibonacci(test01);
		int actual02 = util.Fibonacci(test02);
		int actual03 = util.Fibonacci(test03);
		int actual04 = util.Fibonacci(test04);

		int expected01 = 1;
		int expected02 = 1;
		int expected03 = 89;
		int expected04 = 24157817;
		
		assertEquals(expected01,actual01);
		assertEquals(expected02,actual02);
		assertEquals(expected03,actual03);
		assertEquals(expected04,actual04);
	}
	
	@Test
	public void getResultsTest() {
		/* These test values have full path coverage. Combined, they enter every if/else 
		 * paths of getResults: (1) x < 0 (2) x >= 20 & even (3) x >= 20 & Odd 
		 *                      (4) x < 20 & Even (5) x < 20 & Odd
		 */					   
		
		int test01 = -1; // covers paths 1, 5
		int test02 = 22; // covers path 2
		int test03 = 101; // covers path 3
		int test04 = -18; // covers paths 1, 4 
		
		
		int actual01 = util.getResults(test01);
		int actual02 = util.getResults(test02);
		int actual03 = util.getResults(test03);
		int actual04 = util.getResults(test04);
		
		
		int expected01 = 22;
		int expected02 = 22;
		int expected03 = 102;
		int expected04 = 38;
		
		
		assertEquals(expected01,actual01);
		assertEquals(expected02,actual02);
		assertEquals(expected03,actual03);
		assertEquals(expected04,actual04);
		
	}
}
