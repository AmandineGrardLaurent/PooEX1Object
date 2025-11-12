

class City{
	
	// Attributs
	private String cityName;
	private String cityCountry;
	private int cityNbResident;
	
	
	
	
	/*
	// 1.1 ------------------------------------------------------------------
	
	// Attributs
	public String cityName;
	public String cityCountry;
	public int cityNbResident;
	
	public City(String cityName, String cityCountry, int cityNbResident){
		this.cityName = cityName;
		this.cityCountry = cityCountry;
		this.cityNbResident = cityNbResident;
	}*/
	
	
	// 1.2 ------------------------------------------------------------------
	
	// Constructeurs
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
	
	public int getcityNbResident() {
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
	
	// Méthodes
	public String toString() {
		return "Nom : " + getCityName() +
				"\nPays : " + getCityCountry() + 
				"\nNombre d'habitants : " + getcityNbResident() + 
				"\n------------------------------------";
		
	}
	
}