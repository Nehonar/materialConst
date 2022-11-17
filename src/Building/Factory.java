package Building;
public class Factory extends Building{
	// Constructor
	public Factory() {
		this.functionality = "Lugar donde se crean los productos";
		this.type 		   = "Fabrica";
	}
	
	public Factory(float depth, float height, float width) {
		this.depth         = depth;
		this.height 	   = height;
		this.width 		   = width;
	}
	
	// Methods
	public String buildingFunctionality() {
		return this.functionality;
	}
	
	@Override
	public String displayInfo() {
		return this.depth +"-"+ this.functionality +"-"+ this.height +"-"+ this.type +"-"+ this.width;
	}
}
