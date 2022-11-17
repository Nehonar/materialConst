package Vehicle;
public class Diesel extends Vehicle{
	// Constructor
	public Diesel(String brand, String color, float length, float price, float weight) {
		this.brand  = brand;
		this.color  = color;
		this.length = length;
		this.price  = price;
		this.weight = weight;
	}
	// Methods
	@Override
	public String displayInfo() {
		return this.brand +"-"+ this.color +"-"+ this.length +"-"+ this.price 
				+"-"+ this.weight;
	}
}
