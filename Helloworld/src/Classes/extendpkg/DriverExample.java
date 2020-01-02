package Classes.extendpkg;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver =  new Driver();
		Vehicle vehicle = new Vehicle();
		
		vehicle = new Bus();
		vehicle = new Truck();
		
		driver.driver(vehicle); //동일한 값이지만 어떤 할당량에 따라 나옴 . 매개변수의 다향성.
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		driver.driver(bus);
		driver.driver(truck);
}
}