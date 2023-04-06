import java.util.Scanner;

class TelephoneBill{
    private String customerName;
    private int phoneNumber;
    private int noOfCallsMade;
    private int durationOfCalls;
    private double bill;

    public TelephoneBill(){
        this.customerName=null;
        this.phoneNumber = 0;
        this.noOfCallsMade = 0;
        this.durationOfCalls = 0;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setNoOfCallsMade(int noOfCallsMade){
        this.noOfCallsMade = noOfCallsMade;
    }
    public void setDurationOfCalls(int durationOfCalls){
        this.durationOfCalls = durationOfCalls;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public int getNoOfCallsMade(){
        return this.noOfCallsMade;
    }
    public int getDurationOfCalls(){
        return this.durationOfCalls;
    }

    public double calculateBill(){
        if(noOfCallsMade<=100)
        {
            this.bill = 0.50*noOfCallsMade;
        }
        else if(noOfCallsMade>100)
        {
            this.bill = (0.50*100) + (0.25*(noOfCallsMade-100));
        }
        this.bill += 10;
        return this.bill;
    }    
}

class TeleBillTest{
    Scanner sc = new Scanner(System.in);
    TelephoneBill tb = new TelephoneBill();

    public void acceptRecord(){
        System.out.print("Enter Customer Name : ");
        tb.setCustomerName(sc.nextLine());
        System.out.print("Enter Phone Number : ");
        tb.setPhoneNumber(sc.nextInt());
        System.out.print("No of Calls Made : ");
        tb.setNoOfCallsMade(sc.nextInt());
        System.out.print("Duration of Calls : ");
        tb.setDurationOfCalls(sc.nextInt());

    }
    public void printBill(){
        System.out.println("Bill : "+tb.calculateBill());
    } 
}

class Program{
    public static void main(String[] args){
    TeleBillTest tbl = new TeleBillTest();
    tbl.acceptRecord();
    tbl.printBill();
    }
}