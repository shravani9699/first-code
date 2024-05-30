import java.util.Scanner;
 class PatternExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");

        // Read the input integer from the user
        int number = scanner.nextInt();

        // Print the pattern
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) { // If i is odd
                System.out.println(i);
            } else { // If i is even
                System.out.print((char) (i + 64) + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

