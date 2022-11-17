package Start;

import Building.Factory;
import Building.Office;
import Building.Warehouse;
import Company.Company;
import Product.Chair;
import Product.Door;
import Vehicle.Diesel;
import Vehicle.Electric;

public class Start {

	public static void main(String[] args) {
		// Create Company OO
		Company empresaOO = new Company();
		
		/*
		 * Set vehicles to companyOO
		 * 
		 * String brand
		 * String color
		 * float  length
		 * float  price
		 * float  weight
		 * 
		 * * Add to Gasoline
		 * String contamination
		 * float  depositSize
		 * 
		 * * Add to Electrics
		 * float power
		 */
		Electric electricVehicle = new Electric("Seat Altea", "Rojo", 3, 20000, 3000, 4000);
		
		Diesel dieselVehicle = new Diesel("Renault Kadjar", "Azul", 3.5f, 28000, 4000);
		
		// Set buildings to companyOO
		Factory factoryBuilding = new Factory();
		factoryBuilding.setWidth(400);
		factoryBuilding.setHeight(400);
		factoryBuilding.setDepth(500);
		
		Office officeBuilding = new Office();
		officeBuilding.setWidth(600);
		officeBuilding.setHeight(400);
		officeBuilding.setDepth(700);
		
		Warehouse warehouseBuilding = new Warehouse();
		warehouseBuilding.setWidth(600);
		warehouseBuilding.setHeight(400);
		warehouseBuilding.setDepth(700);
		
		/* 
		 * Set products to company:
		 * 
		 * float depth, 
		 * float height, 
		 * String name, 
		 * String type, 
		 * int uniqID, 
		 * float width
		 */
		Chair chairN20 = new Chair(1.5f, 0.5f, "Silla N20", "Silla", 1, 1);
		
		Chair chairM100 = new Chair(1.5f, 0.5f, "Silla M100", "Silla", 2, 1.5f);
		
		Door doorP9 = new Door(0.25f, 2.25f, "Puerta P9", "Puerta", 3, 1.5f);
		
		Door doorF50 = new Door(0.25f, 1.25f, "Puerta F50", "Puerta", 4, 1.25f);
		
		// Set vehicles, buildings and products in companyOO
		empresaOO.setVehicle1(electricVehicle);
		empresaOO.setVehicle2(dieselVehicle);
		
		empresaOO.setBuilding1(factoryBuilding);
		empresaOO.setBuilding2(officeBuilding);
		empresaOO.setBuilding3(warehouseBuilding);
		
		empresaOO.setProduct1(chairN20);
		empresaOO.setProduct2(chairM100);
		empresaOO.setProduct3(doorP9);
		empresaOO.setProduct4(doorF50);
		
		// Calculate how much paint all buildings
		System.out.println("Pintar la fabrica costaria "+warehouseBuilding.paintCost(30)+" euros.");
		
		System.out.println(empresaOO.displayInfo());
	}
}
