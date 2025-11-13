import java.util.ArrayList;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person macron = new Person("Macron", "Emmanuel", 43, "Elysée à Paris", new City("Amiens", "France"));
		//Person poutine = new Person("Poutine", "Vladimir", 68);
		//Person biden = new Person("Biden", "Joe");
		Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person johnson = new Person("Johnson", "Boris", 56, "Downing Street London", new City("New York", "USA"));
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Habitant hotel particuler à Paris", new City("New York", "USA"));
		
		// 1.8 --------------------------------------------------
		//System.out.println(macron);
		//System.out.println(poutine);
		//System.out.println(biden);
		
		// 2 --------------------------------------------------

		ArrayList<Person> persons = new ArrayList<Person>();
		ArrayList<Person> frenchPersons = new ArrayList<Person>();
		
		persons.add(macron);
		persons.add(sarkozy);
		persons.add(johnson);
		persons.add(kravitz);
		
		
		System.out.println("Liste des personnalités : ");
		Person.displayPersons(persons);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Liste des français : ");
		frenchPersons = Person.addFrenchPersons(persons);
		Person.displayPersons(frenchPersons);

	}
}
