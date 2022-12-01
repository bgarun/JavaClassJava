
public class For2 {
	public static void main(String[] args) {
		int i;
		int n=25;
		int Count=2;
		for(i=2;i<=(n/25);i++) {
			if (n%i==0) {
				Count++;
			}
			System.out.println(i);
		}
	}
}
