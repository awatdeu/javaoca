package vererbung;

class JavaKurs {
	private String kursNummer;

	public JavaKurs(String kursNummer) {
		this.kursNummer = kursNummer;
	}

	public String getKursNummer() {
		return this.kursNummer;
	}
}

class Person {
	protected String name;
	protected String id;

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}
}

class Dozent extends Person {
	public Dozent(String name, String id) {
		super(name, id);
	}

	public void leiten(JavaKurs kurs) {
		System.out.println("Dozent " + this.name + " (ID: " + this.id + ") leitet den Kurs: " + kurs.getKursNummer());
	}
}

class Teilnehmer extends Person {
	public Teilnehmer(String name, String id) {
		super(name, id);
	}

	public void teilnehmen(JavaKurs kurs) {
		System.out.println(
				"Teilnehmer " + this.name + " (ID: " + this.id + ") nimmt am Kurs: " + kurs.getKursNummer() + " teil.");
	}
}

public class Kursverwaltung {
	public static void main(String[] args) {
		JavaKurs grundlagenKurs = new JavaKurs("Java-101");

		Dozent dozentSchmidt = new Dozent("Schmidt", "D-007");

		Teilnehmer studentMeier = new Teilnehmer("Meier", "T-123");

		dozentSchmidt.leiten(grundlagenKurs);
		studentMeier.teilnehmen(grundlagenKurs);
	}
}