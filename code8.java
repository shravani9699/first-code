import java.util.Scanner;

class MixedPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            int startNum = rows - i + 1;
            
            int endNum = startNum + (2 * (i - 1));

           
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }

            
            for (int j = startNum; j <= endNum; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

