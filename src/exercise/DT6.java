package exercise;

class Tv6{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class VCR6{
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play(){ }
	void stop(){ }
	void rew(){ }
	void ff(){ }
}

class DT6 extends Tv6 {
		VCR6 vcr = new VCR6();
		int counter = vcr.counter;
	
	
	void play(){
		vcr.play();
	}
	
	void stop(){
		vcr.stop();
	}
	
	void rew(){
		vcr.rew();
	}
	
	void ff(){
		vcr.ff();
	}
}



