import java.util.Scanner;
class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter the starting character:");
        char start = sc.next().charAt(0);

        System.out.println("Enter the number of rows:");
        int numRows = sc.nextInt();

        char current = start;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numRows - row; col++) {
                System.out.print(current + " ");
                current--;
            }
            System.out.println();
        }

        sc.close();
    }
}


