package javashapening;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		

		//how to find common elements from 2 array lists
		String [] arr_a  = {"a" , "b" , "c", "d", "n", "c", "d", "n"};
		
		String [] arr_b  = {"a", "c", "d", "g", "h"};
		
//		String aToString = Arrays.toString(arr_a);
//		String bToString = Arrays.toString(arr_b);
		
		for(String i : arr_a) {
			for (String j : arr_b) {
				if(i.equals(j)) {
					System.out.println(i);
				}
			}
		}
//		if(bToString.equals(aToString)) {
		
//		System.out.println(aToString);
//		}
		
		
//		for (int i = 0; i < arr_a.length; i++){
//			
//		for (int j = 0; j< arr_b.length; j++ ) {
//			
//			
//		
//		if ((arr_a[i]) == (arr_b[j])) {
//					
//			System.out.println((arr_b)[i]);
			
//		}	
//		}
//		}
//		int [] array1 = { 1, 2, 3, 4, 5};
//		int [] array2 = { 3, 8, 4, 7, 6};
//		

//		for (int i = 0; i < array1.length; i++) {
//			for(int j = 0; j < array2.length; j++) {
//				int count = 0;
//				if (array1[i] == array2[j]) {
//				
//					System.out.println(array1[i]);
//					
//				}
//				
//			}
//		}
//	    
		/*
		 *  How to check if a string contains only digits in Java using regex.
		 */
//		String regex = "\\d+";   //"[0-9]+";
//		String data = "243oyhg876325";
//	
//		System.out.println (data.matches(regex));
//		
		
		
		

	}

}
