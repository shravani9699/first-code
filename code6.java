import java.util.Scanner;

class MixedPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
           
            int numCount = (2 * i) - 1;
            for (int k = 1; k <= numCount; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

