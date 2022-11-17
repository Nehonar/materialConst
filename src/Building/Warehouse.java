package Building;
public class Warehouse extends Building{
	// Constructor
	public Warehouse() {
		this.functionality = "Lugar donde se almacenan los productos";
		this.type 		   = "Almacén";
	}
	
	public Warehouse(float depth, float height, float width) {
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
