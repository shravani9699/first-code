import java.util.Scanner;
class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            System.out.print("a ");  
        }
        System.out.println(); 

                 for (int i = 1; i <= row; i++) {
            System.out.print("$ ");  
        }
        System.out.println(); 
                  for (int i = 0; i < row; i++) {
            System.out.print((char) ('a' + i) + " ");  
        }
        System.out.println();

        sc.close(); 
    }
}

