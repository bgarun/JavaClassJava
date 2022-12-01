
public class Reverse {
	public static void main (String[]args)
	{
		int n=1221;
		int original=n;
		int reverse=0;
		while (n!=0) {
			int rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
			}
		System.out.println("The reverse of "+original+" is "+reverse);
		if(original==reverse) {
		System.out.println("The number "+original+" is Pallendrome.");
		}
		else {
			System.out.println("The number "+original+" is not a Pallendrome.");
		}
		}
		}
