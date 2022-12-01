class Student{
	float attendence=92.3f;
	int ratings=5;
}
public class day2103 {
public static void main(String[]args) {
	Student ram=new Student();
	Student jhon=new Student();
	ram.ratings=2;
	jhon.attendence=95.5f;
	System.out.println(ram.attendence);
	System.out.println(jhon.attendence);
	System.out.println(ram.ratings);
	System.out.println(jhon.ratings);
}
}
