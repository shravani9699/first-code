 class Letter {
    public static void main(String[] args) {
        char currentChar = 'A'; 
        int number = 1;

        while (number <= 6) {
            if (currentChar == 'A' || currentChar == 'B' || currentChar == 'C' ||
                currentChar == 'D' || currentChar == 'E' || currentChar == 'F') {
                System.out.println(currentChar);
            }

            currentChar++; 
            number++;
        }
    }
}

