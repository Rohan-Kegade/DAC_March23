package in.cdac.acts.menu;

public class Dish {
	private String nameOfDish;
	private float priceOfDish;
	
	public Dish() {
	}
	
	public Dish(String nameOfDish, float priceOfDish) {
		this.nameOfDish = nameOfDish;
		this.priceOfDish = priceOfDish;
	}
	public String getNameOfDish() {
		return nameOfDish;
	}
	public void setNameOfDish(String nameOfDish) {
		this.nameOfDish = nameOfDish;
	}
	public float getPriceOfDish() {
		return priceOfDish;
	}
	public void setPriceOfDish(float priceOfDish) {
		this.priceOfDish = priceOfDish;
	}
	public String toString() {
		return String.format("%-15s%-10.2f", this.nameOfDish, this.priceOfDish);
	}
}
