package exercise;

class RP96_Card{
	String kind;
	int number;
	
	RP96_Card(){
		this("SPADE", 1);
	}
	
	RP96_Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString(){
		return "kind : " + kind + ", number : " + number;
	}
}
class RP_CardToString2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP96_Card c = new RP96_Card("HEART", 10);
		System.out.println(c);
	}
}
