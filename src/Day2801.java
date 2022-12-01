class Student1
{
	String name="arun";
	void details() {
		
	System.out.println("Student details");
	}
}
class College extends Student1
{
	String collegename="UBDT";
	void admission(){
		System.out.println("Admission of student");
	}
}
class Stream extends College
{
	void mechanical() {
		System.out.println("mechanical branch");
	}
}
public class Day2801 {
public static void main(String [] args) {
	Stream s1=new Stream();
	s1.mechanical();
	s1.admission();
	System.out.println(s1.collegename);
	s1.details();
	System.out.println(s1.name);
}
}
