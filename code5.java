import java.util.Scanner;
 class CharPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter the starting letter (uppercase): ");
        char startLetter = scanner.next().charAt(0);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        char upper = startLetter;
        char lower = (char) (startLetter + 32); 

        for (int row = 0; row < numRows; row++) {
            
            for (int i = 0; i < numRows - row; i++) {
                System.out.print(upper + " ");
            }

            
            for (int j = 0; j <= row; j++) {
                System.out.print(lower + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}

