class program1{
	static float e=4.5f;
	char ch='a';
	void task() {
		System.out.println("Executing");
	}
	static void run() {
		
		System.out.println("running");
	}
}
public class day2104 {
byte r=45;
void disp() {
	System.out.println("display method");
}
public static void main(String[]args) {
	day2104 a=new day2104();
	System.out.println(a.r);
	a.disp();
	program1.e=4.5f;
	program1 b=new program1();
	System.out.println(b.ch);
	System.out.println(program1.e);
	b.task();
	program1.run();
}
}
