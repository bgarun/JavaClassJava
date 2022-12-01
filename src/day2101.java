class sample11{
	static int a=500;
	int b=500;
}
public class day2101 {
	public static void main (String[]args) {
		System.out.println(sample11.a);
		sample11.a=555;
		System.out.println(sample11.a);
		System.out.println(new sample11().b);
		new sample11().b=555;
		System.out.println(new sample11().b);
	}

}
