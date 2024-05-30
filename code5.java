import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;w
        System.out.print("Enter the starting character: ");
        char startChar = scanner.nextLine().charAt(0);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(startChar + count) + " ");
                count++;
            }
            System.out.println();
        }

        scanner.close(); 
    }
}

