class day2301 {
double d=23.14d;
int b=56;
static int s=48;
void compile(){
	System.out.println("compiling....");
}
public static void main(String[]args) {
	String k="non static";
	day2301 R=new day2301();
	System.out.println(R.d);
	System.out.println(R.b);
	System.out.println(s);
	R.compile();
	System.out.println(k);
	
}

}
