class Pattern5
{
	public static void main(String[] args)
	{
		/*for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		char ch=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ch+i)+" ");
			}
			System.out.println();
		}
	}
}