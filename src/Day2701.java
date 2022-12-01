class Currencynote{
	String signature;
	String color;
	int serialno;
	int value;
	Currencynote(){
		signature="das";
	}
	Currencynote(String color, int serialno, int value){
		this();
		this.color=color;
		this.serialno=serialno;
		this.value=value;
	}
}
public class Day2701 {
	public static void main(String[]args) {
		Currencynote c1=new Currencynote("pink",123,2000);
		System.out.println(c1.signature);
		System.out.println(c1.color);
		
		
	}

}
