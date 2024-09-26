package Ex4_constuructor;

public class Pen {
	private String company;
	private int price = 500;
	private String color = "black";

	public Pen() {
		company = "badunson";
		price = 500;
		color = "black";

	}

	public Pen(String color) {
		this.color = color;
	}

	public Pen(int price, String color) {
		company = "monami";
		this.price = price;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

}
