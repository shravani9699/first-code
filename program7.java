class count {
	public static void main (String[]args){
		int number=93079224;
		int count=0;
		while(number!=0){
			count++;
			number/=10;
		}
		System.out.println(count);
	}
}
