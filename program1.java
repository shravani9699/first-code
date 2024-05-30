class evenodd{
	public static void main (String[]args){
		int number=20;
		switch(number%2){
			case 0:
				System.out.println("even");
				break;
			case 1:
			case -1:
				System.out.println("odd");
				break;
		
		default:
			System.out.println("invalid input");
		}
	}
}
