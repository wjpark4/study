package exercise;

class RPInstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RPFireEngine fe = new RPFireEngine();
		//RPFireEngine fe = new RPCar();
		
		if(fe instanceof RPFireEngine){
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof RPCar){
			System.out.println("This is a Car instance");
		}
		
		if(fe instanceof Object){
			System.out.println("This is an Object instance.");
		}
	}
}

class RPCar{}
class RPFireEngine extends RPCar{}