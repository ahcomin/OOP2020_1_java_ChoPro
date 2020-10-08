package OOP05;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String arg[]) { //main method of the class
    int count, number;

        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        count = 1;
        do{
            System.out.println(count + ", ");
            count++;
        }while (count <= number);
        System.out.println();
        System.out.println("Buckle my shoe.");//리얼 미쿡인...

    }
}
