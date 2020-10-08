package OOP11;

import HomeWork3.Person;

public class newPerson {
    private String name;

    public newPerson() {
        name = "No name yet";
    }

    public newPerson(String initialName) {
        name = initialName;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
