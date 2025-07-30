package Aufgabe_Schiff_Hafen_Main;

public class Schiff {
    private String name;

    public Schiff(String name) {
        this.name = name;
    }

    public Schiff() {
        this.name = "Unbenanntes Schiff"; 
    }

    @Override
    public String toString() {
        return this.name;
    }
}