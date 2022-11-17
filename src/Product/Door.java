package Product;
public class Door extends Products{
	// Constructor
	public Door() {
		this.depth  = 0.0f;
		this.height = 0.0f;
		this.name   = "";
		this.type   = "";
		this.uniqID = 0;
		this.width  = 0.0f;
	}
	
	public Door(float depth, float height, String name, String type, int uniqID, float width) {
		this.depth  = depth;
		this.height = height;
		this.name   = name;
		this.type   = type;
		this.uniqID = uniqID;
		this.width  = width;
	}
	
	// Methods
	@Override
	public String displayInfo() {
		return this.depth +"-"+ this.height +"-"+ this.name 
				+"-"+ this.type +"-"+ this.uniqID +"-"+ this.width;
	}
}
