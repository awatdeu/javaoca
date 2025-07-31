package inheritance;

import java.util.Random;




 abstract class Figur {
	int x;
	int y;

	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void bewegen(int neueX, int neueY) {
		this.x = neueX;
		this.y = neueY;
	}

	public abstract double getFlaeche();
}

// -------------------------------------------
 
 
class Rechteck extends Figur {
	double breite;
	double hoehe;

	public Rechteck(int x, int y, double breite, double hoehe) {
		super(x, y);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public double getFlaeche() {
		return breite * hoehe;
	}

	@Override
	public String toString() {
		return "Rechteck(x=" + x + ", y=" + y + ", breite=" + breite + ", hoehe=" + hoehe + ")";
	}
}

//--------------------------------------------





class Kreis extends Figur {
	double radius;

	public Kreis(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double getFlaeche() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Kreis(x=" + x + ", y=" + y + ", radius=" + radius + ")";
	}
}


//----------------------------------------------



public class aufgabePolymorphieGeometrie {

	public static void main(String[] args) {

		Figur[] figuren = new Figur[100];
		Random zufall = new Random();

		for (int i = 0; i < figuren.length; i++) {
			int x = zufall.nextInt(100);
			int y = zufall.nextInt(100);

			if (zufall.nextBoolean()) {

				double breite = zufall.nextDouble() * 10 + 1;
				double hoehe = zufall.nextDouble() * 10 + 1;
				figuren[i] = new Rechteck(x, y, breite, hoehe);
			} else {

				double radius = zufall.nextDouble() * 10 + 1;
				figuren[i] = new Kreis(x, y, radius);
			}
		}

		berechneUndDruckeGesamtflaeche(figuren);
	}
//---------------------------------------------
	
	
	
	public static void berechneUndDruckeGesamtflaeche(Figur[] figurenArray) {
		System.out.println("--- Berechnung der Flächen aller Figuren ---");
		double gesamtflaeche = 0;

		for (Figur aktuelleFigur : figurenArray) {
			double flaeche = aktuelleFigur.getFlaeche();
			System.out.printf("Figur: %-55s -> Fläche: %.2f%n", aktuelleFigur, flaeche);
			gesamtflaeche += flaeche;
		}

		System.out.println("----------------------------------------------");
		System.out.printf("Die Gesamtfläche aller 100 Figuren beträgt: %.2f%n", gesamtflaeche);
	}
}
