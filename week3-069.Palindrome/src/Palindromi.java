import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String finalword = "";
        int i = text.length()-1;
        while(i<text.length()&& i>=0)
        {   
            finalword = finalword + text.charAt(i);
            i--;
        }
        System.out.println(finalword);
        if (finalword.equals(text))
                {
                    return true;
                }
        else
            return false;
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
