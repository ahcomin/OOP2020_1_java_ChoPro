/**
 * <h1> Changing Word</h1>
 * This is a program to change the specific word.
 * This application will print out "I love you" as the word "hate" replace to "love"
 * when you enter "I hate you".
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Programming Assignment 1.
 * @since 04-10-2020
 */

package Homework;

import java.util.Scanner;

public class ChangeWord { //class declaration.
    /**
     * @param args
     * @return nothing.
     */

    public static void main(String[] args) { //main method is defined here.
        System.out.println("Enter a line of text."); //notifying what the user to do

        Scanner kb = new Scanner(System.in); //kb is the instance of the scanner class.

        String sentence; //declaration of the variables.
        sentence = kb.nextLine(); //read a entered sentence by user

        System.out.println(sentence); //show the sentence that user input

        System.out.println("I have rephrased that line to read:");
        System.out.println(sentence.replace("hate", "love"));
        //print out a sentence in which "hate" was changed to "love"


    }

}

