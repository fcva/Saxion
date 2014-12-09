package classes;

public class Country {
	
	private String name;
	private int population, area;
	
	public Country(String Name, int Population, int Area) {
		this.name = Name;
		this.population = Population;
		this.area = Area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
