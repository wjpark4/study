package exercise;

class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine716 fe = new FireEngine716();
		
		if(fe instanceof FireEngine716){
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car716){
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object){
			System.out.println("This is an Object instance.");
		}
	}
}

class Car716{}
class FireEngine716 extends Car716{}