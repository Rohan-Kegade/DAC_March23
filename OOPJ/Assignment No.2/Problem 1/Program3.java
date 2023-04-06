import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateAndTimeFormatter{
    public static void main( String []args )throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input date in dd/MM/yyyy format:");
        String dateString = sc.nextLine(); 
        System.out.print("Input Time in hh:mm:ss format:");
        String timeString = sc.nextLine(); 

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat inputTimeFormat = new SimpleDateFormat("hh:mm:ss");

        SimpleDateFormat outputDateFormat1 = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat outputDateFormat2= new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputDateFormat3 = new SimpleDateFormat("yyyy/mm/dd");

        SimpleDateFormat outputTimeFormat1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat outputTimeFormat2= new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat outputTimeFormat3 = new SimpleDateFormat("HH:mm");
        
        Date date = inputDateFormat.parse(dateString);
        Date time = inputTimeFormat.parse(timeString);

        System.out.println("Date: " + outputDateFormat1.format(date)+" Time: " + outputTimeFormat1.format(time));
        System.out.println("Date: " + outputDateFormat2.format(date)+" Time: " + outputTimeFormat2.format(time));
        System.out.println("Date: " + outputDateFormat3.format(date)+" Time: " + outputTimeFormat3.format(time));
    }
    
}