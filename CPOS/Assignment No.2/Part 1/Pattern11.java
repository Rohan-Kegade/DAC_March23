class Pattern11
{
	public static void main(String[] args)
	{
		int n=1;
		for(int i=1;i<=9;i++)
		{
			if(i%2!=0)
			{
			for(int j=5-n;j>=1;j--)
			{
				System.out.print(" ");
			}
			n++;
			for(int k=1;k<=i;k++)
			{
				
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}
}