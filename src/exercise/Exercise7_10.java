package exercise;


class MyTv2E_710{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
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
}

class Exercise7_10 {
	public static void main(String[] args){
		MyTv2E_710 t = new MyTv2E_710();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
	}
}
