package OOP1;

public class StringDemo {
    public static void main(String[] args) {

        String sentence = "Text processing is hard!";
        int posistion = sentence.indexOf("hard");
        System.out.println(sentence);
        System.out.println("012345678901234567890123");
        System.out.println("The word \"hard\" starts at index " + posistion);
        sentence = sentence.substring(0, posistion) + "easy!";
        sentence = sentence.toUpperCase();
        System.out.println("The changed String is : ");
        System.out.println(sentence);
    }
}
