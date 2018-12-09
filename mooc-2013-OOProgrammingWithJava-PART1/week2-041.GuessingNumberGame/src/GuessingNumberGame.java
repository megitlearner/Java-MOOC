
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess = 1;

        while (true) {
            System.out.print("Guess a number:");
            int num = Integer.parseInt(reader.nextLine());  
            if (num == numberDrawn) {
                System.out.println("Congratulations, your guess is correct");
                break;
            } else if (num != numberDrawn) {
                if (num < numberDrawn) {
                    System.out.println("The number is greater. Its guess " + guess);
                } else if (num > numberDrawn) {
                    System.out.println("The number is lesser. Its guess " + guess);
                }

            }
            guess++;
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
