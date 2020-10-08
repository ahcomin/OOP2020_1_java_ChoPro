package Week3;

import java.util.Scanner;

public class WhileDemo {
    enum Suit {CLUBS, DIAMONDS, HEARTS,  SPADES}
    public static void main(String arg[]) {
        for(Suit nextSuit : Suit.values())
            System.out.println(nextSuit + " ");
        System.out.println();
         /*
        int count, number;

        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);

        number = keyboard.nextInt();

        count = 1;
        while (count <= number)
        {
            System.out.println( count + ", ");
            count++;
        }
        System.out.println();
        System.out.println("Buckle my shoe.");
        */


    }
}
