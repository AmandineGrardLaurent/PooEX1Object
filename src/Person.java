import java.util.ArrayList;

public class Person {
	// Attributs
	private String lastName;
	private String firstName;
	private int years;
	private String address;
	// 1.9 --------------------------------------------------
	private City hometown;
	
	
	// Constantes
	public static final int DEFAULT_YEARS = 0;
	public static final String DEFAULT_ADDRESS = "unknown";
	// 1.9 --------------------------------------------------
	public static final City DEFAULT_HOMETOWN = new City ("unknown", "unknown", 0);
	
	
	// Constructeurs
	public Person(String lastName, String firstName, int years, String address, City hometown){
		setLastName(lastName);
		setFirstName(firstName);
		setYears(years);
		setAddress(address);
		// 1.9 --------------------------------------------------
		this.hometown = hometown;
	}

	public Person(String lastName, String firstName, int years){
		this(lastName, firstName, years, DEFAULT_ADDRESS, DEFAULT_HOMETOWN);
	}
	
	public Person(String lastName, String firstName){
		this(lastName, firstName, DEFAULT_YEARS, DEFAULT_ADDRESS, DEFAULT_HOMETOWN);
	}

	
	// Accesseurs
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getYears() {
		return this.years;
	}
	
	public void setYears(int years) {
		if (years < 0) {
			throw new RuntimeException("Merci de saisir un age valide.");
		}
		else {
			this.years = years;
		}
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	

	public String toString() {
		/*return "Person " + "[lastName : " + getLastName() + 
				", firstName : " + getFirstName() +
				", age : " + getYears() + 
				", adresse : " + getAddress() + "]" + 
				// 1.9 --------------------------------------------------
				" Hometown " + ((hometown == DEFAULT_HOMETOWN) ? " -> null" : hometown  )*/
				
		// 2 --------------------------------------------------
		return lastName + ", " 
				+ firstName + ", " 
				+ years + "ans, " 
				+ "habitant " + address + ", " 
				+ ((hometown == DEFAULT_HOMETOWN) ? "" : 
					"Ville de naissance : " + this.hometown);
	}
	
	
	// 2 --------------------------------------------------
	/**
	 * Filtre pour ne garder que les personnes originaires de France ou habitant Paris
	 * @param persons : la liste de toutes les personnes
	 * @return : la liste filtrée
	 */
	public static ArrayList<Person> addFrenchPersons(ArrayList<Person> persons) {
		ArrayList<Person> frenchPersons = new ArrayList<>();

		for (Person index : persons) {
			if (index.getAddress().contains("Paris") || index.hometown.getCityCountry().equals("France")) {
				frenchPersons.add(index);
			}
		}
		return frenchPersons;
	}
	
	/**
	 * Affiche les personnes à partir d'une arraylist
	 * @param persons : la liste de toutes les personnes
	 */
	public static void displayPersons(ArrayList<Person> persons) {
		for (Person index : persons) {
			System.out.println(index);
		}
	}
}
