
public class Leapyear {
	public static void main (String[]args)
	{
		int Year=2020;
		if(Year%4==0 && Year%100!=0 || Year%400==0) {
			System.out.println(Year+" is a leap year");
		}
		else {
			System.out.println(Year+" is not a leap year");
		}
		}
}
