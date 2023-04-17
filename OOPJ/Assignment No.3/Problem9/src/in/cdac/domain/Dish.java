package in.cdac.domain;

public enum Dish {
	CHICKEN_TIKKA("CHICKEN_TIKKA",250.0f),
	FRIED_RICE("FRIED_RICE",150.0f),
	LOLIPOP("LOLIPOP",100.0f),
	BIRYANI("BIRYANI",250.0f);
	
	private String name;
	private float price;
	
	private Dish(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-25s%-10.2f",this.name,this.price);
	}
	
	
}
