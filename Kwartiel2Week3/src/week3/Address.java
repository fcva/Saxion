package week3;

public class Address {
	private String street;
	private int housenumber;
	private int postal;
	private String residence;

	public Address(String streetName, int houseNumber, int postalCode, String residenceName) {
		street = streetName;
		housenumber = houseNumber;
		postal = postalCode;
		residence = residenceName;
	}
	
	/*
	 * Getter and setter for street
	 */
	
	public void setStreet(String streetName) {
		this.street = streetName;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	
	/*
	 * Getter and setter for housenumber
	 */
	
	public void setHouseNumber(int houseNumber) {
		this.housenumber = houseNumber;
	}
	
	public int getHouseNumber() {
		return this.housenumber;
	}
	
	
	/*
	 * Getter and setter for postal code
	 */
	
	public void setPostal(int postalCode) {
		this.postal = postalCode;
	}
	
	public int getPostal() {
		return this.postal;
	}
	
	
	/*
	 * Getter and setter for residence
	 */
	
	public void setResidence(String residenceName) {
		this.residence = residenceName;
	}
	
	public String getResidence() {
		return this.residence;
	}
	
	
	/*
	 * Methods
	 */
	
	public boolean comesBefore(Address anotherAddress) {
		if(this.getPostal() > anotherAddress.getPostal()) {
			return false;
		} else if(anotherAddress.getPostal() > this.getPostal()) {
			return true;
		} else {
			if(this.getHouseNumber() > anotherAddress.getHouseNumber()) {
				return false;
			} else {
				return true;
			}
		}
	}
}
