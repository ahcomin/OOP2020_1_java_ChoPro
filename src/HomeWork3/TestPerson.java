

package HomeWork3;

public class TestPerson {
    public static void main(String arg[]) { //main method of the class
        //people objects
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();

        System.out.println("First person(p1) : ");
        p1.setPerson("minyoung", 25);
        p1.writeOutPut();
        System.out.println();

        System.out.println("Second Person(p2) : ");
        p2.setPerson("minjung", 29);
        p2.writeOutPut();
        System.out.println();

        //The test they have the same name and age or not.
        System.out.println("Let's compare two names. ");
        System.out.println("True >> two person is same!");
        System.out.println("False >> two person is not same!");
        System.out.println("Two person is " + p1.isEqualName(p2));

        System.out.println();
        System.out.println("Third person(p3) : ");
        p3.setPerson("minjung",20);
        p3.writeOutPut();
        System.out.println();

        System.out.println("p2 and p3 same person?");
        if (p2.isEqualName(p3) == true && p2.getAge() == p3.getAge()){ //같으면 YES 출력.
            System.out.println("YES!");
        }else {
            System.out.println("NO!");
        }

        System.out.println();

        System.out.println("Let's compare the names of p1 and p2");
        if(p1.isequalName(p2)){
            System.out.println("Same!");
        }else {
            System.out.println("not same!");
        }
        System.out.println();

        System.out.println("p1 and p3 are same age?");
        if ((p1.isequalAge(p3))){
            System.out.println("YES!");
        }else
            System.out.println("NO!");

        System.out.println();

        System.out.println("who is younger?");
        System.out.print("p3 , p2 : "); //p3와 p2 중에서 누가 더 어린지.
        p3.whoisyounger(p2);
        System.out.println();
        System.out.print("p2 and p1 : ");//p2와 p1중 누가 더 어린지.
        p2.whoisyounger(p1);
        System.out.println();
        System.out.print("p1 and p3 : ");//p1과 p3 중 누가 더 어린지.
        p1.whoisyounger(p3);

        }

    }


