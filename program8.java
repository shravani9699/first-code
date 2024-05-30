 class Number {
    public static void main(String[] args) {
        int num = 15; 

        if (num >= 0) {
            switch (num % 2) {
                case 0:
                    System.out.println("Even");
                    break;
                case 1:
                case -1:
                    System.out.println("Odd");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } else {
            System.out.println("Sorry, negative numbers not allowed");
        }
    }
}

