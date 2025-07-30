package Vererbung;


 class Figur {
 protected int x;
 protected int y;

 public Figur(int x, int y) {
     this.x = x;
     this.y = y;
 }

 public void bewegen(int newX, int newY) {
     this.x = newX;
     this.y = newY;
 }

 public String getKoordinaten() {
     return "Koordinaten (x,y): (" + this.x + ", " + this.y + ")";
 }
}

class Rechteck extends Figur {
 private int breite;
 private int hoehe;

 public Rechteck(int breite, int hoehe, int x, int y) {
     super(x, y);
     this.breite = breite;
     this.hoehe = hoehe;
 }
}

class Kreis extends Figur {
 private int radius;

 public Kreis(int radius, int x, int y) {
     super(x, y);
     this.radius = radius;
 }

 @Override
 public String toString() {
     return "Dies ist ein Kreis mit Radius " + this.radius + " bei " + getKoordinaten();
 }
}


public class GeometrieTest {
 public static void main(String[] args) {
     System.out.println("--- Rechteck ---");
     Rechteck r1 = new Rechteck(3, 4, 0, 0);
     System.out.println("Anfang: " + r1.getKoordinaten());
     r1.bewegen(12, -7);
     System.out.println("Nach Bewegung: " + r1.getKoordinaten());

     System.out.println("\n--- Kreis ---");
     Kreis k1 = new Kreis(4, 0, 0);
     System.out.println("Anfang: " + k1.getKoordinaten());
     k1.bewegen(33, 1);
     System.out.println("Nach Bewegung: " + k1.getKoordinaten());

     System.out.println("\n--- toString() Test ---");
     System.out.println(k1);
 }
}