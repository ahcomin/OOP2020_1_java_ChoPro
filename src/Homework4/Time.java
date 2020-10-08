package Homework4;

//끝

public class Time {//Declaration of Time class

    private int hour;
    private int minute;
    public String amORpm;

    public Time() { //Default constructor
        hour = 0;
        minute = 0;

        //setTime(0,0);
    }

    public Time(int newHour, int newMinute){ //this constructor have two parametars.
        setTime(newHour, newMinute);

    }

    public Time(int newHour, int newMinute, boolean isAM){
        setTime(newHour,newMinute,isAM);
    }
    //isValid method have two parameters of type int and returns a boolean value.
    private boolean isValid(int hour, int minute) {
        return (hour >= 0 && hour <= 23) && (minute >=0 && minute <=59);
    }

    public void setTime(int hour, int minute) {
        if (isValid(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
            /*
            if (this.hour < 12){
                amORpm = "am";
            }else {
                amORpm = "pm";
            }

             */

        }
    }

    //if true set the am_pm to "a.m.".
    //if false set the am_pm to "p.m.".
    public void setTime(int hour, int minute, boolean isAM) { //setTime have three parametas
        if (isValid(hour, minute)) {//call isValid method
            this.hour = hour;
            this.minute = minute;

            // to check whether the hour is within the range of 1 and 12

           if(isAM == true && hour < 12){
               amORpm = "am";

           }else if(isAM == false && hour >= 12)
               amORpm ="pm";
        }else
            amORpm ="input error";
    }
    /*
    this method returns a string representation of te time in 24-hour notation hhmm
     */
    public String getTime24(){
        String time = "";
        if (hour < 10)
            time +="0";
        time += hour;
        if (minute < 10)
            time += "0";
        time += minute;
        return time;
    }

    /*
    this method returns a String representation of the time in 12-hour notation h:mm
     */
    public String getTime12(){
        String time = "";
        if (hour == 0)
            time += 12;
        else if (hour <=12)
            time += hour;
        else
            time += hour %12;
        time +=":";
        if (minute<10)
            time+="0";
        time += minute +" "+amORpm;
        return time;
    }

    public static void main(String args[]) {
        Time time1 = new Time();
        Time time2 = new Time(9,9);
        Time time3 = new Time(22,55);
        Time time4 = new Time();
        time4.setTime(12,40,false);

        System.out.println("Time1 in 12-hour notation: "+ time1.getTime12());
        System.out.println("Time1 in 24-hour notation: "+time1.getTime24());
        System.out.println(time4.getTime12());


        System.out.println("Set the time to 12,12");
        time2.setTime(12,12);

        System.out.println("Trying to set time to -1,12");
        time1.setTime(-1,12);
        System.out.println("\t should be 12,12" + time1.getTime12());



    }
}

