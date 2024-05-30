class pattern {
	public static void main (String[]args){
		int row=3;
		int coloumn=3;
		int number=1;
		for (int i=1;i<=row;i++){
			for (int j=1 ;j<=coloumn; j++){
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}
