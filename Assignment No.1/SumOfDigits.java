import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int digit;
		int Sum=0;
		while(Num!=0)
		{
			digit=Num%10;
			Sum=Sum+digit;
			Num=Num/10;
		}
		System.out.println("Sum of Digits="+Sum);
	}
}

	 