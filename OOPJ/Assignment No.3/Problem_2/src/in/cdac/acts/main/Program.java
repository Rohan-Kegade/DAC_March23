package in.cdac.acts.main;

import java.util.Scanner;

import in.cdac.acts.menu.Restaurant;
import in.cdac.acts.menu.Dish;


public class Program {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(Dish dish) {
		System.out.print("Name of Dish	:	");
		sc.nextLine();
		dish.setNameOfDish( sc.nextLine());
		System.out.print("Price	:	");
		dish.setPriceOfDish(sc.nextFloat());
}
	
	public static int menuList() {
		System.out.println();
		System.out.println("0.Exit the program");
		System.out.println("1.View the current menu with prices");
		System.out.println("2.Add a new dish to the menu");
		System.out.println("3.Remove a dish from the menu");
		System.out.println("4.Modify the price of a dish on the menu");
		System.out.print("Enter Your Choice : ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		
		Restaurant restaurant = new Restaurant();
		while((choice = Program.menuList())!=0){
			switch(choice) {
			case 1:
				if(restaurant.isMenuEmpty()==false) {
				System.out.println("#Menu Card#");
				restaurant.displayMenu();
				}
				else
					System.out.println("Menu is Empty!!!");
				break;
			case 2:
				Dish dish = new Dish();
				if(restaurant.isMenuFull()==false) {
				Program.acceptRecord(dish);
				restaurant.addDish(dish);
				System.out.println("#Updated Menu Card#");
				restaurant.displayMenu();
				}
				else
					System.out.println("Menu is Full!!!");
				break;
			case 3:
				if(restaurant.isMenuEmpty()==false) {
				System.out.println("#Menu Card#");
				restaurant.displayMenu();	
				System.out.print("Enter dish number you want to remove : ");
				restaurant.removeDish(sc.nextInt());
				System.out.println("#Updated Menu Card#");
				restaurant.displayMenu();
				}
				else
					System.out.println("Menu is Empty!!!");
				break;
			case 4:
				if(restaurant.isMenuEmpty()==false) {
				System.out.print("Enter dish number you want to modify price : ");
				int index=sc.nextInt();
				System.out.print("Enter new price : ");
				float price=sc.nextFloat();
				restaurant.modifyPrice(index,price);
				System.out.println("#Updated Menu Card#");
				restaurant.displayMenu();
				}
				else
					System.out.println("Menu is Empty!!!");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}	
		System.out.println("Thank You!!!");
	}
}
