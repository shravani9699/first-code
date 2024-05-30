 class CharacterSequence {
    public static void main(String[] args) {
        int start = 1;
        int end = 6;

        for (int num = start; num <= end; num++) {
            if (num % 2 != 0) {
                char currentChar = (char) ('A' + num - 1);
                System.out.print(currentChar + " ");
            } else {
                System.out.print(num + " ");
            }
        }
    }
}


