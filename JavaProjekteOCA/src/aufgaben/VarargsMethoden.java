package aufgaben;

public class VarargsMethoden {

    public static void main(String[] args) {
        // Test für A1: produkt
        System.out.println("--- Test für produkt ---");
        System.out.println("Produkt von 2, 3, 4: " + produkt(2, 3, 4));
        System.out.println("Produkt ohne Argumente: " + produkt());

        System.out.println();

        // Test für A2: concat
        System.out.println("--- Test für concat (ohne Trennzeichen) ---");
        System.out.println(concat("Moin", " ", "Deutschland", "!"));
        System.out.println(concat("Java", " ist", " super"));

        System.out.println();

        // Test für A3: concatWithDelimiter
        System.out.println("--- Test für concat (mit Trennzeichen) ---");
        System.out.println(concatWithDelimiter(", ", "mo", "di", "mi"));
        System.out.println(concatWithDelimiter(" - ", "Apfel", "Banane", "Kirsche"));
    }

   
    public static int produkt(int... zahlen) {
        if (zahlen.length == 0) {
            return 0;
        }
        int ergebnis = 1;
        for (int zahl : zahlen) {
            ergebnis *= zahl;
        }
        return ergebnis;
    }

    public static String concat(String... woerter) {
        StringBuilder sb = new StringBuilder();
        for (String wort : woerter) {
            sb.append(wort);
        }
        return sb.toString();
    }

    public static String concatWithDelimiter(String delimiter, String... woerter) {
        if (woerter.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < woerter.length; i++) {
            sb.append(woerter[i]);
            if (i < woerter.length - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }
}