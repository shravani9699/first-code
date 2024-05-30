import java.util.Scanner;

 class PatternPrinter {
    
        

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

            for (int i = 0; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }                                                                                                                                                                                                                                                                                                                                                                                                              for (int j = i; j < rows; j++) {
                System.out.print((char) ('A' + j) + " ");
            }                                                                                                                                                                                                                                                                         System.out.println();
        }                                                                                                                                }                                                                                                                                      
    }


