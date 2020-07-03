package exercise;


class RPE71_SutdaDeck{
	final int CARD_NUM = 20;
	RPE71_SutdaCard[] cards = new RPE71_SutdaCard[CARD_NUM];
	
	RPE71_SutdaDeck(){
		for(int i=0; i<cards.length; i++){
			int num = i%10 +1;
			boolean isKwang = (i<10) && (i==0 || i==2 || i==7);
			
			cards[i] = new RPE71_SutdaCard(num, isKwang);
		}
	}
	
}

class RPE71_SutdaCard{
	int num;
	boolean isKwang;
	
	RPE71_SutdaCard(){
		this(1, true);
	}
	
	RPE71_SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}

class RPExercise7_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RPE71_SutdaDeck deck = new RPE71_SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");

	}
}
