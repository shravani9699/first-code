import java.util.Scanner;

class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int currentAscii = 65;
            for (int j = 1; j <= rows - i + 1; j++) {
                if (j == 1) {
                    System.out.print(currentAscii + " ");
                } else {
                    currentAscii += 2;
                    System.out.print((char) currentAscii + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

