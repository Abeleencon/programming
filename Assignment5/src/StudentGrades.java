/* Program name: Student Grades

   Created by: Abiodun Owoseje

   Date Created: 01/14/2018
   
   Description: This program reads will take as input the Student names, and grades 
   for 1st, 2nd and 3rd exams, and the final Exams respectively on a single line.
   
   The 1st, 2nd and 3rd exams are final grades out of a total of 50 points and each 
   of them makes up 20% of the final grade, totaling 60%. The Final Exam is out of a 
   total of 100 points and makes 40% of the final grade
   
   The program outputs the Percentage score, final grade of each student and also 
   prints the total number of students in the class
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "student_grades.txt";
		
		File textFile = new File(fileName);
		int count= 0;
				
		@SuppressWarnings("resource")
		Scanner in = new Scanner(textFile).useDelimiter("(\\p{javaWhitespace}|\\.|,)+");
		
		System.out.println("ALB-101: FINAL GRADES ");
		System.out.println("_______________________");
		
		while(in.hasNext()){
			String studentName = in.next();
			String lastName = in.next();
			int firstExam = in.nextInt();
			int secondExam = in.nextInt();
			int thirdExam = in.nextInt();
			float fourthExam = in.nextInt();
			String grade = "";
									
			float finalTest = firstExam+secondExam+thirdExam;
			finalTest = finalTest/150;
			finalTest = finalTest*60;
			float finalExam = fourthExam/100;
			finalExam = finalExam*40;
						
			int finalGrade = Math.round(finalTest + finalExam); //updated with a rounding routine 
			
				if (finalGrade >= 95 && finalGrade <= 100) { 
						grade = "A+";			}
				if (finalGrade >= 93 && finalGrade <= 94) { 
						grade = "A";			}
				if (finalGrade >= 90 && finalGrade <= 92) { 
						grade = "A-";			}
				if (finalGrade >= 87 && finalGrade <= 89) { 
						grade = "B+";			}
				if (finalGrade >= 83 && finalGrade <= 86) { 
						grade = "B";			}
				if (finalGrade >= 80 && finalGrade <= 82) { 
						grade = "B-";			}
				if (finalGrade >= 77 && finalGrade <= 79) { 
						grade = "C+";			}
				if (finalGrade >= 73 && finalGrade <= 76) { 
						grade = "C";			}
				if (finalGrade >= 70 && finalGrade <= 72) { 
						grade = "C-";			}
				if (finalGrade >= 67 && finalGrade <= 69) { 
						grade = "D+";			}
				if (finalGrade >= 63 && finalGrade <= 66) { 
						grade = "D";			}
				if (finalGrade >= 60 && finalGrade <= 62) { 
						grade = "D-";			}
				if (finalGrade >= 0 && finalGrade <= 59) { 
						grade = "F";			}
			
			System.out.format("%s %s%n", studentName, lastName);
			System.out.format("       Final Grade: %d%%", finalGrade);
			System.out.format("%n       Letter Grade: %s%n", grade);
			count++;
			}
		
		in.close();
		System.out.println("____________________________");
		System.out.format("NUMBER OF STUDENTS:  %d%n", count);
		System.out.println("____________________________");
	}
	
	
}
