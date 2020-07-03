package exercise;

class SutdaDeck_E72{
	final int CARD_NUM = 20;
	SutdaCard_E72[] cards = new SutdaCard_E72[CARD_NUM];
	
	SutdaDeck_E72(){
		for(int i=0; i<CARD_NUM; i++){
			int num = i%10 +1;
			boolean isKwang = (i<10) && (i==0 || i==2 || i==7);
			cards[i] = new SutdaCard_E72(num, isKwang);
			
		}
	}
	
	void shuffle(){
		for(int i=0; i<cards.length; i++){
			int x = (int)(Math.random()*CARD_NUM);
			int y = (int)(Math.random()*CARD_NUM);
			SutdaCard_E72 temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
			
		}
	}
	
	SutdaCard_E72 pick(int index){
		if(index<0 || index>=20) return null;
		return cards[index];
	}
	
	SutdaCard_E72 pick(){
		int num = (int)(Math.random()*20);
		return pick(num);
	}
}

class SutdaCard_E72{
	int num;
	boolean isKwang;
	
	SutdaCard_E72(){
		this(1, true);
	}
	
	SutdaCard_E72(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck_E72 deck = new SutdaDeck_E72();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++){
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

	}
}
