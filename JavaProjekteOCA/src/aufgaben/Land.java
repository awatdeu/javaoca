package aufgaben;

class Lande {
	
	
    String name;
    Long einwohnerzahl;

    public Lande(String name, Long einwohnerzahl) {
        this.name = name;
        this.einwohnerzahl = einwohnerzahl;
    }

    public void print() {
        System.out.println("Land" + this.name);
        System.out.println("Einwohnerzahl: " + this.einwohnerzahl + " Menschen");
        System.out.println("--------------------");
    }



    public static void main(String[] args) {
        Lande brasilien = new Lande("Brasilien", 211000000L);
        Lande deutschland = new Lande("Deutschland", 83000000L);

        brasilien.print();
        deutschland.print();
    }
}