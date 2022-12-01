class Design
{
	String project="decorum";
	void hld() {
	System.out.println("Design> HLD and LLD");
}
}
class Coding extends Design
{
	void program() {
		System.out.println("coding as per design");
	}
}
class Testing extends Coding
{
	void test() {
		System.out.println("Testing of software");
	}
}
public class Day2802 {
	public static void main(String[]args) {
		Testing t=new Testing();
		System.out.println(t.project);
		t.hld();
		t.program();
		t.test();
	}

}
