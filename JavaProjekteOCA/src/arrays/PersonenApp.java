package arrays;

import java.util.Objects;

class Person {
	private String vorname;
	private String nachname;
	private int geburtsjahr;
	private String postleitzahl;

	public Person(String vorname, String nachname, int geburtsjahr, String postleitzahl) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
		this.postleitzahl = postleitzahl;
	}

	public Person(String vorname, String nachname) {
		this(vorname, nachname, 0, "Nicht angegeben");
	}

	@Override
	public String toString() {
		return vorname + " " + nachname + ", Geburtsjahr: " + geburtsjahr + ", Plz: " + postleitzahl;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return geburtsjahr == person.geburtsjahr && Objects.equals(vorname, person.vorname)
				&& Objects.equals(nachname, person.nachname) && Objects.equals(postleitzahl, person.postleitzahl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vorname, nachname, geburtsjahr, postleitzahl);
	}

	public static Person getMustermann() {
		return new Person("Max", "Mustermann", 1960, "12345");
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public String getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
}

class PersonBuilder {
	private String vorname;
	private String nachname;
	private int geburtsjahr;
	private String postleitzahl;

	public PersonBuilder vorname(String vorname) {
		this.vorname = vorname;
		return this;
	}

	public PersonBuilder nachname(String nachname) {
		this.nachname = nachname;
		return this;
	}

	public PersonBuilder geburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
		return this;
	}

	public PersonBuilder postleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
		return this;
	}

	public Person build() {
		return new Person(vorname, nachname, geburtsjahr, postleitzahl);
	}
}

public class PersonenApp {
	public static void main(String[] args) {
		System.out.println("--- A5 & A6: Objekte mit unterschiedlichen Konstruktoren erstellen und ausgeben ---");
		Person p1 = new Person("Hans", "Meyer", 1979, "28815");
		Person p2 = new Person("Anna", "Schmidt");

		System.out.println("Person 1: " + p1);
		System.out.println("Person 2: " + p2);

		System.out.println("\n--- A7: Test der equals() Methode ---");
		Person p3 = new Person("Hans", "Meyer", 1979, "28815");
		System.out.println("p1 und p2 sind gleich? " + p1.equals(p2));
		System.out.println("p1 und p3 sind gleich? " + p1.equals(p3));
		System.out.println("Vergleich mit == (p1 == p3)? " + (p1 == p3));

		System.out.println("\n--- A8: Test der statischen Methode getMustermann ---");
		Person mustermann = Person.getMustermann();
		System.out.println("Mustermann: " + mustermann);

		System.out.println("\n--- A9: Test des Builder-Patterns ---");
		Person p4 = new PersonBuilder().vorname("John").nachname("Doe").geburtsjahr(1987).postleitzahl("90210").build();
		System.out.println("Mit Builder erstellte Person: " + p4);
	}
}

