package arrays;

import java.util.Arrays;
import java.util.Random;

public class AufgabeArrays {

	public static void main(String[] args) {
		/*
		 * A1, A2
		 */
		System.out.println("*** A1, A2");
		
		int[] arr = createArray(2, 15, 10);
		printArray(arr);
		
		/*
		 * A3
		 */
		System.out.println("\n*** A3");
		char[] arrUmlaute = deutscheUmlaute();
		String textUmlaute = Arrays.toString(arrUmlaute);
		System.out.println(textUmlaute);

		/*
		 * A4
		 */
		System.out.println("\n*** A4");
		char[] arrBuchstaben = deutscheBuchstaben();
		String buchstaben = Arrays.toString(arrBuchstaben);
		System.out.println(buchstaben);
		
		/*
		 * A5
		 */
		System.out.println("\n*** A5");
		double[] mathArr = { Math.PI, Math.E };
		System.out.println(Arrays.toString(mathArr));
		
		/*
		 * A6
		 */
		System.out.println("\n*** A6. Test 1");
		
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 12, 13, 14 };
		int[] a3 = add(a1, a2); // a3 bekommt folgende Werte: 13, 15, 17 
		printArrays(a1, a2, a3); // [13, 15, 17]
		
		System.out.println("\n*** A6. Test 2");
		a3 = add(null, a2);
		printArrays(null, a2, a3); // [12, 13, 14]
		
		System.out.println("\n*** A6. Test 3");
		a3 = add(a1, null);
		printArrays(a1, null, a3); // [1, 2, 3]
		
		System.out.println("\n*** A6. Test 4");
		int[] a4 = { 1, 2, 3, 4 }; 
		a3 = add(a4, a2); // das erste Array ist länger
		printArrays(a4, a2, a3); // [13, 15, 17, 4]
		
		System.out.println("\n*** A6. Test 5");
		a3 = add(a1, a4); // das zweite Array ist länger
		printArrays(a1, a4, a3); // [2, 4, 6, 4]
		
		/*
		 * A7
		 */
		a1 = new int[] { 1, 2, 3 };
		a2 = new int[] { 12, 13, 14 };
		
		System.out.println("\n*** A7. Test 1");

		a3 = join(a1, a2); // a3 bekommt folgende Werte: 1, 2, 3, 12, 13, 14
		printArrays(a1, a2, a3);
		
	} // end of main
	
	static int[] join(int[] a1, int[] a2) {
		if (a1==null) {
			return Arrays.copyOf(a2, a2.length);
		}
		if (a2==null) {
			return Arrays.copyOf(a1, a1.length);
		}
		
		// a1 = { 1, 2, 3 }
		// a2 = { 12, 13, 14 }
		//               0  1  2  3  4  5
		// arrResult = [ 0, 0, 0, 0, 0, 0]
		int[] arrResult = new int[a1.length + a2.length];
		
		// Daten aus a1 am Anfang vom arrResult
		//               0  1  2  3  4  5
		// arrResult = [ 1, 2, 3, 0, 0, 0]
		for (int i=0; i<a1.length; i++) {
			arrResult[i] = a1[i];
		}
		
		// Daten aus a2 am Ende vom arrResult
		//               0  1  2  3    4   5
		// arrResult = [ 1, 2, 3, 12, 13, 14]
		
		// i = 0
		// a1.length + i = 3
		//
		// i = 1
		// a1.length + i = 4 
		//
		// i = 2
		// a1.length + i = 5 
		for (int i=0; i<a2.length; i++) {
			arrResult[a1.length + i] = a2[i];
		}
		
		return arrResult;
	}
	
	static int[] add(int[] a1, int[] a2) {
		if (a1==null) {
			return Arrays.copyOf(a2, a2.length); 
		}
		if (a2==null) {
			return Arrays.copyOf(a1, a1.length); 
		}
		
		// längeres Array finden (a1 wird das längere Array sein)
		if (a1.length < a2.length) {
			int[] tmp = a2;
			a2 = a1;
			a1 = tmp;
		}
		
		// eine Kopie vom längeren Array a1 erzeugen
		int[] arrResult = new int[a1.length];
		
		for (int i=0; i<arrResult.length; i++) {
			arrResult[i] = a1[i];
		}
		
		// Danach Summen mit Daten aus dem kleineren Array berechnen
		for (int i=0; i<a2.length; i++) {
			 arrResult[i] = arrResult[i] + a2[i];
		}
		
		return arrResult;
	}
	
	
	static void printArrays(int[] a1, int[] a2, int[] a3) {
		System.out.println("a1: " + Arrays.toString(a1));
		System.out.println("a2: " + Arrays.toString(a2));
		System.out.println("a3: " + Arrays.toString(a3));
	}
	
	
	
	static char[] deutscheBuchstaben() {
		int len = 'z' - 'a' + 1 // Anzahl englischer Buchstaben
				   + 4 // drei Umlaute und ß
				;
		
		char[] arr = new char[len]; 
		
		for (char ch='a'; ch<='z'; ch++) {
			int i = ch - 'a';
			arr[i] = ch;
		}
		
		// besondere Buchstaben am Ende
		int i = arr.length - 4;
		arr[i++] = 'ä';
		arr[i++] = 'ö';
		arr[i++] = 'ü';
		arr[i++] = 'ß';
		
		return arr;
	}
	
	static char[] deutscheUmlaute() {
		/*
		 * auch korrekt:
		 */
//		char[] arr = { 'ä', 'ö', 'ü' };
//		return arr;
		
		return new char[] { 'ä', 'ö', 'ü' };
	}

	static int[] createArray(int min, int max, int length) {
		int[] arr = new int[length];
		
		Random rnd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(min, max+1);
		}
		
		return arr;
	}
	
	static void printArray(int[] arr) {
		if (arr==null) {
			System.out.println("null");
			return;
		}
		
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if (i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
	}
	
	
}
