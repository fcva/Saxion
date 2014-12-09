package classes;

public class Lamp {
	private int status;
	
	/**
	 * Constructor
	 */
	public Lamp() {
		this.status = 0; //Off
	}
	
	/**
	 * Turn on the lamp
	 */
	public void zetAan() {
		this.status = 1;
	}
	
	/**
	 * Turn off the lamp
	 */
	
	public void zetUit() {
		this.status = 0;
	}
	
	/**
	 * Return the state of the lamp.
	 */
	public String toString() {
		if(this.status == 0) {
			return "uit";
		} else {
			return "aan";
		}
	}
}
