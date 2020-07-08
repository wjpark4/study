package exercise;

class RP94_Card{
	String kind;
	int number;
	
	RP94_Card(){
		this("SPADE", 1);
	}
	
	RP94_Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}

class RP_CardToString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP94_Card c1 = new RP94_Card();
		RP94_Card c2 = new RP94_Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
