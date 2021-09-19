/**
 * Project: Calculator
 * Author: Abdalrahman Shaath
 * Last edited: 9/7/2021
 * Brief Description: This program takes all the main classes
 * and turns it into a program where the user can do basic arithmatic d
 * 
 */

import java.util.*;

public class FullCalcualtor {
	public static void main(String args[]) throws CalcError {
		BasicCalc Calc1 = new BasicCalc();
		Scanner input = new Scanner(System.in);
		String keyWord = "";
		Equation mainEquations = new Equation();

		System.out.println("Welcome to the Calculator program");
		System.out.println("Type END when you're done");

		/**
		 * Chunk: 1
		 * This while-loop keeps running until the user enters the word END.
		 * The main variable keyWord takes the userInput. If the input is a keyletter/s
		 * then it will be used for a complex equation. If it's not, it will then find
		 * the addition of the two numbers
		 */
		while (!keyWord.equals("END")) {
			System.out.println("Do you want to Add, Subtract, Multiply, or Divide?");
			System.out.println("If you want to solve a complex equation, please type the keyletter/s");
			System.out.println("This can be found on the Calculator.txt file");
			keyWord = input.next();
			if (!keyWord.equals("END")) {
				if (keyWord.equals("Q")) {
					mainEquations.Quadratic();
			 	} else if (keyWord.equals("P")) {
					mainEquations.Pythagoras();
				} else {
					System.out.println("What 2 numbers are you doing this Arithmetic?");
					int num1 = input.nextInt();
					int num2 = input.nextInt();
					System.out.println(Calc1.base(num1, num2, keyWord));
				}
			}
		}
	}
}
