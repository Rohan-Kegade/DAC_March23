class Pattern16
{
	public static void main(String[] args)
	{
		int n=1;
		for(int i=1;i<=5;i++)
		{
			if(i==5)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
			}
			
			else
			{
			for(int k=5-n;k>=1;k--)
			{
				System.out.print(" ");
			}
			n++;
			for(int j=1;j<=i;j++)
			{
				if(j==i || j==1)
				System.out.print("*");
				else
					System.out.print(" ");	
			}
			}
		System.out.println();
		}
	}
}
		