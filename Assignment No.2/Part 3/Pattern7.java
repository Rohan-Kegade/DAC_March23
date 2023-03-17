import java.util.Scanner;

class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//n=9;
		int j1=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=j1;j++)
			{
				System.out.print(" ");
			}
			for(int k=(n+1)-j1;k>=1;k--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			j1++;
		}
	}
}