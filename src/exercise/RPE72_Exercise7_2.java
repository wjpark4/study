package exercise;

class RPE72_SutdaDeck{
	final int CARD_NUM = 20;
	RPE72_SutdaCard[] cards = new RPE72_SutdaCard[CARD_NUM];
	
	RPE72_SutdaDeck(){
		for(int i=0; i<cards.length; i++){
			int num = i%10 +1;
			boolean isKwang = (i<10) && (i==0 || i==2 || i==7);
			
			cards[i] = new RPE72_SutdaCard(num, isKwang);
		}
	}
	
	void shuffle(){
		for(int i=0; i<cards.length; i++){
			int x = (int)(Math.random()*CARD_NUM);
			int y = (int)(Math.random()*CARD_NUM);
			RPE72_SutdaCard temp = cards[i];
			cards[x] = cards[y];
			cards[y] = temp;
		}
	}
	
	RPE72_SutdaCard pick(int index){
		if(index <0 || index>=20) return null;
		return cards[index];
	}
	
	RPE72_SutdaCard pick(){
		int index = (int)(Math.random()*CARD_NUM);
		//if(index <0 || index>=20) return null;
		return pick(index);
	}
	
}

class RPE72_SutdaCard{
	int num;
	boolean isKwang;
	
	RPE72_SutdaCard(){
		this(1, true);
	}
	
	RPE72_SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}

class RPE72_Exercise7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RPE72_SutdaDeck deck = new RPE72_SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i] + ", ");
		
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
