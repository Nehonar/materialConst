package Vehicle;

public abstract class Vehicle {
	protected String brand;
	protected String color;
	protected float  length;
	protected float  price;
	protected float  weight;
	
	// Constructor
	public Vehicle() {
		this.brand  = "";
		this.color  = "";
		this.length = 0.0f;
		this.price  = 0.0f;
		this.weight = 0.0f;
	}
	
	public Vehicle(String brand, String color, float length, float price, float weight) {
		this.brand  = brand;
		this.color  = color;
		this.length = length;
		this.price  = price;
		this.weight = weight;
	}
	
	// Getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	// Methods
	public String displayInfo() {
		return this.brand +"-"+ this.color +"-"+ this.length +"-"+ this.price +"-"+ this.weight;
	}
}
