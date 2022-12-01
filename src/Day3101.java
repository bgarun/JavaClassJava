abstract class Account{
	abstract void adhaar();
	abstract void pancard();
	abstract void ekyc();
}
abstract class Step1 extends Account{
	void adhaar() {
		System.out.println("Adhaar card is provided");
	}
}
abstract class Step2 extends Step1{
	void pancard() {
		System.out.println("PAN card is provided");
	}
}
class Step3 extends Step2{
	void ekyc() {
		System.out.println("Ekyc is done");
	}
}
class Day3101 {
	public static void main(String[]args) {
		Step3 s1=new Step3();
		s1.adhaar();
		s1.pancard();
		s1.ekyc();
	}

}
