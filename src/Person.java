
public class Person {
	// Attributs
	private String lastName;
	private String firstName;
	private int years;
	private String address;
	// 1.9 --------------------------------------------------
	private City hometown;
	
	
	// Constantes
	public static final int YEARS = 0;
	public static final String ADDRESS = "unknown";
	// 1.9 --------------------------------------------------
	public static final City HOMETOWN = new City ("unknown", "unknown", 0);
	
	
	// Constructeur
	public Person(String lastName, String firstName, int years, String address, City hometown){
		setLastName(lastName);
		setFirstName(firstName);
		setYears(years);
		setAdress(address);
		// 1.9 --------------------------------------------------
		this.hometown = hometown;
	}

	public Person(String lastName, String firstName, int years){
		this(lastName, firstName, years, ADDRESS, HOMETOWN);
	}
	
	public Person(String lastName, String firstName){
		this(lastName, firstName, YEARS, ADDRESS, HOMETOWN);
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
	
	public String getAdress() {
		return this.address;
	}
	
	public void setAdress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person " + "[lastName : " + getLastName() + 
				", firstName : " + getFirstName() +
				", age : " + getYears() + 
				", adresse : " + getAdress() + "]" + 
				// 1.9 --------------------------------------------------
				" Hometown " + ((hometown == HOMETOWN) ? " -> null" : hometown  )
				;
	}
	
}
