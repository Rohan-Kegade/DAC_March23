import java.util.Scanner;

class BmiCalculator{
    double height;
    double weight;

    BmiCalculator()
    {
        this.height=height;
        this.weight=weight;
    }
    double getHeight(){
        return this.height;
    }
    void setHeight(double height){
        this.height=height;
    }
    double getWeight(){
        return this.weight;
    }
    void setWeight(double weight){
        this.weight=weight;
    }
    double calculateBmi(){
        double bmi = weight/(height*height);
        return bmi;
    }
}

class BmiTest{
    Scanner sc = new Scanner(System.in);
    BmiCalculator bmiCal = new BmiCalculator();
    void acceptRecord(){
        System.out.print("Enter Your Height (meters): ");
        bmiCal.setHeight(sc.nextDouble());
        System.out.print("Enter Your Weight (kg) : ");
        bmiCal.setWeight(sc.nextDouble());
    }
    void printRecord(){
        System.out.printf("BMI = %.2f",bmiCal.calculateBmi());
    }
}    

class Program{
    public static void main(String[] args){
        BmiTest bt = new BmiTest();
        BmiCalculator bmic = new BmiCalculator();
        bt.acceptRecord();
        bmic.calculateBmi();
        bt.printRecord();
    }
}