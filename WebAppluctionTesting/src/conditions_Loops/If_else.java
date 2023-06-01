package conditions_Loops;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter your values");
	   int 	marks=scanner.nextInt();
	 
		
		if(marks==35) {
			System.out.println("pass");
		}
		else if(marks<35) {
			System.err.println("pass");
		}
		else if(marks>=35 && marks<50) 
		{
			System.out.println("c = Grade");
			
		}
		else if(marks>=50 && marks<60) {
			System.out.println("c++");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("B grade");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("B+ grade");
	}
		else if(marks>=80 && marks<90) {
			System.out.println("A grade");
		
	}
		else if(marks>=90 && marks<100) {
			System.out.println("A ++ grade");
		}
		else {
			System.out.println("false");
		}
}}