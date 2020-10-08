package OOP9;

import HomeWork3.Person;

public class Pet {

    private String name;
    private int age; //in years
    private double weight; //in pounds
/*
    public Pet() {
        name = "no name yet";
        age = 0;
        weight = 0;
    }
    public Pet(String initName, int initAge, double initWeight){
        name = initName;
        age = initAge;
        weight = initWeight;

    }
    public static void main(String[] args){
        Pet p = new Pet();
        Pet q = new Pet("garfield", 3, 10);
        System.out.println(q.weight);
    }

     */

    public Pet(String initialName, int initialAge, double initialWeight) {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error : Nagatice age of weight.");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }

    }

    public void setName(String newName) {
        name = newName; //age and weight are uncharged
    }

    public void setPet(int newAge, double newWeight) {

        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("ERROR");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }

    }
}
