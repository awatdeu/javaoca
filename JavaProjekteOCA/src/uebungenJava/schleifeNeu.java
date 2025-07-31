package uebungenJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class schleifeNeu {

	public static void main(String[] args) throws IOException {

		{
			Integer sum = 0;
			int max = 2;
			for (int i = 0; i < max; i++) {

				System.out.println("Fügen Sie eine Nummer zwischen 1 und 5 ein: ");
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				Integer number = Integer.parseInt(bufferedReader.readLine());
				sum += number;

				switch (number) {

				case 1:
					System.out.println("Eins");
					break;
				case 2:
					System.out.println("Zwei");
					break;
				case 3:
					System.out.println("Drei");
					break;
				case 4:
					System.out.println("Vier");
					break;
				case 5:
					System.out.println("Fünf");
					break;
				default:
					System.out.println(number);
				}
			}
			System.out.println("Sum=" + sum);
		}
	}
}