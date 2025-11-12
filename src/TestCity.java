
public class TestCity {

	public static void main(String[] args) {
		City toulouse = new City("Toulouse", "France", 450000);
		City merignac = new City("Mérignac", "France", 34000);
		City stGeours = new City("Saint-Geours-de-Maremne", "France", 15000);
		City rabat = new City("Rabat", 73500);
		
		// 1.1 --------------------------------------------------
		System.out.println(toulouse);
		System.out.println(merignac);
		System.out.println(stGeours);
		
		
		/*toulouse.cityNbResident += 2000;
		toulouse.setCityNbResident(toulouse.cityNbResident);
		System.out.println(toulouse);
		*/
		
		// 1.2 --------------------------------------------------
		/*toulouse.cityNbResident = - 200;
		toulouse.setCityNbResident(toulouse.cityNbResident);
		System.out.println(toulouse);
		// je passe l'accesseur setCityNbResident en private

		toulouse.setSubtractNbResidents(200);
		System.out.println(toulouse);
		 */
		
		// 1.3 --------------------------------------------------
		System.out.println(rabat);
		rabat.setCityCountry("Maroc");
		System.out.println(rabat);
		
		// 1.4 --------------------------------------------------
		System.out.println(toulouse.display());
		
		// 1.5 ------------------------------------------------------------------
		// si je ne précise pas toulouse.display() alors j'aurai la méthode toString qui prendra en charge l'affichage
		
	}
	
}
