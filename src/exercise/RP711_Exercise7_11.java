package exercise;

class RP711_MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel(){
		return channel;
	}
	
	public void setChannel(int channel){
		prev = this.channel;
		this.channel = channel;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
	void gotoPrevChannel(){
		setChannel(prev);
	}
	
}

class RP711_Exercise7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP711_MyTv2 t = new RP711_MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
