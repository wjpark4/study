package exercise;

class Test3_Car{
	String color;
	String gearType;
	int door;
	
	Test3_Car(){
		this("white", "auto", 4);
	}
	
	Test3_Car(Test3_Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Test3_Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3_Car c1 = new Test3_Car();
		Test3_Car c2 = new Test3_Car(c1);
		
		System.out.println("c1의 color = " + c1.color + ", gearType=" + c1.gearType+ ", door=" + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" + c2.gearType+ ", door=" + c2.door);
		
		c1.door=100;
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color = " + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

	}

}
