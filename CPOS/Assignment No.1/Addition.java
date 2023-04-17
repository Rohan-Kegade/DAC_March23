import java.util.Scanner;

class Addition
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter First Number:");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number:");
		int b = sc.nextInt();
			
		for(int i=1;i<=b;i++)
			a++;
		
		System.out.print(a);

	}
}

	 