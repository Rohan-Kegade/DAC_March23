class Pattern7
{
	public static void main(String[] args)
	{
		
		
		int n=1;
		for(int i=1;i<=9;i++)
		{
			
			for(int k=5-n;k>=1;k--)
			{
				System.out.print(" ");
			}
			n++;
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		i++;
		}
		
		
		n=5;
		for(int i=7;i>=1;i--)
		{
			
			for(int k=6-n;k>=1;k--)
			{
				System.out.print(" ");
			}
			n--;
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		i--;
		}
	}
}
		