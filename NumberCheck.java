import java.util.Scanner;
public class NumberCheck {
 
  public static void main(String[] args)
    {
	  	// Open Scanner
        Scanner scnr = new Scanner(System.in);
 
        // Prompt user input
        System.out.print("Enter first number: ");
        int number1 = scnr.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scnr.nextInt();
        System.out.print("Enter third number: ");
        int number3 = scnr.nextInt();
 
        // Checks if all are the same
        if (number1 == number2 && number1 == number3)
        {
            System.out.println("All numbers are equal");
        }
        
        // Checks if some are same
        else if ((number1 == number2) || (number1 == number3) || (number3 == number2))
        {
            System.out.println("Some are the same, some are different1");
        }
        // Else, All different
        else
        {
            System.out.println("All numbers are different");
        }
        scnr.close();
    }
  
}