package Vehicle;
public class Gasoline extends Vehicle{
	protected String contamination;
	protected float  depositSize;
	
	// Constructor
	public Gasoline() {
		this.contamination = "";
		this.depositSize   = 0.0f;
	}
	
	public Gasoline(String brand, String color, float length, float price, float weight, String contamination, float depositSize) {
		this.brand         = brand;
		this.depositSize   = depositSize;
		this.contamination = contamination;
		this.color         = color;
		this.length        = length;
		this.price         = price;
		this.weight        = weight;
	}

	
	// Getters and setters
	public String getContamination() {
		return contamination;
	}

	public void setContamination(String contamination) {
		this.contamination = contamination;
	}

	public float getDepositSize() {
		return depositSize;
	}

	public void setDepositSize(float depositSize) {
		this.depositSize = depositSize;
	}
	
	// Methods
	@Override
	public String displayInfo() {
		return this.brand +"-"+ this.color +"-"+ this.length +"-"+ this.price 
				+"-"+ this.weight +"-"+ this.contamination +"-"+ this.depositSize;
	}
}
