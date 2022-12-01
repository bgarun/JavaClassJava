class TV_manufacturer {
public static void main(String[]args) {
	TV sony=new TV();
	System.out.println("details of sony TV");
	sony.size=45;
	sony.display="amoled";
	sony.colour="silver";
	System.out.println(sony.size);
	System.out.println(sony.display);
	System.out.println(sony.colour);
	TV samsung=new TV();
	System.out.println("details of samsung TV");
	samsung.size=42;
	samsung.display="LED";
	samsung.colour="silverly-black";
	System.out.println(samsung.size);
	System.out.println(samsung.display);
	System.out.println(samsung.colour);
}
}
