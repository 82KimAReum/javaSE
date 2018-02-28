
public class CityVO {
	private int id; 
	private String name;
	private String countrycode;
	private String district;
	private int population;
	public CityVO(int id, String name, String countrycode, String district, int population) {
		this.id = id;       	this.name = name;      this.countrycode = countrycode;
		this.district = district;      this.population = population;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public int getPopulation() {
		return population;
	}
}
