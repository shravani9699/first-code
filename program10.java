class DigitSum {
    public static void main(String[] args) {
        long number = 88307922405L; 
        long sum = 0;

        while (number > 0) {
            long digit = number % 10;
            sum += digit;
            number /= 10;
            System.out.println("Current digit: " + digit + ", Updated sum: " + sum);
        }

        System.out.println("Sum of digits: " + sum);
    }
}


