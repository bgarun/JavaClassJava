class Sample{
	Sample(boolean res){
		this();
		System.out.println("first constructor");
	}
	Sample(){
		this("Java");
		System.out.println("Second constructor");
	}
	Sample(String str){
		System.out.println("third constructor");
	}
}
public class Day2603 {
	public static void main(String[] args) {
		Sample s1=new Sample(false);
	}
	
}
