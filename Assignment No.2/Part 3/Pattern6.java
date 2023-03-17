import java.util.Scanner;

class Pattern6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//n=9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-i;k>=1;k--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}