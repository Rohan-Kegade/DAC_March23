package in.cdac.acts.main;

import java.util.Scanner;
public class Theatre {
	private static Scanner sc = new Scanner(System.in);

	private boolean [][] seats = new boolean[15][10]; 
	private int uniqNo = 1;
	private int seatSold = 0;
	private int PRICE = 350;
	
	Theatre(){
		// TODO
	}
	
	public boolean[][] getSeats() {
		return seats;
	}

	public void setSeats(boolean[][] seats) {
		this.seats = seats;
	}

	public int getUniqNo() {
		return uniqNo;
	}

	public void setUniqNo(int uniqNo) {
		this.uniqNo = uniqNo;
	}

	public int getSeatSold() {
		return seatSold;
	}

	public void setSeatSold(int seatSold) {
		this.seatSold = seatSold;
	}
		
	public void viewSales() {
		// TODO Auto-generated method stub
		System.out.println("Total Ticket Sold	: "+seatSold);
		System.out.println("Total Revenue 	: "+seatSold*PRICE);
	}

	public boolean reserveSeats() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of seats you want to book");
		int num = sc.nextInt();
		if (num<1 && num <= 100 - seatSold) {
			System.out.println("Enter invalid input");
			return false;
		}
		int i = 0;
		while (i < num) {
			System.out.println("Enter the row of seat "+(i+1));
			int row = sc.nextInt();
			System.out.println("Enter the col of seat "+(i+1));
			int col = sc.nextInt();
			if (row > 10 || col > 10 || row < 0 || col < 0) {
				System.out.println("Select valid seats");
			}else if (seats[row][col] == false) {
			 seats[row][col] = true;
			 i++;
			 seatSold++;
			}else {
				System.out.println("Select valid seats");
			}
		}
		System.out.println("Booking Number "+uniqNo);
		System.out.println("Booking Amount "+num*PRICE);
		uniqNo++;
		return true;
	}

	public void displaySeats() {
		// TODO Auto-generated method stub
		System.out.print("  ");
		for (int i = 0 ; i< seats.length; i++) {
			String str = String.format("%8d", i+1);
			System.out.print(str);
		}
		System.out.println("");
		for (int i = 0 ; i< seats.length; i++) {
			System.out.print(i+" ");
			for (int j = 0 ; j <seats[i].length; j++) {
				String str = String.format("%8s",seats[i][j]);
				System.out.print(str);
			}
			System.out.println("");
		}
		System.out.println("");
	}	
}
