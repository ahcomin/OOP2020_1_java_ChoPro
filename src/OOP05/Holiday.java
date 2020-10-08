package OOP05;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public static void main(String[] args)
    {
        Holiday day1 = new Holiday();
        Holiday day2 = new Holiday();

        day1.setInfo("Independence Day", 1, "March");
        day2.setInfo("Children's Day", 5, "May");

        day1.writeOutput();
        System.out.println();

        day2.writeOutput();

        day1.inSameMonth(day2);
    }
    public boolean inSameMonth(Holiday otherDay){

        return this.month.equals(otherDay.month);
    }

    public void setInfo(String nameHol, int dayHol, String monthHol)
    {
        name = nameHol;
        day = dayHol;
        month = monthHol;
    }



    public void writeOutput()
    {
        System.out.println("Name : " + name);
        System.out.println("Day : " + day);
        System.out.println("Month : " + month);
    }

}
