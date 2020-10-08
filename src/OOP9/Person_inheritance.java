package OOP9;

import HomeWork3.Person;

public class Person_inheritance {
    private String name;

    public Person_inheritance() {
        name = "no name yet";

    }

    public Person_inheritance(String initialName) {
        name = initialName;
    }

    public void setNames(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name : name");

    }

    public boolean hasSameName(Person_inheritance otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
