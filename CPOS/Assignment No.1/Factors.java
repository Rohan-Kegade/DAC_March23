import java.util.Scanner;

class Factors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		System.out.print("Factors are:");
		int i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
}

		 