 class Divisible {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 5 in the range 50 to 10:");

        int number = 50;

        while (number >= 10) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
            number--;
        }
    }
}

