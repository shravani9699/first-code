class Pattern {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int counter = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("C" + counter + " ");
                counter++;
            }
            System.out.println(); 
        }
    }
}

