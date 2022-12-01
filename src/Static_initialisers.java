class Static_initialisers {
	static int a=10;
	static {
	int a=5;
	for(int i=1;i<=a;i++) {
		System.out.println("hi");
	}
	}
public static void main(String[]args) {
	System.out.println(a);
}
}
