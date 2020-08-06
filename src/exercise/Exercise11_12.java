package exercise;

import java.util.*;

class Exercise11_12 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SutdaDeck_1112 deck = new SutdaDeck_1112();
		
		deck.shuffle();
		Player_1112 p1 = new Player_1112("Ÿ¥", deck.pick(), deck.pick());
		Player_1112 p2 = new Player_1112("���", deck.pick(), deck.pick());
		
		System.out.println(p1 + " " + deck.getPoint(p1));
		System.out.println(p2 + " " + deck.getPoint(p2));
		
	}
}

class SutdaDeck_1112{
	final int CARD_NUM = 20;
	SutdaCard_1112[] cards = new SutdaCard_1112[CARD_NUM];
	
	int pos = 0;
	HashMap jokbo = new HashMap();
	
	SutdaDeck_1112(){
		for(int i=0; i<cards.length; i++){
			int num = i%10 + 1;
			boolean isKwang = i<10 && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard_1112(num, isKwang);
		}
		registerJokbo();
	}
	
	void registerJokbo(){
		jokbo.put("KK", 4000);
		
		jokbo.put("1010", 3100);
		jokbo.put("99", 3090);
		jokbo.put("88", 3080);
		jokbo.put("77", 3070);
		jokbo.put("66", 3060);
		jokbo.put("55", 3050);
		jokbo.put("44", 3040);
		jokbo.put("33", 3030);
		jokbo.put("22", 3020);
		jokbo.put("11", 3010);
		
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("104", 2020);
		jokbo.put("410", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}
	
	int getPoint(Player_1112 p){
		if(p==null) return 0;
		
		SutdaCard_1112 c1 = p.c1;
		SutdaCard_1112 c2 = p.c2;
		
		Integer result = 0;
		
		if(c1.isKwang && c2.isKwang){
			result = (Integer)jokbo.get("KK");
		}else{
			result = (Integer)jokbo.get(""+c1.num+c2.num);
			
			if(result==null){
				result = new Integer((c1.num + c2.num) % 10 + 1000);
			}
		}
		
		p.point = result.intValue();
		
		return result.intValue();
	}
	
	SutdaCard_1112 pick() throws Exception{
		SutdaCard_1112 c = null;
		
		if(0 <= pos && pos < CARD_NUM){
			c = cards[pos];
			cards[pos++] = null;
		}else{
			throw new Exception("�����ִ� ī�尡 �����ϴ�.");
		}
		
		return c;
	}
	
	void shuffle(){
		for(int x=0; x<CARD_NUM * 2; x++){
			int i= (int)(Math.random() * CARD_NUM);
			int j = (int)(Math.random() * CARD_NUM);
			
			SutdaCard_1112 tmp = cards[i];
			
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
}// SutdaDeck_1112



class Player_1112{
	String name;
	SutdaCard_1112 c1;
	SutdaCard_1112 c2;
	
	int point;
	
	Player_1112(String name, SutdaCard_1112 c1, SutdaCard_1112 c2){
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public String toString(){
		return "["+name+"]"+c1.toString() +","+c2.toString();
	}
}

class SutdaCard_1112{
	int num;
	boolean isKwang;
	
	SutdaCard_1112(){
		this(1, true);
	}
	
	SutdaCard_1112(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}