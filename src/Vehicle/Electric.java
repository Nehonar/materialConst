package Vehicle;
public class Electric extends Vehicle{
	protected float power;
	
	// Constructor
	public Electric() {
		this.power = 0.0f;
	}
	
	public Electric(String brand, String color, float length, float price, float weight, float power) {
		this.brand  = brand;
		this.color  = color;
		this.length = length;
		this.power  = power;
		this.price  = price;
		this.weight = weight;
	}
	
	// Getters and setters
	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}
	
	// Methods
	@Override
	public String displayInfo() {
		return this.brand +"-"+ this.color +"-"+ this.length +"-"+ this.price 
				+"-"+ this.weight +"-"+ this.power;
	}
}
