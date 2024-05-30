import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the starting character: ");
        char startChar = sc.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            char currentChar = startChar;
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }

        sc.close();
    }
}

               	       
