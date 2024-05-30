class Sum {
    public static void main(String[] args) {
        int start = 150;
        int end = 101;
        int sum = 0;

        while (start >= end) {
            sum += start;
            start--;
        }

        System.out.println("Sum of integers from 150 to 101: " + sum);
    }
}
