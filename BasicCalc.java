/**
 * Project: Calculator Author: Abdalrahman Shaath Last edited: 9/7/2021 This
 * class does all the basic arithamtic. This class is really just one method
 * that returns the arthimatic opertation.
 */

public class BasicCalc {

	/**
	 * Method: accessor This method inputs two numbers, then using the MADS strings
	 * descides what arhtimatic operation to perform. It then returns expression. 
	 * 
	 */
	public double base(double number1, double number2, String MADS) throws CalcError {
		if (MADS.equals("Add")) {
			return number1 + number2;
		} else if (MADS.equals("Subtract")) {
			return number1 - number2;
		} else if (MADS.equals("Multiply")) {
			return number1 * number2;
		} else if (MADS.equals("Divide")) {
			return (number1 / number2);
		} else {
			throw new CalcError("Enter valid arithmetic");
		}
	}
}
