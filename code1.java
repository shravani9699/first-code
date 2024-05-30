import java.util.Scanner;
class pattern{
	public static void main (String[]args){
		System.out.print("Enter a number of row plz:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i= 1;i<=row;i++){
			for(int j=i;j<=row;j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

