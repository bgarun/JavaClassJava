class Youtube{
	void channel() {
		System.out.println("watch videos");
		System.out.println("Subscribe the channel");
	}
}
class Subscribe extends Youtube
{
	void studyIQ() {
		System.out.println("you are subscribed to studyIQ channel");
		System.out.println("you can get updates of studyIQ channel");
	}
}
public class Day2705 {
public static void main(String[]args) {
	Youtube u1=new Youtube();
	u1.channel();
	Subscribe u2=new Subscribe();
	u2.studyIQ();
	u2.channel();
}
}