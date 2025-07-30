package aufgaben;


//# Aufgabe 'Klassen - einfach'
//
//##### A1
//- Simulieren Sie Objekte vom Typ `Land`. 
//- Jedes Land hat einen Namen und die Einwohnerzahl.
//- Erzeugen Sie das Land 'Brasilien' mit 211 Mio. Einwohner
//- Erzeugen Sie das Land 'Deutschland' mit 83 Mio. Einwohner
//- Entwickeln Sie eine Methode `print`, die die Landinfos auf der Konsole präsentiert.


class Land {
	
	
    String name;
    Long einwohnerzahl;

    public Land(String name, Long einwohnerzahl) {
        this.name = name;
        this.einwohnerzahl = einwohnerzahl;
    }

    public void print() {
        System.out.println("Land " + this.name);
        System.out.println("Einwohnerzahl: " + this.einwohnerzahl + " Menschen");
        System.out.println("--------------------");
    }



    public static void main(String[] args) {
        Land brasilien = new Land("Brasilien ", 211000000L);
        Land deutschland = new Land("Deutschland", 83000000L);
        Land iran= new Land ("Iran", 90000000L);

        brasilien.print();
        deutschland.print();
        iran.print();
    }
}