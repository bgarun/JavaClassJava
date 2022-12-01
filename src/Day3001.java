class Payment{
	static void online(long number) 
	{
		System.out.println("payment through phone num ");
	}
	void online(String UPI) {
		System.out.println("payment by UPI");
	}
}
class Day3001 {
public static void main(String[]args) {
	Payment p1=new Payment();
	Payment.online(23546874l);
	p1.online("bgar@oksbi");
}
}
