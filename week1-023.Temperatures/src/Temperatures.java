
import java.util.Scanner;

public class Temperatures {

    String name = "Vinayak";
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
        while (true) {
            System.out.println("Enter a temperature:");
            double numTemp = Double.parseDouble(reader.nextLine());

            if (numTemp >= -30 && numTemp < +40) {
                Graph.addNumber(numTemp);
            }
        }
        
        
    }
}
