import java.util.Scanner;
class pattern{
        public static void main (String[]args){
                System.out.print("Enter a number of row plz:");
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
		int number=sc.nextInt();
		int count=row;

                for(int i= 0;i<=row;i++){
                        for(int j=0;j<=count-i;j++){
                                System.out.print(number + " ");
				number=number+2;
                        }
                        System.out.println();
                }
                sc.close();
        }
}

