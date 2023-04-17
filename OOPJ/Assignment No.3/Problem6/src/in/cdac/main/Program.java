package in.cdac.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static int menuList(){
		System.out.println("Welcome!!");
		System.out.println("0. Exit");
		System.out.println("1. Add a new Sales Person");
		System.out.println("2. Update an existing salesperson");
		System.out.println("3. View total sales for salesperson");
		System.out.println("4. View total sales for all salesperson");
		System.out.println("Enter Your Choice	: ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales sale = new Sales();
		int choice;
		while ((choice = menuList())!= 5) {
			switch (choice) {
			case 1:
				sale.addSalesPerson();
				break;
			case 2:
				sale.updateSales();
				break;
			case 3:
				sale.viewTotalSales();
				break;
			case 4:
				sale.viewCompanySales();
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
	}
}
