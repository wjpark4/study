package exercise;

class RPIT7 {
	public static void main(String[] args) {
		CarRP car = null;
		FireEngineRP fe = new FireEngineRP();
		FireEngineRP fe2 = null;
		
		fe.water();
		car = fe;
		//car.water();
		fe2 = (FireEngineRP)car;
		fe2.water();
	}
}

class CarRP{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr~");
	}
	
	void stop(){
		System.out.println("stop!!!");
	}
}

class FireEngineRP extends CarRP{
	void water(){
		System.out.println("water!!!");
	}
}