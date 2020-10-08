/**
 * <h1> Negative Integers </h1>
 * <p>
 * code to read a list of non negative integers and display the smallest largest and
 * average of the integers entered by the user.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac NegativeIntegers.java
 * @Run : java NegativeIntegers
 * Programming Assignment 5.
 * @since 04-21-2020
 */

//name of package.
package HomeWork2;

import java.util.Scanner;

//import scanner
public class NegativeIntegers {
    public static void main(String arg[]) { //main method of the class
        //create scanner
        Scanner keyBoard = new Scanner(System.in);

        double small, large, count = 0, sum = 0; //Initialise variables of int type.

        //display message negative input will act as the sentinel.
        System.out.println("Enter positive integers only. " +
                "Enter any negative integer to end...");

        //read frist input
        double number = keyBoard.nextInt();

        //Initialise small and num
        small = number;
        large = number;
        //check if the input is the sentinel value
        while (number > 0) {
            //if input number is less than small, then assign number to small
            if (small > number) {
                small = number;
            }
            if (large < number) {
                large = number;
            }

            //update sum
            sum += number;

            count++; //increment the count

            //read the next input
            number = keyBoard.nextInt();


        }
        //calculate the average.
        double average = sum / count;

        //display the results -large, small and average
        System.out.println("The smallest integer is : " + small);
        System.out.println("The largest integer is  : " + large);
        System.out.println("The average is : " + average);

    }
}
