package week3;

public class Car {
	private int fuelEfficiency;
	private int fuelLeft;

	public Car(int milesPerGallon) {
		fuelEfficiency = milesPerGallon;
		fuelLeft = 0;
	}
	
	public void setFuelEfficiency(int milesPerGallon) {
		this.fuelEfficiency = milesPerGallon;
	}
	
	public int getFuelEfficiency() {
		return this.fuelEfficiency;
	}
	
	public void addGas(int amount) {
		this.fuelLeft = this.fuelLeft + amount;
	}
	
	public int getGasLevel() {
		return this.fuelLeft;
	}
	
	public void drive(int miles) {
		int usage = miles / this.fuelEfficiency;
		fuelLeft = fuelLeft - usage;
	}
}
