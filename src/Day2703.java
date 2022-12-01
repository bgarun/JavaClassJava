class User{
	long phone=965482314l;
	void stream() {
		System.out.println("You can stream free for a month");
	}
}
class PremiumUser extends User
{
	void explore() {
		System.out.println("you can stream unlimitted");
		System.out.println("Enjoy the latest shows and movies");
	}
}
public class Day2703 {
public static void main(String[]args) {
	User u1=new User();
	System.out.println(u1.phone);
	u1.stream();
	PremiumUser u2=new PremiumUser();
	System.out.println(u2.phone);
	u2.stream();
	u2.explore();
	
}
}
