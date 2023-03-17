class Pattern8
{
	public static void main(String[] args)
	{
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			n++;
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}