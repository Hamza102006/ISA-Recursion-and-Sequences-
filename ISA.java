/**
 * 
 */

import javax.swing.JOptionPane;

/**
 * @author Hamza Khan
 * Date: Decemeber 2023
 * Description: This Code is responsible for dispaying the normal versions of factorial and adding numbers, while also doing the 
 * recursion way of these methods. Furthermore, the code is also  
 * 
 *  
 *  
 * <Method List>
 * - public static long normalFactorial(int x) - Normal Factorial Method
 * 
 * - public static long recursiveFactorial(int x)  - factorial recursive
 * 
 * - public static int addingNumbers(int maxNumber) - adding numbers normal 
 * 
 * - public static int addingNumberRecursive (int maxNumber) - add numbers  recursive
 * 
 * - public static int geometricSeq (int number, int multiplier, int firstTerm) - geometric method  
 * 
 * - public static void main(String[] args) - main method
 */


/*
 * Both the Normal and Recursive ways were done to show that I have the ability to switch and transition to Normal to Recursive
 * 
 * 
 * NOTE: I Understand that the commenting is really heavy in the code below, and in some cases it is not even needed. However since this is a
 *       INDIVIDUAL SELF LEARNING UNIT, I wanted to make sure that I can display what I have learned and show it effectively!     
 * 
 * 
 */



public class ISA {

    // Factorial NORMAL VERSION WITHOUT THE RECURSION 
    public static long normalFactorial(int x) {
        long val = 1; 

        // Loop to calculate factorial
        for (int i = x; i >= 1; i--) {
            val = val * i;
        }

        return val;
    }

    // Factorial RECURSION VERSION
    public static long recursiveFactorial(int x) {
        long val = x;

        // Base case and recursive call
        if (x == 0 || x == 1) {
            val = val * 1;
        } else {
        	//recurisve call
            val = val * ISA.recursiveFactorial(x - 1);
        }

        return val;
    }

    // adding numbers NORMAL VERSION WITHOUT THE RECURSION
    public static int addingNumbers(int maxNumber) {
        int total = 0;

        // Loop to calculate sum of digits
        for (int i = 0; i <= maxNumber; i++) {
            total += i;
        }

        return total;
    }

    // adding Numbers  RECURSION VERSION
    public static int addingNumberRecursive(int maximumNumber) {

        if (maximumNumber <= 0) {
            return 0;
        } else {
        	//recurisve call
            return maximumNumber + addingNumberRecursive(maximumNumber - 1);
        }
    }

    
    
    // Geometric Method
    public static int geometricSeq(int number, int multiplier, int firstTerm) {
        if (number == 1) {
            return firstTerm;
        } else {
        	//recurisve call
            return geometricSeq(number - 1, multiplier, firstTerm) * multiplier;
        }
    }

 

    // Main method
    public static void main(String[] args) {

        // NORMAL FACTORIAL SELF TESTING 
    	
        int factorialVal = 5; // this is the value in which the factorial by run 
        
        
        //using the value of factorialVal and putting it into the normal factorial method 
        //the output is set as a long variable
        long factorialOutput = normalFactorial(factorialVal);   
        
        //After the program factorialVal has gone through the normal method then a output/display will 
        //display which will state the factroialVal and also the resulting output.
        JOptionPane.showMessageDialog(null, "The Factorial of the Value: " + factorialVal + " results in the output of = " + factorialOutput);

        
        
        // RECURSIVE FACTORAL SELF TESTING 
        
        
        
        //using the value of factorialVal and putting it now into the Recursive factorial method 
        //the output is set as a long variable
        factorialOutput = recursiveFactorial(factorialVal);  
        
        
        //After the program factorialVal has gone through the recursive method then a output/display will 
        //display which will state the factroialVal and also the resulting output.
        JOptionPane.showMessageDialog(null, "The Recursive Factorial of the Value " + factorialVal + " results in the output of = " + factorialOutput);

        
        //NORMAL ADDING NUMBERS SELF TESTING
                
        
        int addVal = 5;   // this is the value in which the numbers will add up to 
      
        
        //using the value of addVal and putting it into the normal addingNumbers method 
        //the output is set as a int variable
        int addResult = addingNumbers(addVal);   
        
        //After the program addVal has gone through the normal method then a output/display will 
        //display which will state the addVal and also the resulting output.
        JOptionPane.showMessageDialog(null,"The Sum of digits up to the Value of; " + addVal + " results in the Value of = " + addResult);

        
        //RECURSIVE ADDING NUMBERS SELF TESTING 
        
        
        //using the value of addVal and putting it now into the recursive addingNumbers method 
        //the output is set as a int variable
        addResult = addingNumberRecursive(addVal);    
        
        //After the program addVal has gone through the Recursive method then a output/display will 
        //display which will state the addVal and also the resulting output.
        JOptionPane.showMessageDialog(null, "The Recursive Sum of digit up to the Value of; " + addVal + " results in the Value of = " + addResult);


        //GEOMETRIC SELF TESTING STARTS BELOW
        
        //message to tell user that the geometric sequence testing is now starting 
        JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VALUES FOR GEOMETRIC SEQUENCE!!!");

        
        //declaring variables below as well as initializing an empty string which will display the geometric sequence 
        
        int maxVal = 0;
        int multiplier = 0;
        int startingVal = 0; 
        String finalMessage = ""; 


        // for the maxVal and a while loop and try catch to make sure that the value entered by the used is a valid answer which makes sure
        // that the number entered is not a negative value or a letter or something 
        while (maxVal <= 0) { 
            try {
            	maxVal = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the MAX VAL of the geometric pattern:"));
                if (maxVal < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a non-negative value for MAX VAL.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for the MAX VAL");
            }
        }

        // for the multiplier and a while loop and try catch to make sure that the value entered by the used is a valid answer which makes sure
        // that the number entered is not a negative value or a letter or something 
        while (multiplier <= 0) {
            try {
                multiplier = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the MULTIPLIER of the geometric pattern:"));
                if (multiplier < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a non-negative value for MULTIPLIER.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for the MULITPLIER.");
            }
        }

        // for the startingVal and a while loop and try catch to make sure that the value entered by the used is a valid answer which makes sure
        // that the number entered is not a negative value or a letter or something 
        while (startingVal <= 0) {
            try {
            	startingVal = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the STARTING TERM of the geometric pattern:"));
                if (startingVal < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a non-negative value for STARTING VAL.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer for the STARTING VAL.");
            }
        }
        
        //this is message which will quickly show the user all the numbers that they entered
        JOptionPane.showMessageDialog(null, "Values Entered;\n " + "First Term: " + startingVal + "\n Multiplier: " + multiplier + "\n Upper Limit: " + maxVal);

        
        
        // For loop to calculate each term and stores it in the output String 
        // which allows it to be displayed. And it also makes sure the that the outputted
        // message is properly formatted when the displayed  with a comma and space 
       
        for (int i = 1; geometricSeq(i, multiplier, startingVal) < maxVal; i++) {
            if (i == 1) {
                finalMessage += "SEQUENCE: " + geometricSeq(i, multiplier, startingVal);
            } else { 
            	finalMessage += ", " + geometricSeq(i, multiplier, startingVal);
            }
        }

        // Displays the final message to the user
        JOptionPane.showMessageDialog(null, finalMessage);
    }
}




