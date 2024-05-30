 class NumberPattern {
    public static void main(String[] args) {
        int start = 1;
        int columns = 4;
        int rows = 4;

        int num = start;
        int i = 1;

        while (i <= rows) {
            int j = 1;

            while (j <= columns) {
                System.out.print(num + " ");
                num += 2;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}

