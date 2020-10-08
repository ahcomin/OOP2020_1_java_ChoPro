/**
 * <h1> Changing Punctuation</h1>
 * Reads in a line of text
 * then outputs the line with the first word moved to the end of
 * the sentence, the first word become the last word.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Programming Assignment 1.
 * @since 04-10-2020
 */
package Homework; //name of package.

import java.util.Scanner; //import java.util for using  Scanner.

public class ChangePunctuation { //name of class is ChangePunctuation.
    public static void main(String[] args) {
        /**
         * Problem 2
         */

        System.out.println("Enter a line of text. No punctuation please.");//notice to input sentence.
        Scanner keyBoard = new Scanner(System.in); //To get user input

        String sentence = keyBoard.nextLine(); // input java is the language
        sentence = sentence.trim(); //To remove the space on both sides of a sentence

        sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);//make first character to uppercase.

        System.out.println(sentence); //View the sentence that is made as uppercase.

        int index = sentence.indexOf(" ", 0); //This index is for searching the start of the second word.
        String firstWord = sentence.substring(0, index); //java
        String lastWord = sentence.substring(index);//is the language

        //System.out.println(lastword);
        lastWord = lastWord.substring(1, 2).toUpperCase() + lastWord.substring(index - 2) + " " + firstWord;//make 'i' to uppercase
        lastWord = lastWord.trim();//To remove the space on both sides of a sentence.

        System.out.println(lastWord);

    }
}
