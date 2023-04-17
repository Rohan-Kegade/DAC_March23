package in.cdac.acts.menu;

public class Restaurant {
	
	private int index;
	private Dish[] arr;
	public Restaurant() {
		this(2);
	}
	
	public Restaurant(int dishes) {
		this.arr = new Dish[dishes];
	}
	
	public boolean isMenuFull() {
		boolean flag=true;
		for(index=0;index<this.arr.length;index++) {
			if(this.arr[index]==null) {
				flag=false;
				break;
			}	
		}
		return flag;
	}
	
	public boolean isMenuEmpty() {
		boolean flag=true;
		for(index=0;index<this.arr.length;index++) {
			if(this.arr[index]!=null) {
				flag=false;
				break;
			}	
		}
		return flag;
	}
	
	public void addDish(Dish dish) {	
		for(index=0;index<this.arr.length;index++) {
			if(this.arr[index]==null) {
				this.arr[index]=dish;
				break;
			}
		}
	}
	
	public void removeDish(int index) {
		this.arr[index-1]=null;	
	}
	
	public void modifyPrice(int index,float price) {
		this.arr[index-1].setPriceOfDish(price);
	}
	
	public void displayMenu() {
		int index=1;
		for(Dish dish:this.arr) {
			if(dish!=null) {
				System.out.print(index+".");
				System.out.println(dish);
			}
			index++;
		}
	}
	
}
