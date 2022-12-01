class Healthcare{
	void details() {
		System.out.println("Add your details");
		System.out.println("list of best doctors in your city");
	}
}
class HealthcareV2 extends Healthcare
{
	void doctors() {
		System.out.println("you can search doctors near to you");
		System.out.println("contact the doctor");
		System.out.println("book the appointment immediately");
	}
}
public class Day2704 {
public static void main(String[]args) {
	Healthcare u1=new Healthcare();
	u1.details();
	HealthcareV2 u2=new HealthcareV2();
	u2.details();
	u2.doctors();
	
}
}