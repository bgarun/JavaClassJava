class NSE{
	void indices() {
		System.out.println("National stock exchange");
	}
}
class Nifty50 extends NSE
{
	void index01() {
		System.out.println("50 most liquid and top listed companies in NSE");
	}
	}
class Banknifty extends NSE {
	void index02(){
		System.out.println("12 most liquid banks listed in NSE");
	}
}
class Day2803 {
	public static void main(String[]args) {
		Nifty50 n1=new Nifty50();
		n1.index01();
		n1.indices();
		Banknifty n2=new Banknifty();
		n2.index02();
		n2.indices();
	}

}
