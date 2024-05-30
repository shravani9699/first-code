class Pattern {
    public static void main(String[] args) {
        int columns = 3;
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}


