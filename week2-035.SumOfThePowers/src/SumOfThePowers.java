
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        int power = 0;
        
        for(int i=0;i<=a;i++)
        {
            int power1 = (int) Math.pow(2, i);
            power = power + power1;
        }
        
        System.out.println("The result is "+power);
    }
}
