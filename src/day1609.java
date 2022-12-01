class day1609 {
	public static void main(String[]args) {
		int num=14;
		int d=3;
		int count=0;
		while(num>=d) {
			num=num-d;
			count++;
		}
		System.out.println(count);
	}
}
