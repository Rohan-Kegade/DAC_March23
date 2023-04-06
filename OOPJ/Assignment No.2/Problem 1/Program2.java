import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class TimeFormatter{
    public static void main( String []args )throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Time in hh:mm:ss format:");
        String inputString = sc.nextLine(); 

        SimpleDateFormat inputTimeFormat = new SimpleDateFormat("hh:mm:ss");

        SimpleDateFormat outputTimeFormat1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat outputTimeFormat2= new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat outputTimeFormat3 = new SimpleDateFormat("HH:mm");
        
        Date time = inputTimeFormat.parse(inputString);
        
        // String outputTime1 = outputTimeFormat1.format(time);   
        // String outputTime2 = outputTimeFormat2.format(time);
        // String outputTime3 = outputTimeFormat3.format(time);

        System.out.println("Time: " + outputTimeFormat1.format(time));
        System.out.println("Time: " + outputTimeFormat.format(time));
        System.out.println("Time: " + outputTimeFormat3.format(time));
    }

}