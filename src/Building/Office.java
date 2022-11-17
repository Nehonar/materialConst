package Building;
public class Office extends Building{
	// Constructor
	public Office() {
		this.functionality = "Lugar donde se gestionan los productos";
		this.type 		   = "Oficina";
	}
	
	public Office(float depth, float height, float width) {
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
