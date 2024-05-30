import java.util.Scanner;

class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            char currentChar = 'D';
            for (int j = rows; j >= i; j--) {
                System.out.print(currentChar + " ");
                currentChar--;
            }
            System.out.println();
        }

        sc.close();
    }
}

