import java.util.Scanner;

 class Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

