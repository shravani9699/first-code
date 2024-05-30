import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter the first number: ");
        int number = sc.nextInt();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                System.out.println(number);
            } else {
                System.out.println(ch);
            }
        }
        sc.close();
    }
}

