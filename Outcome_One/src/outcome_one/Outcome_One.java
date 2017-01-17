
package outcome_one;

import java.util.Scanner;

/**
 * 10/11/2015
 * @author Steven
 * This program will ask the administrator's name, present them with 3 options
 * Option 1 Create a user name.
 * Option 2 Calculate the Factorial of a number entered by the user.
 * Option 3 Exits the program
 * 
 */
public class Outcome_One
{

    
    public static void main(String[] args) 
    {
        //ask for the admins name
        Scanner adminsc = new Scanner(System.in);
        options Option = new options();
        System.out.println("Hello, Please enter your username");
        String administrator= adminsc.nextLine();
        //send the admin's name to the option class 
        Option.selection(administrator);
        
        
    }
    
}
