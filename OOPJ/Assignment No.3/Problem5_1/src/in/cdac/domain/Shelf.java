package in.cdac.domain;

public class Shelf {
	private Item[] arr; 
		
	public Shelf() {
		this(10);
	}

	public Shelf(int size) {
		this.arr = new Item[size];
	}

	public void addItem(Item item,int indexNo) {
		// TODO Auto-generated method stub
		int index = indexNo-1;
		if(this.arr[index] == null) {
			this.arr[index] = item;
		}
		else
			System.out.println("Shelf is Full!");
			
	}
	
	public void removeItem(int indexNo) {
		int index = indexNo-1;
		if(this.arr[index] != null) {
			this.arr[index] = null;
		}
		else
			System.out.println("Shelf is Empty!");
		
	}
	
	public boolean shelfEmpty() {
		boolean flag=false;
		for(int index=0;index<this.arr.length;index++)
			if(this.arr[index] == null)
				flag=true;
		return flag;
	}
	
	public boolean shelfFull() {
		for(int index=0;index<this.arr.length;index++)
			if(this.arr[index] == null)
				return true;
		return false;
		}
	
	public void displayShelf() {
		if(shelfEmpty()==true) {
			for(int index=0;index<this.arr.length;index++) {
				if(arr[index]!=null) {
					System.out.print(index+1);
					System.out.println(arr[index].toString());
					}
				}		
		}
		else
			System.out.println("Shelf is Empty!!");
	}
}
		
