package outcome_one;

import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class programs 
{
    
    public static void string_function(String Admin)
    {
        System.out.println("Welcome "+Admin+", You have selected Option 1, Creating a username");
        // askes the user to enter a full name
        Scanner usersc = new Scanner(System.in);
        System.out.println("Enter User's fullname");
        String user = usersc.nextLine();
        //passes the the name the user entered to the create_name function
        create_name(user);
    }
    
    public static void number_function(String Admin)
    {
        // asks the user to input a number
        System.out.println("Welcome "+Admin+", You have selected Option 2, Factorial of a number");
        System.out.println("Please enter a number ");
        Scanner numbersc = new Scanner(System.in);
         int number = 0;
       //error check to see if the user has entered something other than a number 
       try
       {
           number = numbersc.nextInt();
       }
         catch (Exception e)
                 {
                     System.out.println("Not a vaild number");
                 }
        
        int count;
        float factorial = 1;
        if (number>=30)
        {
            System.out.println("Number is to large");
        }
        else if (number>0)
        {
        //starts a counter for what ever number the user input        
        for ( count = number; count > 1; count--)
            {    
                System.out.print(count + " X " );
        
                factorial *= count;
            } 
            //prints the factorial
            System.out.println(count+" = "+factorial);
            System.out.println("Thank you for using the Factorial Funcuntion, Returning to Main Menu");
            System.out.println("");
        }
        else if (number <=0)
        {
            //tests if the number is less than 0
            System.out.println("Not a vaild number");
        }
    
    }
    
    public static void create_name(String username)
    {
        //gets the username from the string_function
        int pos;
        char space = ' ';
        //looks for the space
        pos = username.indexOf(space);
        if ((pos == -1))
            //is a space is not found
        {
            System.out.println(username+" is not a valid username");
            System.out.println("Returning to Main Menu.");
        }
        
        else
        {
            //if a space is found
            String string1=username.substring(0,1), string2 = username.substring(pos+1,username.length());
        //prints the user name to the screen
            System.out.println(username+"'s username will be \n"+string1+string2);
            System.out.println("Thank you for using the Create Username Function, Returning to Main Menu.");
            System.out.println("");
        }
    }
}
