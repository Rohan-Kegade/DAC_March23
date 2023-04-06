//  Write a program to find minimum and maximum number as well as to add two float numbers using methods of Float.

class Problem26{
    public static void main(String[] args){
        float num1 = 1000.0f;
        float num2 = 2000.0f;

        System.out.println("Max :"+ Float.max(num1,num2));

        System.out.println("Min :"+ Float.min(num1,num2));

        System.out.println("Sum :"+ Float.sum(num1,num2));

    }
}