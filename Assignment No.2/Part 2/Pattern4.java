class Pattern4
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=5;i>=1;i--)
		{
			for(int k=5-n;k>=1;k--)
			{
				System.out.print(" ");
			}
			n--;
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
		