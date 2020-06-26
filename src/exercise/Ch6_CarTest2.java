package exercise;

class Ch62_Car{
	String color;
	String gearType;
	int door;
	
	Ch62_Car(){
		this("white", "auto", 4);
	}
	
	Ch62_Car(String color){
		this(color, "auto", 4);
	}
	
	Ch62_Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}


class Ch6_CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch62_Car c1 = new Ch62_Car();
		Ch62_Car c2 = new Ch62_Car("blue");
		
		System.out.println("c1ÀÇ color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2ÀÇ color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

	}

}
