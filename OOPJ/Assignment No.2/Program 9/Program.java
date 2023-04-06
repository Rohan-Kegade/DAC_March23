import java.util.Scanner;
import java.util.GregorianCalendar;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Date{
    private int day;
    private int month;
    private int year;
    private LocalDate date;

    public Date(){
        this.day=0;
        this.month=0;
        this.year=0;
    }
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }

    public boolean isValid(){
        if(this.date == LocalDate.of(this.year,this.month,this.day))
            return true;
        else    
            return false;   
    }
    public String getDayOfWeek(){
        return date.getDayOfWeek().name();
    }
    public boolean isLeapYear(){
        return ((this.year%400==0) || (this.year%4==0 && this.year%100!=0))? true : false;
    }
    public LocalDate getNextDay(){
        return date.plusDays(1);
    }
    public LocalDate getPreviousDay(){
        return date.minusDays(1);
    }
}

class DateTest{
    private static Scanner sc = new Scanner(System.in);
    Date date = new Date();

    public void result(){
        System.out.print("Enter Day : ");
        date.setDay(sc.nextInt());
        System.out.print("Enter Month : ");
        date.setMonth(sc.nextInt());
        System.out.print("Enter Year : ");
        date.setYear(sc.nextInt());
        if(date.isValid()){
            System.out.println("It is a Valid Date!");
            System.out.println("Week Day : "+date.getDayOfWeek());
            System.out.println(date.isLeapYear()? "It is a Leap year!" : "Not a Leap year!");
            System.out.println("Next Day : "+date.getNextDay());
            System.out.println("Previous Day : "+date.getPreviousDay());
        }
        else{
            System.out.println("Not a Valid Date!");
        }
    }
}

class Program{

    public static void main(String args[]){
        DateTest dt = new DateTest();
        dt.result();
    }
}
