import java.util.Scanner;

class Digits1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nod=0;			// No of Digits
		int temp=n;
		
		while(temp!=0)			// Finding No of Digits
		{
			temp=temp/10;
			nod++;
		}
		System.out.println("No of Digits:"+nod);
		
		int div=(int)Math.pow(10,nod-1);		// Divisor Calculation
		
		while(div!=0)
		{
			int q=n/div;					// finding left most digit
			System.out.println(q);
		
			n=n%div;					// Removing lest most digit
			div=div/10;					// Reducing divisor by 10 times
		}
	}
}

	 