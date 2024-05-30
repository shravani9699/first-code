import java.util.Scanner;
 class Factorial {
    public static long factorial(int number) {
        long output = 1;
        for (int i = 1; i <= number; i++) {
            output *= i;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long fact = factorial(num);
        System.out.println("The factorial of " + num + " is " + fact);

        scanner.close();
    }
}

