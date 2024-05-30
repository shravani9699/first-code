import java.util.Scanner;

 class Pattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
	 int squareStart = 3; 
	 int consecutiveStart = 6; 

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); 
            }                                                                                                                        
            if (i == 2) {
                
                for (int j = 1; j <= i + 2; j++) {
                    System.out.print(consecutiveStart + " ");
                    consecutiveStart++;
                }
            } else {
                
                for (int j = 1; j <= i + 2; j++) {
                    System.out.print((squareStart * squareStart) + " ");
                    squareStart++;                                                                                                                   }
            }                                                                                                                                                                                                                                                                         System.out.println();                                                                                                            }                                                                                                                                }                                                                                                                                                           
} 


