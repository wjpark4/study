package exercise;

class Card94{
	String kind;
	int number;
	
	Card94(){
		this("SPADE", 1);
	}
	
	Card94(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}

class CardToString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card94 c1 = new Card94();
		Card94 c2 = new Card94();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
