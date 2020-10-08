package OOP1;

import java.util.Scanner;

public class EggBasket {

    public static void main(String[] args) {
        System.out.println("Enter the number of eggs in each baskets");

        int numberOfBaskets, eggsBasket, totalEggs;  //<< variable declaration 변수 명을 잘 지을것.
        Scanner kb = new Scanner(System.in);
        numberOfBaskets = kb.nextInt();
        System.out.println("Enter the number of baskets");
        eggsBasket = kb.nextInt();

        totalEggs = numberOfBaskets * eggsBasket;

        System.out.println(eggsBasket + " Eggs per basket and");
        System.out.println(numberOfBaskets + "baskets then");
        System.out.println("the total number of eggs is " + totalEggs);

        System.out.println("now we take two eggs out of each baskets");

        totalEggs = numberOfBaskets * (eggsBasket - 2);
        eggsBasket = eggsBasket - 2;
        System.out.println("you have now");

        System.out.println(eggsBasket + "eggs per basket and ");
        System.out.println(numberOfBaskets + "baskets then");
        System.out.println("the total number of eggs is " + totalEggs);


    }
}
