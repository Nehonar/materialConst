package Building;

public abstract class Building {
	protected float  depth;
	protected String functionality;
	protected float  height;
	protected String type;
	protected float  width;
	
	// Constructors
	public Building() {
		this.depth         = 0.0f;
		this.functionality = "";
		this.height 	   = 0.0f;
		this.type 		   = "";
		this.width 		   = 0.0f;
	}
	
	public Building(float depth, String functionality, float height, String type, float width) {
		this.depth         = depth;
		this.functionality = functionality;
		this.height 	   = height;
		this.type 		   = type;
		this.width 		   = width;
	}
	
	// Getters and setters
	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	// Methods
	public float paintCost(float costPerMeter) {
		if (costPerMeter < 0) {
			return -1.0f;
		}
		return costPerMeter * this.height * this.width * this.depth;
	}
	
	// Overloading paintCost
	public float paintCost(String sideToPaint, float costPerMeter) {
		if (costPerMeter < 0) {
			return -1.0f;
		}
		else if (sideToPaint == "ladoanchura") {
			return costPerMeter * this.width * this.height;
		}
		else if (sideToPaint == "ladoprofundidad") {
			return costPerMeter * this.height * this.depth;
		}
		return -1.0f;
	}
	
	public String displayInfo() {
		return this.depth +"-"+ this.functionality +"-"+ this.height +"-"+ this.type +"-"+ this.width;
	}
	
	// Abstracted methods
	protected abstract String buildingFunctionality();
}
