package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayEinfach {

    public static void main(String[] args) {
        // --- A1 & A2 ---
        System.out.println("--- A1 & A2: Zufalls-Array erstellen und ausgeben ---");
        int[] arr = createArray(2, 15, 30);
        printArray(arr);
        System.out.println("\n");

        // --- A3 ---
        System.out.println("--- A3: Deutsche Umlaute ---");
        char[] umlaute = deutscheUmlaute();
        System.out.println(Arrays.toString(umlaute));
        System.out.println("\n");

        // --- A4 ---
        System.out.println("--- A4: Alle deutschen Kleinbuchstaben ---");
        char[] buchstaben = deutscheBuchstaben();
        System.out.println(Arrays.toString(buchstaben));
        System.out.println("\n");

        // --- A5 ---
        System.out.println("--- A5: Array mit Math.PI und Math.E ---");
        double[] konstanten = { Math.PI, Math.E };
        System.out.println(Arrays.toString(konstanten));
        System.out.println("\n");

        // --- A6 ---
        System.out.println("--- A6: Zwei Arrays addieren ---");
        int[] a1_add = { 1, 2, 3 };
        int[] a2_add = { 12, 13, 14 };
        int[] a3_add = add(a1_add, a2_add);
        System.out.println("Array 1(a1): " + Arrays.toString(a1_add));
        System.out.println("Array 2(a2): " + Arrays.toString(a2_add));
        System.out.println("Add (a3): " + Arrays.toString(a3_add));
        System.out.println("\n");
        
        // --- A7 ---
        System.out.println("--- A7: Zwei Arrays verbinden ---");
        int[] a1_join = { 1, 2, 3 };
        int[] a2_join = { 12, 13, 14 };
        int[] a3_join = join(a1_join, a2_join);
        System.out.println("Array 1 (a1): " + Arrays.toString(a1_join));
        System.out.println("Array 2 (a2): " + Arrays.toString(a2_join));
        System.out.println("Join (a3): " + Arrays.toString(a3_join)); 
        System.out.println("\n");
    }


    public static int[] createArray(int min, int max, int laenge) {
        int[] array = new int[laenge];
        Random random = new Random();
        for (int i = 0; i < laenge; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    
    public static char[] deutscheUmlaute() {
        return new char[]{'ä', 'ö', 'ü'};
    }

    public static char[] deutscheBuchstaben() {
        return new char[] {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'ä', 'ö', 'ü', 'ß'
        };
    }

    public static int[] add(int[] a1, int[] a2) {
        int[] result = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i] + a2[i];
        }
        return result;
    }

    public static int[] join(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        return result;
    }
}