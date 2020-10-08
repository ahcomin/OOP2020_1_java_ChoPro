/**
 *<h1> Grade </h1>
 * Code to read a list of no negative wxam scores and
 * disply the total number of exam scores
 * the number of scores that fall in A grade,
 * B grade, C grade, D grade and F grades.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>

 * @Compile : javac Grade.java
 * @Run : java Grade
 * Programming Assignment 6.
 * @since 04-21-2020
 */

package HomeWork2;//name of package

//import scanner

import java.util.Scanner;

public class Grade {
    public static void main(String arg[]) { //main method of the class

        //create scanner
        Scanner keyBoard = new Scanner(System.in);

        //Initialise variables of int type
        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0; //each of grades
        int count = 0; //for counting how many input the scores

        //Any negative input will act as the sentinel.
        System.out.println("Enter the list of exam scores (1-100) in one line. And Enter any negative score to end :) ");

        //read first input
        int num = keyBoard.nextInt();

        //check if the input is the sentinel value
        while (num > 0) {
            //check if input score to match the grade
            if (num >= 90 && num <= 100) {
                A++;

            } else if (num >= 80 && num < 90) {
                B++;
            } else if (num >= 70 && num < 80) {
                C++;

            } else if (num >= 60 && num < 70) {
                D++;
            } else {
                F++;
            }

            //increment the count of the number of values entered
            count++;

            //read the next input
            num = keyBoard.nextInt();

            //Display the result of total number of grades
            System.out.println("Total number of grades = " + count);
            System.out.println("Number of A's = " + A);
            System.out.println("Number of B's = " + B);
            System.out.println("Number of C's = " + C);
            System.out.println("Number of D's = " + D);
            System.out.println("Number of F's = " + F);
        }

    }
}