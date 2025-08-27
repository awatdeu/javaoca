package lambdas;

import java.util.function.Predicate;
import java.util.Arrays;

public class TippAnwendung {

    public static void main(String[] args) {

        JavaTipp[] tipps = {
            new JavaTipp("Mit dem Schluesselwort 'implements' kann eine Klasse ein Interface realisieren.", "Vererbung", "Klassen", "Interfaces"),
            new JavaTipp("Eine Klasse kann nur eine andere Klasse erweitern.", "Vererbung", "Klassen"),
            new JavaTipp("Statische Methoden werden mit dem Klassennamen aufgerufen.", "Klassen", "Methoden", "static"),
            new JavaTipp("Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.", "Klassen", "Konstruktoren", "Attribute"),
            new JavaTipp("Beim Ueberschreiben darf die Sichtbarkeit nicht verschaerft werden.", "Klassen", "Methoden", "Ueberschreiben"),
            new JavaTipp("Alle Elemente in einem Interface sind immer 'public'", "Interfaces", "Sichtbarkeiten", "Java 8")
        };
        
        System.out.println("--- A3: Alle vorhandenen Java-Tipps ---");
      
        sucheTipps(tipps, tipp -> true);

        System.out.println("--- A4: Tipps, die den Unterstring 'Klasse' haben ---");
    
        sucheTipps(tipps, tipp -> tipp.getText().contains("Klasse"));

        System.out.println("--- A5: Tipps, die genau zwei Themen haben ---");
        sucheTipps(tipps, tipp -> tipp.getThemen().length == 2);

        System.out.println("--- A6: Tipps, die das Thema 'Klassen' haben ---");

        sucheTipps(tipps, tipp -> Arrays.asList(tipp.getThemen()).contains("Klassen"));

        System.out.println("---  A7: Tipps mit Thema 'Klassen' aber ohne 'Vererbung' ---");

        sucheTipps(tipps, tipp -> {
            boolean hatKlassen = Arrays.asList(tipp.getThemen()).contains("Klassen");
            boolean hatVererbung = Arrays.asList(tipp.getThemen()).contains("Vererbung");
            return hatKlassen && !hatVererbung;
        });

        // A8: Zwei weitere Beispiele zur Demonstration
        System.out.println("--- A8.1: Beispiel 1 -  Tipps zum Thema 'Interfaces'  ---");
        sucheTipps(tipps, tipp -> Arrays.asList(tipp.getThemen()).contains("Interfaces"));

        System.out.println("--- A8.2: Beispiel 2 - Tipps , deren Text mehr als 60 Zeichen lang ist  ---");
        sucheTipps(tipps, tipp -> tipp.getText().length() > 60);
    }

 
    public static void sucheTipps(JavaTipp[] alleTipps, Predicate<JavaTipp> bedingung) {
        for (JavaTipp aktuellerTipp : alleTipps) {
         
            if (bedingung.test(aktuellerTipp)) {
                System.out.print(aktuellerTipp);
            }
        }
        System.out.println("--------------------------------");
    }
}