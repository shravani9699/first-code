import java.util.Scanner;

 class Composite {
    public static boolean isComposite(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        if (isComposite(num)) {
            System.out.println(num + " is a composite number.");
        } else {
            System.out.println(num + " is not a composite number.");
        }

        scanner.close();
    }
}

