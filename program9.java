 class OddEvenDigit {
    public static void main(String[] args) {
        int number = 22780;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                System.out.println("Even digit: " + digit);
            } else {
                System.out.println("Odd digit: " + digit);
            }

            count++;
            number /= 10;
        }

        System.out.println("Total digits: " + count);
    }
}
	


