class Pattern10
{
	public static void main(String[] args)
	{
		/*int n=1;
		for(char i='E';i>='A';i--)
		{
			for(int j=5-n;j>=1;j--)
			{
				System.out.print(" ");
			}
			n++;
			for(char k=i;k<='E';k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}*/
		
		int n=5;
		char ch=64;
		for(int i=n;i>=1;i--)
		{
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
}