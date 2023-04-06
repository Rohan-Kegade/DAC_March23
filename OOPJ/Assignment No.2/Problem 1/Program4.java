import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTimeFormatter{
    public static void main( String []args )throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input date in dd/MM/yyyy format and Time in hh:mm:s format:");
        String inputString = sc.nextLine(); 

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        SimpleDateFormat outputFormat1 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        SimpleDateFormat outputFormat2= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        SimpleDateFormat outputFormat3 = new SimpleDateFormat("yyyy/mm/dd HH:mm");
        
        Date date = inputFormat.parse(inputString);

        System.out.println("Date: " + outputFormat1.format(date));
        System.out.println("Date: " + outputFormat2.format(date));
        System.out.println("Date: " + outputFormat3.format(date));
    }
    
}