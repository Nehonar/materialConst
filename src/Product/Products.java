package Product;

public class Products {
	protected float  depth;
	protected float  height;
	protected String name;
	protected String type;
	protected int     uniqID;
	protected float  width;
	
	// Constructor
	public Products() {
		this.depth  = 0.0f;
		this.height = 0.0f;
		this.name   = "";
		this.type   = "";
		this.uniqID = 0;
		this.width  = 0.0f;
	}
	
	public Products(float depth, float height, String name, String type, int uniqID, float width) {
		this.depth  = depth;
		this.height = height;
		this.name   = name;
		this.type   = type;
		this.uniqID = uniqID;
		this.width  = width;
	}
	
	// Getters and setters
	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUniqID() {
		return uniqID;
	}

	public void setUniqID(int uniqID) {
		this.uniqID = uniqID;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	// Methods
	public String displayInfo() {
		return this.depth +"-"+ this.height +"-"+ this.name 
				+"-"+ this.type +"-"+ this.uniqID +"-"+ this.width;
	}
}
