package in.cdac.acts.main;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static int menuList(){
		
		System.out.println("0. Exit");
		System.out.println("1. View Available Seats");
		System.out.println("2. Reserve Seats");
		System.out.println("3. View Ticket Sales");
		System.out.print("Enter Your Choice	:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre();
		
		int choice;
		while ((choice = menuList())!= 0) {
			switch (choice) {
			case 1:
				theatre.displaySeats();
				break;
			case 2:
				theatre.reserveSeats();
				break;
			case 3:
				theatre.viewSales();
				break;
			default:
				System.out.println("Invalid Input!");
				break;
			}
		}
	}
}
