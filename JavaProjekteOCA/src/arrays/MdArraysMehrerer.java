package arrays;

class Auto {
    int baujahr;

    Auto(int bjh) {
        baujahr = bjh;
    }

    public String toString() {
        return "A (" + baujahr + ")";
    }
}

public class MdArraysMehrerer {
    public static void main(String[] args) {

        Auto[] arr = new Auto[2];
        //arr[1] = new Auto(2023);
        //arr[1] = new Auto(39);

        Auto a;
        a = new Auto(2000);
        arr[0] = a;
        a = new Auto(2222);

        a = arr[0];

        System.out.println(arr[0]);
    }
}