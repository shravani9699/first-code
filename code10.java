import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting character (A-Z) to begin the pattern:");
        char startChar = sc.next().charAt(0);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        sc.close();
        
        int startAscii = (int) startChar; 

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            
            for (int j = startAscii + i; j <= startAscii + rows - i - 1; j++) {
                if (Character.isAlphabetic(j)) {
                    System.out.print((char)j + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

