class Samp{
	static int a=500;
	int b=500;
}
public class day2102 {
	public static void main (String[]args) {
		Samp d1=new Samp();//classname reference varialbe=new classname();
		System.out.println(Samp.a);
		Samp.a=555;
		System.out.println(Samp.a);
		System.out.println(d1.b);
		d1.b=555;
		System.out.println(d1.b);
	}

}
