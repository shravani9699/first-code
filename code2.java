import java.util.Scanner;
class PatternPrinter {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        int num = 1; 
        for (int i = 1; i <= rows; i++) {
        
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   "); 
            }
                                                                                                                                                 for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(num + " ");
                num++;                                                                                                                           }

            System.out.println();                                                                                                            }                                                                                                                                }                                                                                                                                      
    }


