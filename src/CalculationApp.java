import java.util.Scanner;

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
        switch( choice )
        {
            case 1: 
                double sum = add(operand1, operand2);
                resultString += sum;
                break;
            case 2:
                double difference = operand1 - operand2;
                resultString += difference;
                break;
            case 3:
                double product = operand1 * operand2;
                resultString += product;
                break;
            case 4: 
                double floatingPointQuotient = operand1 / operand2;
                resultString += floatingPointQuotient;
                break;
            case 5:
                int integerQuotient = (int)operand1 / (int)operand2;
                resultString += integerQuotient;
                break;
            case 6:
                int integerRemainder = (int)operand1 % (int)operand2;
                resultString += integerRemainder;
                break;
            default:
                break;
        } // end switch
       
        /* TERMINATION PHASE */
        System.out.println( resultString );
        
    } // end method main
    
    /**
     * Returns the sum of two numeric operands, num1 and num2
     * 
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the sum of num1 and num2
     */
    
    public static double add(double num1, double num2)
    {
        return num1 + num2;
        
    } // end method add
    
} // end class CalculationApp
