class OddDigits {
    public static void main(String[] args) {
        int number = 216985;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 1) {
                System.out.println("Odd Digit: " + digit);
                count++;
            }

            
            number /= 10;
        }

        System.out.println("Count of odd digits: " + count);
    }
}

