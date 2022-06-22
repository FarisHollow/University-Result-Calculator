package insertnewresult;

import java.util.Scanner;
import java.util.Date ;

public class InsertNewResult 
{
    public void InsertNewResult()
    {
		String grade = " ";
		double credit1;
		double credit2;
		double credit3;
		double credit4;
		double gradeValue = 0;
		double totPtsCourse1 = 0;
		double totPtsCourse2 = 0;
		double totPtsCourse3 = 0;
		double totPtsCourse4 = 0;
		double totPts = 0;
		double totalCredits = 0;
		double cgpa;

		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the credit point of your course 1: ");
		credit1 = console.nextDouble();
		System.out.println("Please enter your grades for course 1: ");
		grade = console.next();

		if (grade.equals("A+"))
			gradeValue = 4.00;
		else if (grade.equals("A"))
			gradeValue = 3.75;
		else if (grade.equals("B+"))
			gradeValue = 3.50;
		else if (grade.equals("B"))
			gradeValue = 3.25;
		else if (grade.equals("C+"))
			gradeValue = 3.00;
		else if (grade.equals("C"))
			gradeValue = 2.75;
		else if (grade.equals("D+"))
			gradeValue = 2.50;
		else if (grade.equals("D"))
			gradeValue = 2.25;
		else if (grade.equals("F"))
			gradeValue = 0.00;

		else
			System.out.println("Invalid Grade");

		totPtsCourse1 = gradeValue * credit1;

		System.out.println("Please enter the credit point of your course 2: ");
		credit2 = console.nextDouble();
		System.out.println("Please enter your grades for course 2: ");
		grade = console.next();

		
		if (grade.equals("A+"))
			gradeValue = 4.00;
		else if (grade.equals("A"))
			gradeValue = 3.75;
		else if (grade.equals("B+"))
			gradeValue = 3.50;
		else if (grade.equals("B"))
			gradeValue = 3.25;
		else if (grade.equals("C+"))
			gradeValue = 3.00;
		else if (grade.equals("C"))
			gradeValue = 2.75;
		else if (grade.equals("D+"))
			gradeValue = 2.50;
		else if (grade.equals("D"))
			gradeValue = 2.25;
		else if (grade.equals("F"))
			gradeValue = 0.00;

		else
			System.out.println("Invalid Grade");

		totPtsCourse2 = gradeValue * credit2;

		System.out.println("Please enter the credit point of your course 3: ");
		credit3 = console.nextDouble();
		System.out.println("Please enter your grades for course 3: ");
		grade = console.next();

		if (grade.equals("A+"))
			gradeValue = 4.00;
		else if (grade.equals("A"))
			gradeValue = 3.75;
		else if (grade.equals("B+"))
			gradeValue = 3.50;
		else if (grade.equals("B"))
			gradeValue = 3.25;
		else if (grade.equals("C+"))
			gradeValue = 3.00;
		else if (grade.equals("C"))
			gradeValue = 2.75;
		else if (grade.equals("D+"))
			gradeValue = 2.50;
		else if (grade.equals("D"))
			gradeValue = 2.25;
		else if (grade.equals("F"))
			gradeValue = 0.00;

		else
			System.out.println("Invalid Grade");

		totPtsCourse3 = gradeValue * credit3;

		System.out.println("Please enter the credit point of your course 4: ");
		credit4 = console.nextDouble();
		System.out.println("Please enter your grades for course 4: ");
		grade = console.next();

		if (grade.equals("A+"))
			gradeValue = 4.00;
		else if (grade.equals("A"))
			gradeValue = 3.75;
		else if (grade.equals("B+"))
			gradeValue = 3.50;
		else if (grade.equals("B"))
			gradeValue = 3.25;
		else if (grade.equals("C+"))
			gradeValue = 3.00;
		else if (grade.equals("C"))
			gradeValue = 2.75;
		else if (grade.equals("D+"))
			gradeValue = 2.50;
		else if (grade.equals("D"))
			gradeValue = 2.25;
		else if (grade.equals("F"))
			gradeValue = 0.00;
		else
		System.out.println("Invalid Grade");
		totPtsCourse4 = gradeValue * credit4;

		totPts = totPtsCourse1 + totPtsCourse2 + totPtsCourse3 + totPtsCourse4;
		totalCredits = credit1 + credit2 + credit3 + credit4;
		cgpa = totPts / totalCredits;
		System.out.printf("Your CGPA is: %.2f\n", +cgpa);
		
		Date now = new Date();
		System.out.println("  ");
		System.out.println(now);
		System.out.println(" ");
		
		
		
    }
}
