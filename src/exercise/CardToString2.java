package exercise;


class Card96{
	String kind;
	int number;
	
	Card96(){
		this("SPADE", 1);
	}
	
	Card96(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString(){
		return "kind : " + kind + ", number : " + number;
	}
}
class CardToString2 {
	public static void main(String[] args) {
		Card96 c = new Card96("HEART", 10);
		System.out.println(c.toString());
	}
}
