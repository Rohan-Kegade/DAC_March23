class Pattern13
{
	public static void main(String[] args)
	{
		int n=1;
		for(char i='A';i<='E';i++)
		{
			for(int j=5-n;j>=1;j--)
			{
				System.out.print(" ");
			}
			n++;
			for(char k='A';k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}