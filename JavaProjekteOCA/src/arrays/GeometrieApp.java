package arrays;

import java.util.Random;

class Rechteck {
	private int breite;
	private int hoehe;

	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public String toString() {
		return this.breite + " X " + this.hoehe;
	}

	public void aendereDimensionen(int neueBreite, int neueHoehe) {
		this.breite = neueBreite;
		this.hoehe = neueHoehe;
	}

	public static void aendereDimensionen(Rechteck r, int neueBreite, int neueHoehe) {
		r.breite = neueBreite;
		r.hoehe = neueHoehe;
	}
}

class Kreis {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis. R = " + this.radius;
	}
}

public class GeometrieApp {

	public static void main(String[] args) {

		System.out.println("--- 100 Rechtecke mit zufälligen Werten ---");
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int zufaelligeBreite = random.nextInt(20) + 1;
			int zufaelligeHoehe = random.nextInt(20) + 1;

			Rechteck r = new Rechteck(zufaelligeBreite, zufaelligeHoehe);

			System.out.println((i + 1) + ". Rechteck (" + r + ")");
		}

		System.out.println("\n--------------------------------------------\n");

		System.out.println("--- Ein Kreis ---");
		Kreis k1 = new Kreis(5);
		System.out.println(k1);

		System.out.println("\n--------------------------------------------\n");

		System.out.println("--- Test der Methoden zur Dimensionsänderung ---");
		Rechteck testRechteck = new Rechteck(10, 20);
		System.out.println("Anfangszustand: " + testRechteck);

		testRechteck.aendereDimensionen(33, 44);
		System.out.println("Nach nicht-statischer Methode: " + testRechteck);

		Rechteck.aendereDimensionen(testRechteck, 55, 66);
		System.out.println("Nach statischer Methode: " + testRechteck);
	}
}