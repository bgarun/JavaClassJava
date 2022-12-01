
class Pay{
	static void online() {
		System.out.println("online payment by g pay");
	}
	void online(int pin) {
		System.out.println("online payment by card");
	}
	void online(long phno, int otp) {
		System.out.println("payment by phone");
	}
}




public class MethodOverloading {
public static void main(String[] args) {
	Pay.online();
	Pay p=new Pay();
	p.online(232);
	p.online(23653456235l, 5645);
}
}
