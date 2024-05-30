import java.util.Scanner;
class SimplePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for input
        System.out.println("Enter the starting number:");
        int start = sc.nextInt();

        System.out.println("Enter the decrement value:");
        int decrement = sc.nextInt();

        int current = start;
        int row = 1;

        while (current > 0) {
            for (int j = 0; j < row; j++) {
                if (current > 0) {
                    System.out.print(current + " ");
                    current -= decrement;
                } else {
                    break;
                }
            }
            System.out.println();
            row++;
        }

        sc.close();
    }
}

