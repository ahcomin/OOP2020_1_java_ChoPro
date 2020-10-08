/**
 * <h1> First To Last </h1>
 * Reads in a line of text
 * then outputs the line with the first word moved to the end of
 * the sentence, the first word become the last word.
 * The first letter of first word should be uppercase.
 *
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Programming Assignment 2.
 * @since 04-10-2020
 */
package Homework; //name of package

import java.util.Scanner; //import java.util for using  Scanner.

public class FirstToLast { //class declaration.
    public static void main(String[] args) { //main method is defined here.
        Scanner keyboard = new Scanner(System.in); //keyboard is the instance of the scanner class.

        System.out.println("Enter a line of text - no punctuation, please."); //for notifying what the user to do
        String sentence = keyboard.nextLine(); //read a entered sentence by user
        int endOfFirstWord = sentence.indexOf(" "); //The number of index was declared at endOfFirstWord

        System.out.println(sentence); //view the sentence what you entered
        System.out.println("I have rephrased that line to read: ");

        String tempSpace = sentence.substring(endOfFirstWord); //Put the first word in a temporary space at tempSpace.
        tempSpace = tempSpace.trim(); //remove the front and back spaces of a sentence

        /**
         tempSpace.substring(0, 1).toUpperCase()  >> This method is for making to uppercase the first letter.
         sentence.substring(endOfFirstWord + 2)  >> adding the rest of words.
         " " >> It is word spacing.
         sentence.substring(0, endOfFirstWord) >> adding the first word of original sentence that user entered.
         */
        sentence = tempSpace.substring(0, 1).toUpperCase() + sentence.substring(endOfFirstWord + 2) + " " + sentence.substring(0, endOfFirstWord);

        System.out.println(sentence); //view whole of a sentence
    }

}
