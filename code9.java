import java.util.Scanner;
 class PatternPrinter {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

       for (int i = 1; i <= rows; i++) {
            

            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); }

            
            if (i % 2 == 0) {
                
                for (int j = 1; j <= i * 2 - 1; j++) {
                    char letter = (char) ('a' + Math.abs(i - j));
                    System.out.print(letter + " ");
                }
            } else {
                
                for (int j = 1; j <= i * 2 - 1; j++) {
                    char letter = (char) ('A' + Math.abs(i - j));
                    System.out.print(letter + " ");
                }
            }

            System.out.println();
        }
    }}

