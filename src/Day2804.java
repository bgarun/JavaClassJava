class Krishna{
	void river() {
		System.out.println("River krishna");
	}
}
class Tungabhadra extends Krishna
{
void subriver01() {
	System.out.println("Tungabhadra meets Krishna river at Karnool");
}	
}
class Malaprabha extends Krishna
{
void subriver02() {
	System.out.println("Malaprabha meets krishna river at kudalasangama");
}
}
class Day2804 {
public static void main(String[]args) {
	Tungabhadra t=new Tungabhadra();
	t.river();
	t.subriver01();
	Malaprabha m=new Malaprabha();
	m.river();
	m.subriver02();
}
}
