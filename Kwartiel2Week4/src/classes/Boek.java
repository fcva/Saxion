package classes;

public class Boek {
	
	private String tietel;
	private int paginas;
	private Auteur auteur;
	
	public Boek(String titel, int Paginas, Auteur auteurA) {
		this.tietel = titel;
		this.paginas = Paginas;
		this.auteur = auteurA;
	}

	public String getTietel() {
		return tietel;
	}

	public void setTietel(String tietel) {
		this.tietel = tietel;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
}
