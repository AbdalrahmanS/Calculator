
/**
 * Project: Calculator
 * Author: Abdalrahman Shaath
 * Last edited: 9/7/2021
 * Brief Description: This class may in the future just be used with the basic calc class, none the less,
 * this class deals with complex equations and formulas . The user types in a keyword which then 
 * allows them to calcuate equations, so far the quadratic equation is the only complex equation. \
 * Like the BasiCalc class, the user inputs everything via scanners. 
 * 
 */

import java.util.*;

public class CompCalc {
	public static void main(String[] args) {
		Scanner numberInput = new Scanner(System.in);
		System.out.println("Welcome to the Equation Calcualtor");
		String value = "";
		while (!value.equals("END")) {
			System.out.println("Please enter the proper keyword in order to select the proper equation");
			value = numberInput.next();
			switch (value) {
				case "END":
					break;
				case "q":
					Quadratic();
					break;
			}
		}
	}

	/**
	 * Method: static void
	 * This method is able to receive input from the system.in
	 * to then solve a quadratic eqaution. It does this by having a scanner, that receives
	 * input from the user, the inputs are a, b, and c. From there, it uses the quadratic equation
	 * to solve the problem, it sets up to variables to take in both solutions. It then prints 
	 * out the solutoion
	 */
	public static void Quadratic() {
		Scanner quadNumberInput = new Scanner(System.in);
		System.out.print("a = ");
		double a = quadNumberInput.nextDouble();
		System.out.print("b = ");
		double b = quadNumberInput.nextDouble();
		System.out.print("c = ");
		double c = quadNumberInput.nextDouble();

		double firstSolution = ((-1 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		double secondSolution = ((-1 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		System.out.println("The + solution is " + firstSolution + ", the - solution is " + secondSolution);
	}

}
