import java.util.Scanner;

class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		
		System.out.println("Prime Factors are:");
		
		if(n!=0 && n!=1)
		{
		int temp=0;
		int res=1;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)								
			{	
				int m=i;
				
				for(int k=2;k<=m-1;k++)				
				{
					if(m%k==0)
						temp++;
				}
				if(temp==0)
				{
					System.out.print(" "+m);		
					n=n/m;						
					i--;
				}
				else
					temp=0;
			}		
		}		
		
		}
		else
			System.out.println("Invalid Number!");
	}
}
		 