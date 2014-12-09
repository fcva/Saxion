package classes;

public class DimbareLamp {
	private int status;
	private int helderheid;

	public DimbareLamp() {
		this.status = 0;
		this.helderheid = 0;
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
	 * Set the brightness of the virtual lamp
	 * @param helderheid Brightness level
	 */
	public void setHelderheid(int helderheid) {
		this.helderheid = helderheid;
	}
	
	/**
	 * Return the state and brightness of the lamp.
	 */
	public String toString() {
		String resp = "";
		if(this.status == 0) {
			resp += "uit";
		} else {
			resp += "aan, met helderheid " + this.helderheid;
		}
		
		return resp;
	}
}
