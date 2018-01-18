/* Program name: Divider

   Created by: Abiodun Owoseje

   Date Created: 01/13/2018
   
   Description: This program alternatively print in an increasing order from 1-10
   the characters # and *
   
 */

public class printControl {

	public static void main(String[] args) {
		
		 int lines = 10;
		 char c = '*';
		 char d = '#';
		    for (int i = 1; i <= lines; i++){
		       for (int j = 1; j<= i; j++){
		         if (i%2==0) {
		        	 System.out.print(c);
		            }
		         else { System.out.print(d);
		           }
		      }
		       System.out.print("\n");
		    }
		    
		}
}
