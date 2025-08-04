package polymorphie;

public class Test {

    public static void main(String[] args) {
        Hund hund = new Hund("Rex", 5, true);
        Katze katze = new Katze("Tom", 3, true);

        System.out.println("--- Test der laufen-Methode ---");
        hund.laufen();
        katze.laufen();
        hund.laufen();

        System.out.println("\n--- Test der statischen print-Methode (mit Details) ---");
        print(hund);
        print(katze);
    }

    public static void print(Tier tier) {
        String typ = "";
        String details = "";

        if (tier instanceof Hund) {
            typ = "Hund";
        } else if (tier instanceof Katze) {
            typ = "Katze";
        }

        details = typ + ". Name: " + tier.getName() +
                  ", Alter: " + tier.getAlter() +
                  ", Gesund: " + tier.isGesund();

        System.out.println(details);
    }
}

// -------------------------------------------

abstract class Tier {
	private String name;
	private int alter;
	private boolean gesund;

	public Tier(String name, int alter, boolean gesund) {
		this.name = name;
		this.alter = alter;
		this.gesund = gesund;
	}

	public abstract void laufen();

	// Getter und Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public boolean isGesund() {
		return gesund;
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}
}

// -------------------------------------------

class Hund extends Tier {

	public Hund(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	@Override
	public void laufen() {
		System.out.println("Hund " + this.getName() + " läuft");
	}
}

// -------------------------------------------

class Katze extends Tier {

	public Katze(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	@Override
	public void laufen() {
		System.out.println("Katze " + this.getName() + " läuft");
	}
}