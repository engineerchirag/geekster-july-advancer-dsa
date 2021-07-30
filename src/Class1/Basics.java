package Class1;

import java.util.Scanner;

public class Basics {
    /*
 	 * Description
 	 * { params } - 
 	 * 
 	 * 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int i = (false) ? 6 : 2;
		System.out.println(i);
		
		System.out.println(Math.min(2, 3));
	} 
	
}
