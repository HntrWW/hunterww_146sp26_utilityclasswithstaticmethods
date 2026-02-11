import java.util.Scanner;
import edu.uscb.csci146.CalculationUtil;
/**
 * ...
 * Application class to demonstrate the use of `static` methods
 * (a.k.a. "class methods"), meaning methods that do NOT require 
 * an instantiated object (instance) of the class in order to use them.
 * 
 * (Note: this code will be refactored several times -- our long term goal
 * for this particular exercise is to have these `static` methods 
 * coded in their own class -- a "utility class" -- but for now, 
 * we will code them here in our application class
 * 
 * @author hunterww@email.sc.edu
 * @version 146sp26 ICE for week of 4 Feb 2026
 */
public class CalculationApp {
    
    /**
     * Main method for the app
     * @param args 
     */
    public static void main(String[] args) 
    {
        /* INITIALIZATION PHASE */
        Scanner stdin = new Scanner( System.in );
                
        System.out.println("Which binary operation do you want to perform?");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Floating-point division");        
        System.out.println("5 - Integer division");
        System.out.println("6 - Integer remainder");
        System.out.print("Enter your choice (1, 2, 3, 4, 5, or 6): ");
        int choice = stdin.nextInt(); // assume user enters an int
        stdin.nextLine(); // clear the input buffer and ignore additional tokens
        
        System.out.print("Enter first number: ");
        double operand1 = stdin.nextDouble();
        stdin.nextLine();

        System.out.print("Enter second number: ");
        double operand2 = stdin.nextDouble();
        stdin.nextLine();
        
        String resultString = "Result = ";
                
        /* PROCESSING PHASE */
        // TODO: While this program works just fine as is, we will
        //       refactor the code below to use `static` methods that
        //       will help to make our code more modular and re-usable!
        resultString += switch( choice )
        {
            case 1 ->  CalculationUtil.add(operand1, operand2);
            case 2 ->  CalculationUtil.subtract(operand1, operand2);
            case 3 ->  CalculationUtil.multiply(operand1, operand2);
            case 4 ->  CalculationUtil.divide(operand1, operand2);
            case 5 ->  CalculationUtil.divide((int)operand1,(int)operand2);
            case 6 ->  CalculationUtil.remainder((int)operand1, (int)operand2);
            default -> "Invalid Choice";
        }; // end switch
       
        /* TERMINATION PHASE */
        System.out.println( resultString );
        
    } // end method main
       
} // end class CalculationApp
