import java.util.Scanner;

class Digits
{
	public static void main(String[] args)
	{
		System.out.print("Enter your number:");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		
		int digit;
		
		while(Num!=0)
		{
			digit=Num%10;
			System.out.print(" "+digit);
			Num=Num/10;
		}
		
			
	}
}

	 