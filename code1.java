import java.util.Scanner;

 class PatternPrinter {
    public static void printPattern(int rows) {
        int number = 1;

        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); 
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number += 2; 
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        printPattern(rows);
    }
}

