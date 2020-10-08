package OOP05;

import java.util.Scanner;

public class InputDemo {
    public static void main(String arg[]) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Please enter a new number (" + i + " of 10):");
            int input = keyboard.nextInt();
            sum += input;
        }
        System.out.println("Total sum is : " + sum);


    }
}
