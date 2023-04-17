package in.cdac.domain;

import java.util.Scanner;

public class Menu {
	private Dish[] dishes = Dish.values();
	private static Scanner sc = new Scanner(System.in);
	private float[][] orderSummary = new float[4][2];
	{
	orderSummary[0] = new float[] {0,0};
	orderSummary[1] = new float[] {0,0};
	orderSummary[2] = new float[] {0,0};
	orderSummary[3] = new float[] {0,0};
	}
	
	public void takeOrder() {
		int choice;
		System.out.println("Welcome!!!");
		while ( (choice = printMenu())!=0 ) {
		}
	}
	
	public int printMenu() {
		
		System.out.println("##MENU CARD##");
		System.out.println("0.Exit");
		int index = 1;
		for (Dish dish : dishes) {
			System.out.println(index +" " + dish.getName() + " Rs. " + dish.getPrice());
			index++;
		}
		
		System.out.print("Select Your Dish : ");
		int choice = sc.nextInt();
		if (choice == 0)
			return choice;
		System.out.print("Please Enter quantity	: ");
		int quant = sc.nextInt();
		if (choice(choice, quant)) {
			if (!repeat()) {
				bill();
				System.out.println("Thank You!!");
				return 0;
			}
		}else {
			System.out.println("Invalid Input!!");
		}
		return choice;
	}
	
	private void bill() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< orderSummary.length; i++) {
			if (orderSummary[i][0] != 0) {
				System.out.println(dishes[i] + " " + orderSummary[i][0] +" Rs " + orderSummary[i][0]);
			}
		}
		
	}

	public boolean  choice(int choice, int quantity) {
		if (quantity < 1 || choice < 1 || choice > 5 )
			return false;
		orderSummary[choice-1][0] +=quantity;
		orderSummary[choice-1][1] = orderSummary[choice-1][0] * dishes[choice-1].getPrice();
		System.out.println("Total Cost: "+ orderSummary[choice-1][1]);
		return true;
	}
	
	public boolean repeat() {
		System.out.println("Do you want to order something else Y/N");
		char c = sc.next().charAt(0);
		if (c == 'Y') {
			return true;
		}else if(c == 'N') {
			return false;
		}else {
			System.out.println("Invalid Input!!");
			return repeat();
		}
	}
}
