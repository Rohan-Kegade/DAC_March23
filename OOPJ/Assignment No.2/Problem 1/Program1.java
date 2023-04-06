import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatter{
    public static void main( String []args )throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input date in dd/MM/yyyy format:");
        String inputString = sc.nextLine(); 

        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat outputDateFormat1 = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat outputDateFormat2= new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputDateFormat3 = new SimpleDateFormat("yyyy/mm/dd");
        
        Date date = inputDateFormat.parse(inputString);
        
        String outputDate1 = outputDateFormat1.format(date);   
        String outputDate2 = outputDateFormat2.format(date);
        String outputDate3 = outputDateFormat3.format(date);

        System.out.println("Date: " + outputDate1);
        System.out.println("Date: " + outputDate2);
        System.out.println("Date: " + outputDate3);
    }

}