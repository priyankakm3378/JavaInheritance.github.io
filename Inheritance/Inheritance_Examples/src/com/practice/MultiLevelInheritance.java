package com.practice;

class Plane {
	public void fly() {
		System.out.println("Plane flies");
	}
	
	public void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {
	public void carryCargo() {
		System.out.println("CargoPlane carries cargo");
	}
}

class PassengerPlane extends Plane {
	public void carryPassenger() {
		System.out.println("Passenger plane carries passenger");
	}
}

class FighterPlane extends Plane{
	public void carryWeapons() {
		System.out.println("Fighter plane carries weapons");
	}
}



public class MultiLevelInheritance {

	public static void main(String[] args) {
		CargoPlane cargoPlane = new CargoPlane();
		PassengerPlane passengerPlane = new PassengerPlane();
		FighterPlane fighterPlane = new FighterPlane();
		
		cargoPlane.fly();
		cargoPlane.carryCargo();
		cargoPlane.land();
		
		System.out.println("==========================");
		
		passengerPlane.fly();
		passengerPlane.carryPassenger();
		passengerPlane.land();
		
		System.out.println("==========================");
		
		fighterPlane.fly();
		fighterPlane.carryWeapons();
		fighterPlane.land();
		
		System.out.println("===============================");
		
	}

}
