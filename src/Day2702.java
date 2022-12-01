class Invoice{
	String signature;
	String product;
	String customer;
	int invoiceno;
	int amount;
	Invoice(){
		signature="Manager";
	}
	Invoice(String product, String customer, int invoiceno, int amount){
		this();
		this.product=product;
		this.customer=customer;
		this.invoiceno=invoiceno;
		this.amount=amount;
	}
}
public class Day2702 {
	public static void main(String[]args) {
		Invoice p1=new Invoice("computer","Dell computers", 1002,25000);
		System.out.println(p1.signature);
		System.out.println(p1.product);
		System.out.println(p1.customer);
		System.out.println(p1.invoiceno);
		System.out.println(p1.amount);
}
}