package exercise;

class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car714 car = null;
		FireEngine714 fe = new FireEngine714();
		FireEngine714 fe2 = null;
		
		fe.water();
		car = fe;
		// car.water();
		fe2 = (FireEngine714)car;
		fe2.water();

	}
}

class Car714{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr~");
	}
	
	void stop(){
		System.out.println("stop!!!");
	}
}

class FireEngine714 extends Car714{
	void water(){
		System.out.println("water!!!");
	}
}