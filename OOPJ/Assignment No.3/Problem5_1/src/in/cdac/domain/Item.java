package in.cdac.domain;

public class Item {
	private String item;
	
	public Item() {
	}
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10s",this.item);
	}	
}