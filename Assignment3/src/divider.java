/* Program name: Divider

   Created by: Abiodun Owoseje

   Date Created: 01/13/2018
   
   Description: This program checks if numbers from 100 to 300 that are divisible by 2, 3
   and 5 respectively
   
 */

public class divider {

	public static void main(String[] args) {
				
		int start = 100;
		int stop = 300;
		
		for(int i=start; i<=stop; i++) {
	        if (i%2 == 0) {
	               System.out.format("%d IS divisible by 2\n", i);
	                } else {
	                	System.out.format("%d IS NOT divisible by 2\n", i);
	                }
	        if (i%3 == 0) {
	        			System.out.format("%d IS divisible by 3\n", i);
	                } else {
	                	System.out.format("%d IS NOT divisible by 3\n", i);
	                }
	        if (i%5 == 0) {
	        			System.out.format("%d IS divisible by 5\n", i);
	                } else {
	                	System.out.format("%d IS NOT divisible by 5\n", i);
	                }
	        		System.out.println("__________________________\n");
	        }

	}

}
