
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float one,two;
        System.out.println("Type a number: ");
        one = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        two = Integer.parseInt(reader.nextLine());
        
     
        
        System.out.println("Division:" + one + "/" + two + "=" +(one/two));
    }
}
