/**
 * Project: Calculator Author: Abdalrahman Shaath Last edited: 9/7/2021 Brief
 * Description: This is the error class, in the situation where an error occurs
 * this class is throw to show that error.
 */

public class CalcError extends Exception {

	/**
	 * Method: Constructor
	 * Method just refers back to the superclass, throws an error
	 * without a message
	 */
	public CalcError() {
		super();
	}

	/**
	 * Method: Constructor
	 * Method just refers back to the superclass, throws an error
	 * with a message
	 */
	public CalcError(String error) {
		super(error);
	}
}
