package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Kampfarena {

    public static void main(String[] args) {
        List<Kämpfer> kaempferListe = new ArrayList<>();
        kaempferListe.add(new Kämpfer("Mark"));
        kaempferListe.add(new Kämpfer("Leon"));
        kaempferListe.add(new Kämpfer("Tomas"));
        kaempferListe.add(new Kämpfer("Peter"));
        kaempferListe.add(new Kämpfer("Andreas"));
        kaempferListe.add(new Kämpfer("Alex"));
        kaempferListe.add(new Kämpfer("Martin"));
        kaempferListe.add(new Kämpfer("Matthias"));

        System.out.println("Willkommen in der Kampfarena! Die Kämpfer sind:");
        for(Kämpfer k : kaempferListe) {
            System.out.println("- " + k.getName());
        }
        System.out.println("============================================\n");

        int rundenNummer = 1;

        while (kaempferListe.size() > 1) {
            System.out.println("--- Runde " + rundenNummer + " ---");
            System.out.println("Verbleibende Kämpfer: " + kaempferListe.size());

            Collections.shuffle(kaempferListe);

            List<Kämpfer> gewinnerListe = new ArrayList<>();

            for (int i = 0; i < kaempferListe.size(); i += 2) {
                if (i + 1 >= kaempferListe.size()) {
                    Kämpfer letzterKämpfer = kaempferListe.get(i);
                    gewinnerListe.add(letzterKämpfer);
                    System.out.println("\n" + letzterKämpfer.getName() + " hat keinen Gegner und wartet auf die nächste Runde.");
                    continue;
                }
                
                Kämpfer kaempfer1 = kaempferListe.get(i);
                Kämpfer kaempfer2 = kaempferListe.get(i + 1);

                System.out.println("\n" + kaempfer1.getName() + " kämpft gegen " + kaempfer2.getName() + "!");

                while (true) {
                    System.out.println(kaempfer1.getName() + " schlägt...");
                    if (kaempfer1.schlagen()) {
                        System.out.println("KO-Schlag! " + kaempfer1.getName() + " hat gewonnen!");
                        gewinnerListe.add(kaempfer1); 
                        break;
                    }

                    System.out.println(kaempfer2.getName() + " schlägt...");
                    if (kaempfer2.schlagen()) {
                        System.out.println("KO-Schlag! " + kaempfer2.getName() + " hat gewonnen!");
                        gewinnerListe.add(kaempfer2);
                        break;
                    }
                }
            }

            kaempferListe = gewinnerListe;
            rundenNummer++;
            System.out.println("\n============================================");
        }

        if (!kaempferListe.isEmpty()) {
            System.out.println("\nDas Turnier ist beendet!");
            System.out.println("🏆 Der Champion der Arena ist: " + kaempferListe.get(0).getName());
        } else {
            System.out.println("Es gibt keinen Champion!");
        }
    }
}
class Kämpfer {
	private String name;
	private Random random;

    public Kämpfer(String name) {
        this.name = name;
        this.random = new Random();
    }

    public String getName() {
        return this.name;
    }

    public boolean schlagen() {
        return random.nextDouble() < 0.10;
    }
}