class Pattern4
{
	public static void main(String[] args)
	{
		int n=9;
	
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			if(i!=1)
			{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" "+j);
			}
			}
			
			
		System.out.println();
		}
	}
}
		