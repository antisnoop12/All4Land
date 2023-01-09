package factoryMethod;

public class Vehicles {
	public static void main(String[] args) {
		VehicleFactory ve = new VehicleFactory();
		Vehicle car = ve.makeVehicle("car");
		Vehicle bicycle = ve.makeVehicle("bicycle");
		Vehicle bike = ve.makeVehicle("bike");
		
		car.callType();
		bicycle.callType();
		bike.callType();
	}
	
	
}
