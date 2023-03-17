import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number:");
		int Num=sc.nextInt();
		
		int temp=0;
		int i;
		int n=Num;
		while(Num!=0)
		{
			i=Num%10;
			temp=i+(temp*10);
			Num=Num/10;
		}
		if(temp==n)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome");
			
	}
}