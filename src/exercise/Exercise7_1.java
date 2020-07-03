package exercise;

class SutdaDeck_E71{
	final int CARD_NUM = 20;
	SutdaCard_E71[] cards = new SutdaCard_E71[CARD_NUM];
	
	SutdaDeck_E71(){
		for(int i=0; i<CARD_NUM; i++){
			int num = i%10 +1;
			boolean isKwang = (i<10) && (i==0 || i==2 || i==7);
			cards[i] = new SutdaCard_E71(num, isKwang);
			
		}
	}
}

class SutdaCard_E71{
	int num;
	boolean isKwang;
	
	SutdaCard_E71(){
		this(1, true);
	}
	
	SutdaCard_E71(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}


class Exercise7_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck_E71 deck = new SutdaDeck_E71();
		
		for(int i=0; i<deck.cards.length; i++){
			System.out.print(deck.cards[i] + ",");
		}
	}
}
