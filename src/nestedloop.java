
public class nestedloop {
	public static void main (String[]args) {
		int num=24;
		for(int i=1;i<=num;i++) {
			int count=2;
			if(num%i==0) {
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						count++;
					}
					if(count==2) {
						System.out.println("prime factors are: "+i);
					}
				}
			}
		}
	}

}
