import java.util.Scanner;

class Lcm1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first Number:");
		int a= sc.nextInt();
		System.out.print("Enter Second Number:");
		int b= sc.nextInt();
		
		int lcm=a>b?a:b;
		while(lcm%a!=0 || lcm%b!=0)
			lcm++;
		
		System.out.println("lcm:"+lcm);	
	}
}