/**
 * <h1> stars </h1>
 * A program that reads the size of the triangle and
 * displays the triangle by writing lines of * .
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac Stars.java
 * @Run : java Stars
 * Programming Assignment 7.
 * @since 04-21-2020
 */

package HomeWork2; // name of package.

import java.util.Scanner; //import scanner

public class Stars {
    public static void main(String[] args) {//main method is defined here.

        //create scanner
        Scanner keyBoard = new Scanner(System.in);

        //display to input size from user.
        System.out.println("Enter the size of the star (1 to 50)");

        //read input of int type.
        int size = keyBoard.nextInt();

        //draw * in increasing number per each line till size
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*"); //print *

            }
            System.out.println();
        }

        //draw * in decreasing
        for (int i = size; i > 0; i--) {
            for (int j = i; j >0; j--) {

                System.out.print("*");

            }
            System.out.println();
        }

    }


}