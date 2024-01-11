public abstract class Vehicle {
	
	DriveStrategy ds;
	
	public Vehicle(DriveStrategy drive) {
		
		this.ds= drive;
		
	}
	
	public void drive() {
		
		ds.drive();
		
	}
}
