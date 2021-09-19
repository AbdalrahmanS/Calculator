/**
 * Project: Calculator
 * Author: Abdalrahman Shaath
 * Last edited: 9/19/2021
 * This new class well aim to replace ComCalc.java
 * just to make sure that FullCalculator.java can prcoess
 * normal Arithamtic operations, and "Complex" equations d
 */

import java.util.*;

 public class Equation {
     private Scanner quadNumberInput = new Scanner(System.in);

     /**
	 * Method: void
	 * This method is able to receive input from the system.in
	 * to then solve a quadratic eqaution. It does this by having a scanner, that receives
	 * input from the user, the inputs are a, b, and c. From there, it uses the quadratic equation
	 * to solve the problem, it sets up to variables to take in both solutions. It then prints 
	 * out the solutoion
	 */
	public void Quadratic() {
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

    /**
     * Method: void
     * This method solves Pythagoras' therom
     */
    public void Pythagoras() {
        System.out.print("a = ");
        double a = quadNumberInput.nextDouble();
        System.out.print("b = ");
        double b = quadNumberInput.nextDouble();
        double c = Math.sqrt((a*a) + (b*b));
        
        System.out.println("c = " + c);

    }

    /**
     * 
     */
 }