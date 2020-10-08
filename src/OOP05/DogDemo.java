package OOP05;

public class DogDemo {

    public static void main(String arg[]) { //main method of the class
        Dog balto = new Dog(); //정의해 놓은 클래스를 인스턴스화 하는 방법
        balto.name = "Balto";
        balto.age = 8;
        balto.breed = "siberian Huskey";
        balto.writeOutput();

        Dog scooby = new Dog();
        scooby.name = "Scooby";
        scooby.age = 42;
        scooby.breed = "Greate Dane";
        System.out.println(scooby.name + "is a " + scooby.breed + ".");
        System.out.println("he is " + scooby.age + "years old, or ");
        int humanYears = scooby.getAgeInHumanYears();
        System.out.println(humanYears + "is human years");

    }
}
