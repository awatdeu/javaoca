package arrays;

public class Aufgabe2DArray {
	public static void main(String[] args) {
        
        System.out.println("--- A1 & A2: Erzeuge und gib ein 4x5 Array aus ---");
        int[][] arr = createArray(4, 5);
        printArray(arr);

        System.out.println("--- A3: Ändere den Wert an der Stelle (1,1) auf 5 ---");
        arr[1][1] = 5;
        printArray(arr);

        System.out.println("--- A4: Fülle das gesamte Array mit dem Wert 2 ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 2;
            }
        }
        printArray(arr);
        
        System.out.println("--- A5: Erzeuge ein 4x5 Array mit dem Initialwert 7 ---");
        int[][] arr2 = createArray(4, 5, 100);
        printArray(arr2);

        System.out.println("--- A7: Erzeuge ein 5x5 Array mit einem 'X'-Rand ---");
        char[][] bordered = createBorderedArray(5, 'X');
        printCharArray(bordered);
        
        System.out.println("--- A7 Test 2: Erzeuge ein 7x7 Array mit einem '*'-Rand ---");
        char[][] bordered2 = createBorderedArray(7, '*');
        printCharArray(bordered2);
    }

  
    public static int[][] createArray(int rows, int cols) {
        return new int[rows][cols];
    }

   
    public static int[][] createArray(int rows, int cols, int initialValue) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = initialValue;
            }
        }
        return arr;
    }

   
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println(); 
    }

    public static char[][] createBorderedArray(int dim, char ch) {
        char[][] borderedArray = new char[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
           
                if (i == 0 || i == dim - 1 || j == 0 || j == dim - 1) {
                    borderedArray[i][j] = ch;
                } else {
                    borderedArray[i][j] = ' '; 
                }
            }
        }
        return borderedArray;
    }

    public static void printCharArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}