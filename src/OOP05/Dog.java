package OOP05;

public class Dog {
    //메인 매소드를 굳이 가질 필요없다 도그라는 오브젝트를 정의 하고 있기 때문 실행해는건 도그 데모서 실행된다.
    //instance variables
    //아무 매소드에사 엑세스가 가능하다.

    public String name;
    public String breed;
    public int age;

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);

        System.out.println("Age in calendar years:" + age);
        System.out.println("Age in human yeasrs: " + getAgeInHumanYears());
        System.out.println();

    }

    public int getAgeInHumanYears() {
        int humanAge = 0; //local variable
        if (age <= 2) {
            humanAge = age * 11;


        } else {
            humanAge = 22 + ((age - 2) * 5);
        }
        return humanAge;
    }
}
