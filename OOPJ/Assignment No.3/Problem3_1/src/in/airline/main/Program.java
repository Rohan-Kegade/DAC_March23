package in.airline.main;

import java.util.Scanner;

import in.airline.domain.Airline;
import in.airline.domain.User;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static boolean userRegister(Airline airline) {
		// TODO Auto-generated method stub
		User user = new User();
		System.out.print("Enter your name	:");
		sc.nextLine();
		user.setName(sc.nextLine());
		System.out.print("Enter your email	:");
		user.setEmail(sc.nextLine());
		System.out.print("Enter your contact	:");
		user.setContact(sc.nextLong());
		return airline.registerUser(user);
	}

	private static boolean getFlight(Airline airline) {
		// TODO Auto-generated method stub
		airline.displayFlight();
		System.out.print("Enter the flight number	:");
		return  (airline.getFlight(sc.nextInt()));
		
	}
	
	private static boolean reserveSeat(Airline airline) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Flight Number	:");
		int fNo = sc.nextInt();
		if (!airline.getFlight(fNo))
			return false;
		System.out.print("Enter the seat row	:");
		int row = sc.nextInt();
		System.out.print("Enter the sear col	:");
		int col = sc.nextInt();
		System.out.print("Enter your email	:");
		sc.nextLine();
		String email = sc.nextLine();
		if (airline.reserveSeat(fNo, row, col, email))
			return true;
		return false;
	}

	private static boolean viewReservation(Airline airline) {
		// TODO Auto-generated method stub
		System.out.print("Enter your email	:");
		sc.nextLine();
		String email = sc.nextLine();
		return airline.viewReservation(email);
	}
	
	private static boolean cancelReservation(Airline airline) {
		// TODO Auto-generated method stub
		System.out.print("Enter your email	:");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Enter your booking Number	:");
		int bNo = sc.nextInt();
		return airline.cancelReservation(email, bNo);
	}

	public static int menuList() throws Exception {
		System.out.println("0. Exit");
		System.out.println("1. User Registeration");
		System.out.println("2. Flight Availaibility");
		System.out.println("3. Seat Reservation");
		System.out.println("4. View Reservation");
		System.out.println("5. Cancel Reservation");
		System.out.print("Enter your choice	:");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline airline = new Airline();
		try {
			int choice;
			while ((choice = menuList()) != 0){
				switch (choice) {
				case 1:
					if((userRegister(airline)==true))
							System.out.println("Registration Successful!!!");
					else
						System.out.println("Registration Unsuccessful!");
					break;
					
				case 2:
					getFlight(airline);
					break;
					
				case 3:
					if(reserveSeat(airline)==true)
						System.out.println("Reservation Successful!!!");
					else
						System.out.println("Reservation Unsuccessful!");
					break;
				case 4:
					viewReservation(airline);
					break;
				case 5:
					if(cancelReservation(airline)==true)
						System.out.println("Reservation Cancelled!!!");
					else
						System.out.println("Booking Not Found!");
					break;
				default :
					System.out.println("Invalid Input");
					//break;
				}
			}
			System.out.println("Thank you!!!");
			
		}catch (Exception e){
			System.err.println(e);
			System.out.println("Enter Valid Input");
		}
	}
	
		
	

	



	
	

	
	

}

