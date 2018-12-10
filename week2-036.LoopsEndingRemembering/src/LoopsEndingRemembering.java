import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while(true)
        { 
            int num = Integer.parseInt(reader.nextLine());
            if(num%2==0)
            {
                even = even +1;
            }
            else
            {
                odd = odd + 1;
            }
            count = count + 1;
            sum = sum + num;
            if (num == -1)
            {   
                float total = sum +1;
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is "+(int)(total));
                System.out.println("How many numbers:"+(count-1));
                float avg = total/(count-1);
                System.out.println("Average:" +avg);
                System.out.println("Even numbers: "+even);
                System.out.println("Odd numbers: "+(odd-1));
                break;        
            }
        }   
    }
}
