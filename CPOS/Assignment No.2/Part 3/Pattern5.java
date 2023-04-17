class Pattern5
{
	public static void main(String[] args)
	{
		int n=9;
		int n1=n;
		for(int i=0;i<=n-1;i++)
		{
			for(int k=n-i;k>=2;k--)
			{
				System.out.print("  ");
			}
			for(int j=n-i;j<=n;j++)
			{
				System.out.print(" "+j);
			}
			if(i!=0)
			{
			for(int j=8;j>=n1;j--)
			{
				System.out.print(" "+j);
			}
			}
			
			n1--;
		System.out.println();
		}
	}
}
		