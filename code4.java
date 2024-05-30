import java.util.Scanner;
class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting character: ");
        char startChar = scanner.nextLine().charAt(0);

        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            char currentChar = startChar;
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(Character.toUpperCase(currentChar) + " ");
                } else {
                    System.out.print(Character.toLowerCase(currentChar) + " ");
                }
                currentChar--;
            }
            System.out.println();
        }

        scanner.close(); 
    }
}

