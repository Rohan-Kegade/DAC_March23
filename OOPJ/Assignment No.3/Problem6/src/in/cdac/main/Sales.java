package in.cdac.main;

import java.util.Scanner;

public class Sales {
	private SalesPerson [] salesPersons = new SalesPerson[10];
	private static Scanner sc = new Scanner(System.in);
	
	Sales(){
		// TODO
	}
			
	public void viewCompanySales() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null) {
				System.out.println("Total Sales for employee " + salesPersons[i].getId() + " " + salesPersons[i].totalSales());
			}
		}
	}

	public boolean viewTotalSales() {
		// TODO Auto-generated method stub
		System.out.println("Enter the employee id");
		int id = sc.nextInt();
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == id) {
				System.out.println("Total Sales are " +  salesPersons[i].totalSales());
				return true;
			}
		}
		System.out.println("Employee Not found");
		return false;
	}

	public boolean updateSales() {
		// TODO Auto-generated method stub
		System.out.println("Employee id");
		int id = sc.nextInt();
		System.out.println("Enter the sales figures of the last 12 months");
		float arr[] =  new float[12];
		
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == id) {
				for (int j = 0 ; j < 12 ; j++) {
					System.out.println("Enter the sales figure for month "+(i+1));
					arr[i] = sc.nextFloat();
				}
				salesPersons[i].setSalesFig(arr);
				return true;
			}
		}
		System.out.println("Employee Not Found!");
		return false;
	}
		

	public boolean addSalesPerson() {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println("Enter the name of the person");
		String name = sc.nextLine();
		System.out.println("Enter unique ID :");
		int uId =  sc.nextInt();
		
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == uId) {
				System.out.println("Employee ID Already Exists!!");
				return false;
			}
		}
		
		System.out.println("Enter the sales figures of the last 12 months");
		float arr[] =  new float[12];
		for (int i = 0 ; i < 12 ; i++) {
			System.out.println("Enter the sales figure for month "+(i+1));
			arr[i] = sc.nextFloat();
		}
		
		
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] == null) {
				salesPersons[i] = new SalesPerson(name, uId, arr);
				return true;
			}
		}
		System.out.println("Data Base Full");
		return false;
		
	}

	
	
	
}
