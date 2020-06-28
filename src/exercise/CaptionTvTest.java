package exercise;

class Ch71_Tv{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class Ch71_CaptionTv extends Ch71_Tv{
	boolean caption;
	void displayCaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch71_CaptionTv ctv = new Ch71_CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}

}
