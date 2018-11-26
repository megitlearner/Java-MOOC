
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while(true)
        {
            System.out.println("Enter Password");
            String pass = reader.nextLine();
            if (pass.equals(password))
            {
                System.out.println("Your password is correct. Secret code is Vegas");
                break;
                
            }
            
            
           
        }
        
    }
}
