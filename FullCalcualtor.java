/**
 * Project: Calculator
 * Author: Abdalrahman Shaath
 * Last edited: 9/7/2021
 * Brief Description: This program takes all the main classes
 * and turns it into a program where the user can do basic arithmatic
 * 
 */

import java.util.*;

public class FullCalcualtor {
	public static void main(String args[]) throws CalcError {
		BasicCalc Calc1 = new BasicCalc();
		Scanner input = new Scanner(System.in);
		String arithmetic = "";

		System.out.println("Welcome to the Basic Calc program");
		System.out.println("Type END when you're done");

		/*
		 * Main While Loop
		 * This while loop is where all the majic happens. The While-loop will 
		 * end once the user types END. This loop uses the BasicCalc object, this object allows for
		 * all the arthymitic to work. In the while loop, the prgoram asks the user to enter the
		 * type of arithmetic they want to do. This is then put into a string. Then there is an 
		 * if statement which makes sure that if the user enters an "END" statement, that no prompts 
		 * are displayed. The program then asks for two integers from the user, those numbers are
		 * then stored in variables. Then the numbers, and form of arithmetic are inputed into
		 * the Calc1 object where the solution is displayed.  
		 */
		while (!arithmetic.equals("END")) {
			System.out.println("Do you want to Add, Subtract, Multiply, or Divide?");
			arithmetic = input.next();
			if (!arithmetic.equals("END")) {
				System.out.println("What 2 numbers are you doing this Arithmetic?");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				System.out.println(Calc1.base(num1, num2, arithmetic));
			}
		}
	}
}
