import java .util.Scanner;
class  Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) { 
                    System.out.print("9");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();  
        }
    }
}

