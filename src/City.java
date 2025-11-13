class City{
	
	// Attributs
	private String cityName;
	private String cityCountry;
	private int cityPopulation;
	public static int counterInstance = 0;
	
	// 1.7 ------------------------------------------------------------------
	//public static ArrayList<City> cities = new ArrayList<City>();
	
	// 1.1 ------------------------------------------------------------------
	/*
	// Attributs
	public String cityName;
	public String cityCountry;
	public int cityPopulation;
	
	public City(String cityName, String cityCountry, int cityPopulation){
		this.cityName = cityName;
		this.cityCountry = cityCountry;
		this.cityPopulation = cityPopulation;
	}
	*/
	// fin 1.1 ------------------------------------------------------------------
	
	
	// 1.2 ------------------------------------------------------------------
	
	// Constructeur
	public City(String cityName, String cityCountry, int cityPopulation){
		setCityName(cityName);
		setCityCountry(cityCountry);
		setCityPopulation(cityPopulation);
		
		counterInstance ++;
		
		// 1.7 ------------------------------------------------------------------
		//cities.add(this);
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
	
	public int getCityPopulation() {
		return this.cityPopulation;
	}
	
	// Je passe en private pour que l'utilisateur ne puisse pas modifier directement la valeur
	private void setCityPopulation(int cityPopulation) {
		if (cityPopulation < 0) {
			throw new RuntimeException("On ne peut mettre un nombre négatif d'habitants");
		}
		else {
			this.cityPopulation = cityPopulation;
		}
	}
	
	public void setSubtractPopulation(int nbPopulation) {
		if (nbPopulation < this.cityPopulation) {
			throw new RuntimeException("Le chiffre dépasse le nombre d'habitants de la ville.");
		}
		else {
			this.cityPopulation -= nbPopulation;
		}
	}
	
	// fin 1.2 ------------------------------------------------------------------
	
	
	// 1.3 ------------------------------------------------------------------
	
	// Constantes
	public static String CITY_COUNTRY = "unknomn";
	public static int CITY_NB_POPULATION = 0;
	
	// Constructeurs
	public City(String cityName, int cityPopulation){
		this(cityName, CITY_COUNTRY, cityPopulation);
	}
	
	public City(String cityName, String cityCountry){
		this(cityName, cityCountry, CITY_NB_POPULATION);
	}
	
	// Méthode
	public String toString() {
		return "[Ville : " + getCityName() +
				", Pays : " + getCityCountry() + 
				", Nombre d'habitants : " + getCityPopulation() + "]" ;
	}
	
	// fin 1.3 ------------------------------------------------------------------
	
	
	// 1.4 ------------------------------------------------------------------
	
	// Méthode
	public String display() {
		return "ville de " + getCityName() + 
				" en " + getCityCountry() + 
				" ayant " + getCityPopulation() + 
				" habitants.";
	}
	
	// fin 1.4 ------------------------------------------------------------------
	
	
	// 1.6 ------------------------------------------------------------------
	// Méthode
	/*@Override
	public String toString() {
		return "ville de "  + cityName + 
				" en " + cityCountry + 
				" ayant " + cityPopulation + 
				" habitants.";
		}
	*/
	
	// fin 1.6 ------------------------------------------------------------------

}
