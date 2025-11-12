

class City{
	
	// Attributs
	private String cityName;
	private String cityCountry;
	private int cityNbResident;
	
	
	
	// 1.1 ------------------------------------------------------------------
	/*
	// Attributs
	public String cityName;
	public String cityCountry;
	public int cityNbResident;
	
	public City(String cityName, String cityCountry, int cityNbResident){
		this.cityName = cityName;
		this.cityCountry = cityCountry;
		this.cityNbResident = cityNbResident;
	}
	*/
	// fin 1.1 ------------------------------------------------------------------
	
	
	// 1.2 ------------------------------------------------------------------
	
	// Constructeur
	public City(String cityName, String cityCountry, int cityNbResident){
		setCityName(cityName);
		setCityCountry(cityCountry);
		setCityNbResident(cityNbResident);
	}

	// Accesseurs
	public String getCityName() {
		return this.cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityCountry() {
		return this.cityCountry;
	}
	
	public void setCityCountry(String cityCountry) {
		this.cityCountry = cityCountry;
	}
	
	public int getCityNbResident() {
		return this.cityNbResident;
	}
	
	// Je passe en private pour que l'utilisateur ne puisse pas modifier directement la valeur
	private void setCityNbResident(int cityNbResident) {
		if (cityNbResident < 0) {
			throw new RuntimeException("On ne peut mettre un nombre négatif d'habitants");
		}
		else {
			this.cityNbResident = cityNbResident;
		}
		
	}
	
	public void setSubtractNbResidents(int nbResidents) {
		this.cityNbResident -= nbResidents;
	}
	
	// fin 1.2 ------------------------------------------------------------------
	
	
	// 1.3 ------------------------------------------------------------------
	
	// Constante
	public static String CITY_COUNTRY = "unknomn";
	
	// Constructeur
	public City(String cityName, int cityNbResident){
		this(cityName, CITY_COUNTRY, cityNbResident);
	}
	
	// Méthode
	
	/*@Override
	public String toString() {
		return "[Ville : " + getCityName() + "]" +
				" [Pays : " + getCityCountry() + "]" + 
				" [Nombre d'habitants : " + getCityNbResident() + "]" + 
				"\n-----------------------------------------------------------------------------------------";
		
	}*/
	
	// fin 1.3 ------------------------------------------------------------------
	
	
	// 1.4 ------------------------------------------------------------------
	
	// Méthode
	public String display() {
		return "ville de " + getCityName() + 
				" en " + getCityCountry() + 
				" ayant " + getCityNbResident() + 
				" habitants.";
	}
	
	// fin 1.4 ------------------------------------------------------------------
	
	// 1.6 ------------------------------------------------------------------
	// Méthode
	@Override
	public String toString() {
		return "ville de " + cityName + 
				" en " + cityCountry + 
				" ayant " + cityNbResident + 
				" habitants.";
		}
	
	// fin 1.6 ------------------------------------------------------------------
}