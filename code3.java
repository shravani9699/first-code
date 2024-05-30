import java.util.Scanner;
class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting character: ");
        char startChar = scanner.next().charAt(0);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 0; i < rows; i++) {
            char currentChar = startChar;
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar--; 
            }
            System.out.println();
        }
        
        scanner.close();
    }
}


