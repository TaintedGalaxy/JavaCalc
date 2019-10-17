import java.util.Scanner;

/**
 * 
 * @author OnyxianOmen
 *
 */
public class CalculatorApp {

	static double fnum;
	static double snum;
	static double answer = 0;
	// Global variables set in the class for the numbers and answer.
	
	public static void main(String[] args) {
		ask(); // Calling ask method to get input for numbers and operator.
	}
	
	/**
	 * 
	 */
	public static void ask(){
		Scanner calc = new Scanner(System.in); // Scanner set to get the input from the keyboard.
		try{ // Try and catch statement for validation.
			System.out.println("Enter first number: ");
			fnum = calc.nextDouble();
			// Input for the first number to be calculated.
			System.out.println("Would you like to +, -, * or / your numbers?: ");
			String op = calc.next();
			// Input for the operator to calculate.
			System.out.println("Enter second number: ");
			snum = calc.nextDouble();
			// Input for the second number to be calculated.
			answer = calculate(fnum, snum, op);
			// The calculate method is called so that the answer can be calculated.
			System.out.println("Your answer is:" + answer); //Outputting the calculated answer.
		}catch(Exception e){ // Validation if there's an error such as incorrect values.
			System.out.println("Error Occured: " + e);
			ask(); // Outputs the error and goes through asking the inputs again.
		}
	}
	
	/**
	 * This method is for the calculation of the numbers given.
	 * @param fnum First number input from the user.
	 * @param snum Second number input from the user.
	 * @param op Operator input from the user.
	 * @return The answer is returned to main method to be output to the user.
	 */
	public static double calculate(double fnum, double snum, String op)
	{ // Calculate method so that it can be called in the ask method.
		// If statement that calculates the answer depending on the operator chosen by the user
		if (op.equals("+")){
			answer = fnum + snum;
		}
		else if (op.equals("-")){
			answer = fnum - snum;
		}
		else if (op.equals("*")){
			answer = fnum * snum;
		}
		else if (op.equals("/")){
			answer = fnum / snum;
		}
		else if (op.equals("!")){
			double fact = 0;
			for(i=1;i<=fnum;i++){    
	      			fact=fact*i;    
			}  
			answer = fact;
		}
		else{
			System.out.println("That isn't any of the operators.");
		} // if no operator is entered then they are told and no calculation is done.
		
		return answer;
		// returns the calculated answer.
	}

}
