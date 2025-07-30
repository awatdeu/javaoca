package Aufgabe_Schiff_Hafen_Main;

public class Main {
	public static void main(String[] args) {
		Hafen hamburgerHafen = new Hafen();

		for (int i = 0; i < 12; i++) {
			Schiff neuesSchiff = new Schiff("Schiff Nr. " + (i + 1));
			hamburgerHafen.addSchiff(neuesSchiff);
		}

		System.out.println(hamburgerHafen);

		Schiff testSchiff = new Schiff("Titanic");
		System.out.println(testSchiff);
	}
}
