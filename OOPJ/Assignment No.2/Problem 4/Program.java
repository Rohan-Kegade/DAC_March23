import java.util.Scanner;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    double calculateBillAmount(){
        if(unitsConsumed<=100)
        {
            billAmount = 5*unitsConsumed;
        }
        else if(unitsConsumed<=300)
        {
            billAmount = 500 + (7*(unitsConsumed-100));
        }
        else
        {
            billAmount = 500+1400+(10*(unitsConsumed-300));
        }
        return billAmount;
    }
    Scanner sc = new Scanner(System.in);
    void printBill(){
            System.out.println("Bill : "+billAmount);
        }
    void setCustomerDetails(){
        System.out.print("Enter Customer Name : ");
        customerName = sc.nextLine();
        System.out.print("Units Consumed : ");
        unitsConsumed = sc.nextDouble();
    }    
}


class Program {
    public static void main(String []args){
        
        ElectricityBill elecBill = new ElectricityBill();
        
        elecBill.setCustomerDetails();
        elecBill.calculateBillAmount();
        elecBill.printBill();
    }

}