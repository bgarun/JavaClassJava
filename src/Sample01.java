
public class Sample03 {

		void sample(){
			System.out.println("method 01");

		}
		void sample(int x){
System.out.println("method 02");

		}
		void sample(int r, int d, String name) {
System.out.println("method 03");
		}
	
}
class Sample01{
	public static void main(String[] args) {
		Sample03 d=new Sample03();
		d.sample();
		d.sample(25);
		d.sample(21,25,"arun");
	}
}
