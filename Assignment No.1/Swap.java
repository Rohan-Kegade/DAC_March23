import java.util.Scanner;

class Swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter First Number:");
		int n1 = sc.nextInt();
		System.out.print("Enter Second Number:");
		int n2 = sc.nextInt();
		System.out.println("Before Swap: Num1="+n1+" Num2="+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("After Swap: Num1="+n1+" Num2="+n2);

	}
}

	 