package exercise;

final class Singleton713{
	private static Singleton713 s = new Singleton713();
	
	private Singleton713(){
		//...
	}
	
	public static Singleton713 getInstance(){
		if(s==null){
			s = new Singleton713();
		}
		return s;
	}
}

class SingletonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton713 s = new Singleton713();
		Singleton713 s1 = Singleton713.getInstance();
	}

}
