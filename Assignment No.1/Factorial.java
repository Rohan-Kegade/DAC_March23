import java.util.Scanner;

class Factorial
{
	static int fact=1;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		Factorial f = new Factorial();
		
		int res=f.factorial(n);
		System.out.println("Factorial:"+res);

	}
	
	int factorial(int n)
	{
			if(n>1)
			{
				fact=fact*n;
				n--;
				factorial(n);
			}
			return fact;
	}
	
}

	 