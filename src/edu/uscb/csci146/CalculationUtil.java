package edu.uscb.csci146;

/**
 *
 * @author hunterww
 */
public class CalculationUtil {
    
    /**
     * Don't let anyone instantiate this "static-only" class
     */
    private CalculationUtil() {}
    
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
    
    /**
     * Returns the difference between two numeric operands, num1 and num2,
     * such that num2 is subtracted from num1
     * 
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the difference of num1 less (minus) num2
     */
    
    public static double subtract(double num1, double num2)
    {
        return num1 - num2;
        
    } // end method subtract
    
    /**
     * Returns the product of two numeric operands, num1 and num2
     * 
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the product of num1 and num2
     */
    
    public static double multiply(double num1, double num2)
    {
        return num1 * num2;
        
    } // end method multiply
    
    /**
     * Returns the quotient of two floating-point operands, num1 and num2
     * 
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the floating-point quotient of num1 divided by num2
     */
    
    public static double divide(double num1, double num2)
    {
        return num1 / num2;
        
    } // end method divide (for floating-point division)
    
    /**
     * Returns the quotient of two integer operands, num1 and num2
     * 
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the integer quotient of num1 divided by num2
     */
    
    public static int divide(int num1, int num2)
    {
       return num1 / num2; 
        
    } // end method divide (for integer division)
    
    /**
     * Returns the integer remainder after performing
     * integer division on two integer operands, num1 and num2
     * 
     * @param num1 the first operand
     * @param num2 the second operand
     * @return the remainder after integer division of num1 divided by num2
     */
    
    public static int remainder(int num1, int num2)
    {
       return num1 % num2; 
        
    } // end method remainder
    
    
} // end Class CalculationUtil
