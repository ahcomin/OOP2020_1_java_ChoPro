/**
 * <h1> Person </h1>
 * <p>
 * 사람의 이름과 나이가 같은지 또 누가 더 나이가 많은지 비교하는 프로그램.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac TestPerson.java
 * @Run : java Person
 * Programming Assignment 2.
 * @since 04-30-2020
 */


package HomeWork3;

public class Person {
    //person's name and age
    private String name;
    private int age;

    public void setName(String newName) {

        name = newName;
    }

    public void setAge(int newAge) {

        if (newAge >= 0) {
            age = newAge;

        } else {
            System.out.println("ERROR" + "you entered negative number.");

        }
    }

    //to return name
    public String getName() {
        return name;

    }
    //to return age
    public int getAge() {
        return age;

    }

    //method to set person with name and age
    public void setPerson(String newName, int newAge) {
        setName(newName);
        setAge(newAge);

    }


    public boolean isEqualName(Person otherPerson) {//이름이 같은지 확인해주는 메소드

        return (this.name.equals(otherPerson.getName())) && (this.age == otherPerson.getAge());


    }

    //나이가 같으면 true 출력.
    public boolean isequalAge(Person otherPerson) {

        return this.age == otherPerson.age;

    }

    //이름이 같으면 true 출력.
    public boolean isequalName(Person otherPerson) {
        return this.name.equals(otherPerson.getName());
    }



    public void whoisyounger(Person otherPerson) {//나이 비교하는 메서드.
        if (getAge() < otherPerson.getAge()){
            System.out.println(otherPerson.name + " is older");
        }else if(getAge() > otherPerson.getAge()){
            System.out.println(otherPerson.name +" is younger");
        }

    }

    public void writeOutPut() { //출력해주는 메서드.
        System.out.println("This is " + name);
        System.out.println("My age is " + age);

    }
}
