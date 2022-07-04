
package prompttheuseranddisplay;
import java.util.Scanner;

public class PromptTheUserAndDisplay {

    
    public static void main(String[] args) 
    
    {
        String firstName;
        String LastName;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your First Name:");
        firstName=input.nextLine();
        System.out.println("Please enter your Last Name:");
        LastName=input.nextLine();
        
        System.out.println("Users First & Last Names:");
        System.out.println("First:"+firstName);
        System.out.println("Last:"+LastName);
        
    }
    
}
