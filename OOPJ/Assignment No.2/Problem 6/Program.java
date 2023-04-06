import java.util.Scanner;

class Account{
    private String accountHolderName;
    private int accountNumber;
    private double accountBalance;
    
    Account(){
        this.accountHolderName=null;
        this.accountNumber=10001000;
        this.accountBalance=0.0;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void setAccountNumber(){
        this.accountNumber++;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    
}

class Bank{
    private Scanner sc = new Scanner(System.in);
    private Account acc = new Account();
    
    public void createAccount(){
        System.out.print("Enter Your Name :");
        sc.nextLine();
        acc.setAccountHolderName(sc.nextLine());

        acc.setAccountNumber();
        System.out.println("Account Number : "+acc.getAccountNumber());
    
        acc.setAccountBalance(0.0f);
        System.out.println("Account Balance : "+acc.getAccountBalance());
        System.out.println("Account Created Successfully!");
    }
    public void accountInfo(){
        System.out.println("Account Holder's Name : "+acc.getAccountHolderName());
        System.out.println("Account Number : "+acc.getAccountNumber());
        System.out.println("Account Balance : "+acc.getAccountBalance());
    }
    public void displayAccountBalance(){
        System.out.println("Enter Account number : ");
        int accNumber = sc.nextInt();
        if(acc.getAccountNumber()!=accNumber){
            System.out.println("Account Not Found!");
        }
        else{
            System.out.println("Account Balance : "+acc.getAccountBalance());
        }
    }
    public void depositeMoney(){
        System.out.println("Enter Account Number : ");
        int accNumber = sc.nextInt();
        if(acc.getAccountNumber()!=accNumber){
            System.out.println("Account Not Found!");
        }
        else{
            System.out.println("Enter Amount: ");
            acc.setAccountBalance(acc.getAccountBalance()+sc.nextDouble());
        }
    }
    public void withdrawMoney(){
        System.out.println("Enter Account Number : ");
        int accNumber = sc.nextInt();
        if(acc.getAccountNumber()!=accNumber){
            System.out.println("Account Not Found!!");
        }
        else{
            System.out.println("Enter Amount: ");
            acc.setAccountBalance(acc.getAccountBalance()-sc.nextDouble());
        }
    }
    public int menuList(){
        System.out.println("0. Exit");
        System.out.println("1. Create New account");
        System.out.println("2 .Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Balance");
        System.out.println("5. Display Account Information");
        System.out.print("Enter Your Choice : ");
        return sc.nextInt();
    }
}

class Program{
    public static void main(String args[]){
        Bank bank = new Bank();
        int choice;
        while(( choice = bank.menuList()) !=0 ){
            switch(choice){
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.depositeMoney();
                    break;
                case 3:
                    bank.withdrawMoney();
                    break;
                case 4:
                    bank.displayAccountBalance();
                    break;
                case 5:
                    bank.accountInfo();
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}