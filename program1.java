 class AsciiRange {

    public static void main(String[] args) {
        int asciiValue = 90;

        while (asciiValue >= 65) {
            System.out.print((char) asciiValue + " ");
            asciiValue--;
        }
    }
}

