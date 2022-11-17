package Company;

import Building.Building;
import Product.Products;
import Vehicle.Vehicle;

public class Company {
	// Vehicles
	protected Vehicle vehicle1;
	protected Vehicle vehicle2;
	
	// Buildings
	protected Building building1;
	protected Building building2;
	protected Building building3;
	
	// Products
	protected Products product1;
	protected Products product2;
	protected Products product3;
	protected Products product4;
	
	// Constructor
	public Company() {
		this.vehicle1 = null;
		this.vehicle2 = null;
		
		this.building1 = null;
		this.building2 = null;
		this.building3 = null;
		
		this.product1 = null;
		this.product2 = null;
		this.product3 = null;
		this.product4 = null;
	}

	// Getters and setters
	public Vehicle getVehicle1() {
		return vehicle1;
	}

	public void setVehicle1(Vehicle vehicle1) {
		this.vehicle1 = vehicle1;
	}

	public Vehicle getVehicle2() {
		return vehicle2;
	}

	public void setVehicle2(Vehicle vehicle2) {
		this.vehicle2 = vehicle2;
	}

	public Building getBuilding1() {
		return building1;
	}

	public void setBuilding1(Building building1) {
		this.building1 = building1;
	}

	public Building getBuilding2() {
		return building2;
	}

	public void setBuilding2(Building building2) {
		this.building2 = building2;
	}

	public Building getBuilding3() {
		return building3;
	}

	public void setBuilding3(Building building3) {
		this.building3 = building3;
	}

	public Products getProduct1() {
		return product1;
	}

	public void setProduct1(Products product1) {
		this.product1 = product1;
	}

	public Products getProduct2() {
		return product2;
	}

	public void setProduct2(Products product2) {
		this.product2 = product2;
	}

	public Products getProduct3() {
		return product3;
	}

	public void setProduct3(Products product3) {
		this.product3 = product3;
	}

	public Products getProduct4() {
		return product4;
	}

	public void setProduct4(Products product4) {
		this.product4 = product4;
	}
	
	// Methods
	public String displayInfo() {
		// TODO if someone is null, the code explode
		return this.vehicle1.displayInfo() +"-"+ this.vehicle2.displayInfo() 
		+"-"+ this.building1.displayInfo() +"-"+ this.building2.displayInfo() 
		+"-"+ this.building3.displayInfo() +"-"+ this.product1.displayInfo() 
		+"-"+ this.product2.displayInfo() +"-"+ this.product3.displayInfo()
		+"-"+ this.product4.displayInfo();
	}
}
