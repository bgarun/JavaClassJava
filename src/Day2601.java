class Demo11{
	int a=45;
	Demo11(int a){
		System.out.println("Constructor");
		this.a=a;
	}
}
public class Day2601 {
public static void main(String[]args) {
	Demo11 d1=new Demo11(55);
System.out.println(d1.a);
}
}