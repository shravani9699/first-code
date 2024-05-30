import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char startchar = sc.next().charAt(0); 
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        
        for (int i = 0; i < row; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(num++ + " ");
                } else {
                    System.out.print((char) ('A' + j) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

