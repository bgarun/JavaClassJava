class Dmo1{
	Dmo1(){
		System.out.println("dmo1 constructor");
	}
	static int a=45;
	double b=3.4;
	void test() {
		System.out.println("test method");
	}
	static void run() {
		System.out.println("run method");
	}
}
abstract class Dmo2{
	Dmo2(){
		System.out.println("dmo2 constructor");
	}
	static int a=45;
	double b=3.4;
	void test() {
		System.out.println("test method");
	}
	static void run() {
		System.out.println("run method");
	}
	abstract void disp();
}
public class Day3102 {
	public static void main(String[] args) {
		Dmo1 d1=new Dmo1();
	}

}
