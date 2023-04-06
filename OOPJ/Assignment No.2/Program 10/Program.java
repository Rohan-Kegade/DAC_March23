import java.util.Scanner;

class CreditScoreCalculate{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;
    private int creditScore;

    CreditScoreCalculate(){
    int creditHistory=0;
    double creditUtilization=0;
    boolean paymentHistory=false;
    double creditScore=0;
    }

    public int getCreditHistory(){
        return this.creditHistory;
    }
    public double getCreditUtilization(){
        return this.creditUtilization;
    }
    public boolean getPaymentHistory(){
        return this.paymentHistory;
    }
    public int getCreditScore(){
        return this.creditScore;
    }
    public void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }
    public void setCreditUtilization(double creditUtilization){
        this.creditUtilization=creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }
    public void setCreditScore(){
        if(this.getPaymentHistory() == true){
            this.creditScore=((this.getCreditHistory()*15)+((int)(this.getCreditUtilization()*30))+55);
        }
        else{
            this.creditScore=((this.getCreditHistory()*15)+((int)(this.getCreditUtilization()*30))+35);
        }
    }
}

class Program{
    public static void main (String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
    CreditScoreCalculate credit = new CreditScoreCalculate();
    System.out.println("Enter Credit History : ");
    credit.setCreditHistory(sc.nextInt());
    System.out.println("Enter Credit Utilization : ");
    credit.setCreditUtilization(sc.nextDouble());
    System.out.println("Enter Payment History : ");
    credit.setPaymentHistory(sc.nextBoolean());
    credit.setCreditScore();

    System.out.println("Your credit Score : "+credit.getCreditScore());
    }  
}