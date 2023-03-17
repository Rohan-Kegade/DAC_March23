import java.util.Scanner;

class Lcm
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first Number:");
		int a= sc.nextInt();
		System.out.print("Enter first Number:");
		int b= sc.nextInt();
		
		int product=a*b;
		int res=0;
		
		while(b!=a)
		{
			if(a>b)
			{
				res=a-b;
				a=res;	
			}
			else
			{
				res=b-a;
				b=res;
			}
		}
		int lcm=product/a;
		System.out.println("LCM:"+lcm);
	}
}