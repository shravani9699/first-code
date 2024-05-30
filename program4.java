class Letter {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(ch + " ");
                ch += 2; 
            }
            System.out.println(); 
        }
    }
}

