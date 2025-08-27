package vererbung;


abstract class GeometrischeFigur {
    protected int x;
    protected int y;

  
    public GeometrischeFigur(int x, int y) {
        this.x = x;
        this.y = y;
    }

   
    public void bewegen(int neueX, int neueY) {
        this.x = neueX;
        this.y = neueY;
    }

  
    public String getKoordinaten() {
        return "Koordinaten (x,y): (" + this.x + ", " + this.y + ")";
    }
}


class Rechteck extends GeometrischeFigur {
    private int breite;
    private int hoehe;

  
    public Rechteck(int breite, int hoehe, int x, int y) {
        super(x, y);
        this.breite = breite;
        this.hoehe = hoehe;
    }
    
  
    @Override
    public String toString() {
        return "Rechteck (" + this.breite + "x" + this.hoehe + ") an " + getKoordinaten();
    }
}

class Kreis extends GeometrischeFigur {
    private int radius;

    public Kreis(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Dies ist ein Kreis mit Radius: " + this.radius + ". " + getKoordinaten();
    }
}


public class GeometrieAufgabe {

    public static void main(String[] args) {

        System.out.println("--- Rechteck-Teil ---"); 
        
        Rechteck rechteck = new Rechteck(3, 4, 0, 0);
        
        System.out.println("Anfangszustand: " + rechteck.getKoordinaten());
        rechteck.bewegen(12, -7);
        System.out.println("Rechteck wurde bewegt...");
       
        System.out.println("Neuer Zustand:  " + rechteck.getKoordinaten());
      
        System.out.println("\n--------------------------------\n");
       
        System.out.println("--- Kreis-Teil ---");

        Kreis kreis = new Kreis(4, 0, 0);
        
        System.out.println("Anfangszustand: " + kreis.getKoordinaten());

        kreis.bewegen(33, 1);
        System.out.println("Kreis wurde bewegt...");
        
        System.out.println("Neuer Zustand:  " + kreis.getKoordinaten());

        System.out.println("\n  -Optional Aufgabe-");
     
        System.out.println(kreis);
    }
}