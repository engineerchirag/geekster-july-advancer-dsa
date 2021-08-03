package Class2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fundamentals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For loop
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
		
		// foreach loop
//		int [] arr = {1,2,3};
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}
		
		
//		Collection = group of individual elements 
//				represented by a single reference
		
//		List = interface for ordered linear data types
//		2 types of List - 
//		ArrayList - elements in contiguos memory
//		LinkedList - elements at difference memory addresses, 
//		every elements will know address of next (few cases prev)
//		element's memory address.
		
//		List<Integer> l = new ArrayList<Integer>();
//		
//		1st time - 10 memory addresses 
//		if Memory Available -> adds to the arraylist
//		else -> 
//		   new array of size = n + n/2 + 1
//		   copy all elements from prev to new 
//		   add to the arraylist
		
		
//		Integer [] arr = {1,2,3}; // int[] -> Integer[]
//		List<Integer> l = Arrays.asList(arr);
		
//		List<Integer> l = new ArrayList<Integer>();
//		l.add(1);
//		l.add(2);
//		for (int i = 0; i < l.size(); i++) {
//			System.out.print(l.get(i) + " ");
//		}
		
//		List<Integer> l = new ArrayList<Integer>();
//		l.add(1);
//		l.add(3);
//		l.add(2);
//		
//		System.out.print(Collections.min(l));
		
		/*
         input - n
         
         output - 
         
         *
         **
         ***
         ****
         
		 */
//		int n = 10;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// j = 0, .....
		// value of i - <= i
		//            - < i+1
		
		
		//int n = 1234;
		// 1234 = 1 * 10^3 + 2 * 10^2 + 3 * 10^1 + 4 * 10^0
		// 1234 / 10 = 1 * 10^2 + 2 * 10^1 + 3 * 10^0 + 4 * 10^-1
		//           = 100 + 20 + 3 + ( 4/10 = 0.4)
		//           = 123.4
		// 1234 % 10 = 4
		// 123 % 10 = 3
		// 12 % 10 = 2
		// 1 % 10 = 1
		// 4 % 2 = 0
		// 4 % 3 = 1
		// 5 % 3 = 2
		// 6 % 3 = 0
//		int countDigits = 0;
//		while (n != 0) {
//			countDigits++;
//			System.out.print(n % 10 + " ");
//			n = n / 10;
//		}
//		System.out.println(countDigits);
		
		// return if n is a prime number or not.
		// input - n
		// output - True, False
		
		// prime number - any number which has only 2 factors, 
		// itself and 1
		// 3 - 1,3
		// 4 - 1,2,4
		// 10 - 1, 2, 5, 10
		// 11 - 1, 11
//		int n = 11;
//		boolean flag = true;
//		for (int i=2; i < n; i++) {
//			if (n % i == 0) {
//				flag = false;
//				System.out.println("Non Prime");
//				break;
//			}
//		}
//		if (flag == true) {
//			System.out.println("Prime");
//		}
		
		
		
	}

}
