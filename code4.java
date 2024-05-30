import java.util.Scanner;

 class ReverseNumber {

    
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversedNum = reverseNumber(num);
        System.out.println("The reverse of " + num + " is " + reversedNum);

        scanner.close();
    }
}

