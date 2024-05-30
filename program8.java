class Sum {
    public static void main(String[] args) {
        int start = 90;
        int end = 11;
        int sum = 0;

        while (start >= end) {
            sum += start;
            start--;
        }

        System.out.println("Sum of integers from 90 to 11: " + sum);
    }
}


