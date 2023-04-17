class Pattern9
{
	public static void main(String[] args)
	{
		/*int n=1;
		for(char i='A';i<='E';i++)
		{
			for(int j=5-n;j>=1;j--)
			{
				System.out.print(" ");
			}
			n++;
			for(char k='A';k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}*/
		
		int n=5;
		char ch=64;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
}