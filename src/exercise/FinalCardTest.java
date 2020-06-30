package exercise;

class Card711{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card711(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card711(){
		this("HEART", 1);
	}
	
	public String toString(){
		return KIND + " " + NUMBER;
	}
}
public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card711 c = new Card711("HEART", 10);
		//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}
