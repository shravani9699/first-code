import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   "); // Three spaces for alignment
            }
            // Print characters
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

