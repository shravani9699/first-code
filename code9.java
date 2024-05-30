import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character (A-Z) to start the pattern:");
        char startChar = sc.next().charAt(0);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print characters starting from startChar down to current row's character
            for (char ch = startChar; ch >= (char)(startChar - i); ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

