package exercise;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }	
}

public class TvTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
	}
}
