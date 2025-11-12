
public class TestPerson {
	
	public static void main(String[] args) {
		Person macron = new Person("Macron", "Emmanuel", 43, "Elysée à Paris", new City("Amiens", "France", 2000));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");
		
		
		// 1.8 --------------------------------------------------
		System.out.println(macron);
		System.out.println(poutine);
		System.out.println(biden);
	}
}
