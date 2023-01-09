package factoryMethod;

public class VehicleFactory {
	public Vehicle makeVehicle(String type) {
		if(type.equals("car")) {
			return new Car();
		}else if(type.equals("bicycle")) {
			return new Bicycle();
		}else if(type.equals("bike")) {
			return new Bike();
		}else {
			return null;
		}
	}
}
