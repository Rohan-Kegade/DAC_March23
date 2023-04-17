package in.cdac.main;

import java.util.Scanner;
public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("1. Addition of two matrices");
		System.out.println("2. Subtraction of two matrices");
		System.out.println("3. Multiplication of two matrices");
		System.out.println("4. Transpose of a matrix");
		System.out.println("5. EXIT");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixTest mt = new MatrixTest();
			int choice;
			while (( choice = menu() ) != 5) {
				switch (choice) {
				case 1:
					mt.add();
					break;
				case 2:
					mt.subtract();
					break;
				case 3:
					mt.multiplication();
					break;
				case 4:
					mt.transpose();
					break;
				default:
					System.out.println("Enter Valid input");
				}
			}
		}
	}
