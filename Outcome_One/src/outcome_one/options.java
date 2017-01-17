
package outcome_one;

import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class options 
{
    public void selection(String admin)
    {
        int loop = 1;
        while (loop == 1) // make the program run until the user quits
        {
        System.out.println("Welcome "+ admin);
        System.out.println("Please select an option");
        System.out.println("Option 1: Create a username");
        System.out.println("Option 2: Find the Factorial");
        System.out.println("Option 3: Quit");
        Scanner Option = new Scanner(System.in);
        String choice = Option.nextLine();
            switch (choice)
            {
                case "1":
                {
                programs.string_function(admin); //run the string_function
                break;
                }
                case "2":
                {
                programs.number_function(admin);// run the number_function
                break;
                }
                case "3":
                {
                System.out.println("Goodbye "+ admin); // quit the program
                loop = 2;
                break;
                }
                default: 
                {
                System.out.println("Invalid Selection"); // default if an invalid option is not picked
                }
            }
        }
    }
}
                     

                


