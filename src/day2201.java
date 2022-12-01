class Program2{
	int a;
	Program2(){
		System.out.println("first constructor");
		a=45;
	}
}
class Program03 extends Program2{
	int b;
	Program03(int c){
		//super();
		System.out.println("second constructor");
		b=56;
	}
}
public class day2201 {
	public static void main(String[] args) {
		Program03 p1=new Program03(37);
		
	}

}
//constructor can't be inherited