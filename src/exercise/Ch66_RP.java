package exercise;

class RP_Tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel;}
}

class RPC_Tv extends RP_Tv{
	boolean caption;
	void displayCaption(String text){
		if(caption){
			System.out.println(text);
		}
	}
}

class Ch66_RP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RPC_Tv ctv = new RPC_Tv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}
}
