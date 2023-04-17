

class Numbers
{
	
	public static void main(String[] args)
	{
		
		Numbers ns = new Numbers();
		int n=1;
		ns.numbers(n);

	}
	
	void numbers(int n)
	{
			if(n<=10)
			{
				System.out.println(" "+n);
				n++;
				numbers(n);
			}
		
	}
	
}

	 