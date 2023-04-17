import java.util.Scanner;

class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		
		if(n!=0)
			if(n>0)
				System.out.println("Given number is Positive");
			else
			System.out.println("Given number is Negative");
		else
			System.out.println("You have entered 0");
	}
}

	 