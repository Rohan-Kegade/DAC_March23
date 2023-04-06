import java.util.Scanner;

class TollBooth{
    private String vehicleType;
    private int numberAxles;
    private double distanceTravelled;
    private double tollFee;
    private double totalAmountDue;
    final String a[]= {"car","van","bus","truck"};

    public TollBooth(){
        this.vehicleType=null;
        this.numberAxles=0;
        this.distanceTravelled=0.0;
        this.tollFee=0.0;
        this.totalAmountDue=0.0;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public int getNumberAxles(){
        return this.numberAxles;
    }
    public double getDistanceTravelled(){
        return this.distanceTravelled;
    }
    public double getTollFee(){
        return this.tollFee;
    }
    public double getTotalAmountDue(){
        return this.totalAmountDue;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public void setNumberAxles(int numberAxles){
        this.numberAxles=numberAxles;
    }
    public void setDistanceTravelled(double distanceTravelled){
        this.distanceTravelled=distanceTravelled;
    }
    public void setTollFee(double tollFee){
        this.tollFee=tollFee;
    }
    public void setTotalAmountDue(double totalAmountDue){
        this.totalAmountDue=totalAmountDue;
    }
}

class Test{
    
    private Scanner sc = new Scanner(System.in);
    TollBooth tb = new TollBooth();
    public double calculateTollFee(){
         if(tb.getVehicleType()=="car"||tb.getVehicleType()=="van"||tb.getVehicleType()=="bus"){
            tb.setTollFee(tb.getDistanceTravelled()*tb.getNumberAxles()*0.25);
         }
         else{
            tb.setTollFee(tb.getDistanceTravelled()*tb.getNumberAxles()*0.50);
         }
         tb.setTotalAmountDue(tb.getTollFee()+2);
         return tb.getTollFee();
    }
    public void generateBill(){
        calculateTollFee();
         System.out.println("Vehicle Type : "+tb.getVehicleType());
         System.out.println("Number of Axle : "+tb.getNumberAxles());
         System.out.println("Distance Traveled : "+tb.getDistanceTravelled());
         System.out.println("Toll fee : "+tb.getTollFee());
         System.out.println("Total Amount due : "+tb.getTotalAmountDue());
    }
    public void validVahicle(String vehicleType){
        String a[]= {"car","van","bus","truck"};
        boolean flag=false;
        for (String type:a){
            if(type.equals(vehicleType.toLowerCase())){
                flag=true;
                break;
            }
        }
        if(flag){
            tb.setVehicleType(vehicleType);
        }
        else{
            System.out.println("Enter Vehicle Type again");
            validVahicle(sc.nextLine());
        }
    }
    
    public void showMenu(){
        
        System.out.println("Enter Vehicle Type (Car/Van/Bus/Truck) : ");
        sc.nextLine();
        validVahicle(sc.nextLine());
        System.out.println("Enter Number of Axles : ");
        tb.setNumberAxles(sc.nextInt());
        System.out.println("Enter Distance Travelled : ");
        tb.setDistanceTravelled(sc.nextDouble());
    }
    public int menuList(){
        System.out.println("Enter Your Choice : ");
        System.out.println("0. Exit");
        System.out.println("1. Enter Vehicle Data");
        System.out.println("2. Calculate Toll Fee");
        System.out.println("3. Generate Bill");
        
        return sc.nextInt();
    }

}

class Program{
    public static void main(String args[]){
        Test test = new Test();
        int choice;
        while((choice=test.menuList())!=4){
            switch(choice){
                case 1 :
                    test.showMenu();
                    break;
                case 2 :
                    System.out.println("Toll fee : "+test.calculateTollFee());
                    break;
                case 3 :
                    test.generateBill();
                    break;
                default :
                    break;

            }
        }
    }
}