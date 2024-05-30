 class range {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 4 and 7 in the range 50 to 100:");

        int number = 50;

        while (number <= 100) {
            if (number % 4 == 0 && number % 7 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}


