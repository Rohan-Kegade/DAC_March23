package in.cdac.main;

import java.util.Scanner;

import in.cdac.domain.Item;
import in.cdac.domain.Shelf;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	private static int acceptRecord(Item item) {
		// TODO Auto-generated method stub
		System.out.print("Name of Item	:	");
		sc.nextLine();
		item.setItem( sc.nextLine());
		System.out.print("Shelf No	:	");
		int index=sc.nextInt();
		return index;
	}
	
	public static int menuList(){
		System.out.println("Welcome to the Warehouse Inventory Management System!");
		System.out.println("1. Add Item to shelf");
		System.out.println("2. Remove item from shelf");
		System.out.println("3. Display contents of shelf");
		System.out.println("4. Exit");
		System.out.print("Enter Your Choice	:");
		return sc.nextInt();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shelf shelf = new Shelf();
		int choice;
		while ((choice = menuList())!= 4) {
			switch (choice) {
			case 1:
				Item item = new Item();
				int index = Program.acceptRecord(item);
				shelf.addItem(item,index);
				break;
			case 2:
				System.out.println("Enter Shelf No of Item to be removed :");
				shelf.removeItem(sc.nextInt());
				break;
			case 3:
				shelf.displayShelf();
				break;
			default:
				System.out.println("Enter valid input");
				break;
			
			}
		}
	}
	
}

