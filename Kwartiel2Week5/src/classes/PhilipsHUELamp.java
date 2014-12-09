package classes;

public class PhilipsHUELamp {
	private int status;
	private int helderheid;
	private int[] kleur;

	public PhilipsHUELamp() {
		this.status = 0;
		this.helderheid = 0;
		this.kleur = new int[3];
		this.kleur[0] = 0;
		this.kleur[1] = 0;
		this.kleur[2] = 0;
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
	 * 
	 * @param helderheid
	 *            Brightness level
	 */
	public void setHelderheid(int helderheid) {
		this.helderheid = helderheid;
	}

	/**
	 * Set the color of the virtual lamp
	 * 
	 * @param R
	 *            Decimal value of Red
	 * @param G
	 *            Decimal value of Green
	 * @param B
	 *            Decimal value of Blue
	 */
	public void setKleur(int R, int G, int B) {
		this.kleur[0] = R;
		this.kleur[1] = G;
		this.kleur[2] = B;
	}

	/**
	 * Return the state, brightness and color of the lamp.
	 */
	public String toString() {
		String resp = "";
		if (this.status == 0) {
			resp += "uit";
		} else {
			resp += "aan, met " + this.helderheid + " helderheid ";
			resp += "en hexadecimale kleur #" + toHex(this.kleur[0])
					+ toHex(this.kleur[1]) + toHex(this.kleur[2]) + " ("
					+ kleurVanIntArray(this.kleur) + ")";
		}

		return resp;
	}

	private String kleurVanIntArray(int[] color) {
		if (color[0] == 0 && color[1] == 0 && color[2] == 0) {
			return "zwart";
		} else if (color[0] == 255 && color[1] == 255 && color[2] == 255) {
			return "wit";
		} else if (color[0] > color[1] && color[0] > color[2]) {
			return "rood";
		} else if (color[1] > color[0] && color[1] > color[2]) {
			return "groen";
		} else if (color[2] > color[0] && color[2] > color[1]) {
			return "blauw";
		} else {
			return "mix van kleuren";
		}
	}

	private String toHex(int color) {
		String resp = "";
		resp = Integer.toHexString(color);
		if (resp.length() == 1) {
			resp = "0" + resp;
		}

		resp = resp.toUpperCase();

		return resp;
	}
}
