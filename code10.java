
import java.util.Scanner;

 class PatternPrinter {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

             for (int i = rows; i >= 1; i--) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            
            for (int j = i; j < rows; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            
            for (int j = rows; j >= i; j--) {
                System.out.print((char) ('A' + j - 1) + " ");
            }

            System.out.println();
        }
    }

 }


