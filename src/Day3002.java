class Onlineclass{
	void platform(long number) 
	{
		System.out.println("login through phone num ");
	}
	void platform(String mailID) {
		System.out.println("login by mailID");
	}
}
class Day3002 {
public static void main(String[]args) {
	Onlineclass c1=new Onlineclass();
	c1.platform(9564821354l);
	c1.platform("google@gmail.com");
}
}
