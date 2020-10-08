package OOP7;

public class Ticket {

    private static int numTicketsSold = 0; //static variable == class variables, created only once
    //오브젝트가 아닌 클래스의 데이터가 된다. 클래스 차원에 한개만(한번만) 생성되는 변수다. 모든 오브젝트가 엑세스 할 수 있다.
    //static variables of a class are created only once, shared by all objects of the class
    //accessed by all instances of the class
    //not created separately for each object unlike instance variables.
    private int ticketNum;// instance variable - one per object.

    public Ticket() {
        numTicketsSold++;
        ticketNum = numTicketsSold;
    }

    public static int getNumberSold() {
        return numTicketsSold;
    }

    public int getTicketNumber() {
        return ticketNum;
    }

    public String getInfo() {
        return "ticket # " + ticketNum + ";" + numTicketsSold + " ticket(s) sold.";
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        System.out.println(t1.getTicketNumber());

        Ticket t2 = new Ticket();
        System.out.println(t2.getTicketNumber());

        System.out.println (t1.getInfo());
        System.out.println (t2.getInfo());
        /*
        static method를 추가한 후

        sou Ticket.getNumberSold();

        Ticket t1 = new Ticket();
        sout Ticket.getNumberSold()

        Ticket t2 = new Ticket();
        sout Ticket.getNumberSold();

        t1.getInfo();
        t2.getInfo()

        
         */

    }

}