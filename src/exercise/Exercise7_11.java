package exercise;

class MyTv2E_711{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevchannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel(){
		return channel;
	}
	public void setChannel(int channel){
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		prevchannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume(){
		return volume;
	}
	public void setVolume(int volume){
		if(volume < MIN_VOLUME || volume > MAX_VOLUME)
			return;
		this.volume = volume;
	}
	
	void gotoPrevChannel(){
		setChannel(prevchannel);
	}
}

class Exercise7_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2E_711 t = new MyTv2E_711();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
	}
}
