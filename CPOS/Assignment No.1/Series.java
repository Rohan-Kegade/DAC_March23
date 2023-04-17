import java.util.Scanner;

class Series
{
	public static void main(String[] args)
	{
		System.out.print("Even Number Series:");
		for(int i=1;i<=100;i++)
			if(i%2==0)
				System.out.print(i+" ");
		
		System.out.println("");
		
		System.out.print("Odd Number Series:");
		for(int i=1;i<=100;i++)
			if(i%2!=0)
				System.out.print(i+" ");
	}
}

	 