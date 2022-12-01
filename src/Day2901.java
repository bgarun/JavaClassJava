class Demo01{
	Demo01(int a, String s)
	{
		System.out.println("Demo1 constructor");
		System.out.println("a="+a);
		System.out.println("s="+s);
	}
}
class Demo2 extends Demo01
{
	Demo2(float f, boolean b){
		super(45,"java");
		System.out.println("Demo2 constructor");
		System.out.println("f="+f);
		System.out.println("b="+b);
	}
}
class Demo3 extends Demo2 {
	Demo3(){
		super(6.2f, true);
		System.out.println("Demo3 constructor");
	}
}
class Day2901 {
public static void main(String[]args) {
	Demo3 d1=new Demo3();
	

}
}
