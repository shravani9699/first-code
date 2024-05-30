import java.util.Scanner;

 class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    System.out.print((j + 1) + " ");
                } else if (i == 1) {
                 
                    if (j == 0) {
                        System.out.print((j + 1) + " ");
                    } else {
                        System.out.print((char) ('a' + j - 1) + " ");
                    }
                } else {
                    
                    System.out.print("3 ");
                }
            }
            System.out.println(); 
        }

        sc.close(); 
    }
}


