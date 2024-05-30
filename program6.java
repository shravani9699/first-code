class pattern{
	public static  void main(String[]args){
		int row =3;
		int coloumn=4;
		
		for(int i=1;i<=row;i++){
			for (int j=1;j<=coloumn;j++){
				  System.out.print(j + "" + (char)('A' + j - 1) + " ");
				
				
			}
			System.out.println();
		}
	}
}
