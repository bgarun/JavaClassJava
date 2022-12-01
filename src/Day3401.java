class Owner{
	void car() {
		System.out.println("old car");
	}
}
class Buyer extends Owner{
	void car() {
		System.out.println("remodified car");
	}
}
public class Day3401 {
public static void main(String[] args) {
	Buyer b1=new Buyer();
	b1.car();
	Owner o=new Owner();
	o.car();
	
}
}
