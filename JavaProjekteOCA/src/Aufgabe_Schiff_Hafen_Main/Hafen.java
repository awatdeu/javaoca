package Aufgabe_Schiff_Hafen_Main;

public class Hafen {
	private Schiff[] plaetze;
	private int anzahlSchiffe;

	public Hafen() {
		this.plaetze = new Schiff[100];
		this.anzahlSchiffe = 0;
	}

	public void addSchiff(Schiff neuesSchiff) {

		if (anzahlSchiffe < plaetze.length) {

			this.plaetze[anzahlSchiffe] = neuesSchiff;

			this.anzahlSchiffe++;
		} else {
			System.out.println("Der Hafen ist voll! Ein neues Schiff kann nicht aufgenommen werden.");
		}
	}

	@Override
	public String toString() {
		int freiePlaetze = this.plaetze.length - this.anzahlSchiffe;
		return "Hafen (Schiffe: " + this.anzahlSchiffe + ". Freie Plätze: " + freiePlaetze + ")";
	}
}