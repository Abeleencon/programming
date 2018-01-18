/* Program name: Book Keeping

   Created by: Abiodun Owoseje

   Date Created: 01/13/2018
   
   Description: This program takes an input file with a list of entries. 
   Each with a line stating the entry type e.g a Deposit or the type 
   of transaction followed by the amount. If the entry type is “Deposit”, 
   then the entry is a Deposit. 
   If the entry type is anything, other than “Deposit”, then the entry is 
   assumed to be debit.
   The program outputs the final balance we have after all deposits and 
   other transactions
   
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bookKeeping {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "transactions.txt";
		
		File textFile = new File(fileName);
		double newBalance = 0.00;
		
		Scanner in = new Scanner(textFile);
		System.out.println("BOOK KEEPING SYSTEM REPORT\n");
		System.out.println("____________________________\n");
		
		while(in.hasNext()){
			String line = in.nextLine();
			float lineValue = in.nextFloat();
			double prevBalance;
			if (line.equalsIgnoreCase("Deposit")) {
				newBalance = newBalance + lineValue;
				System.out.format(line + ": " + "$" + "%.2f\n",lineValue);	
				System.out.format("          BALANCE: $%.2f\n", newBalance);
				prevBalance = newBalance;
			}
			else {
				prevBalance = newBalance;	
				newBalance = prevBalance - lineValue;
				System.out.format(line + ": " + "$" + "(%.2f)\n",lineValue);	
				System.out.format("		BALANCE: $%.2f\n", newBalance);
			 }
				if(in.hasNextLine()) {
					line = in.nextLine();
				}
			}
		in.close();
		System.out.println("________________________________\n");
		System.out.format("FINAL BALANCE: $%.2f\n", newBalance);
		System.out.println("________________________________\n");
	}

}
