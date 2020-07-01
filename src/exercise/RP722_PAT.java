package exercise;

import java.util.*;

class RP722_Tv extends RP720_Product{
	RP722_Tv() { super(100);}
	public String toString() {return "Tv";}
}

class RP722_Computer extends RP720_Product{
	RP722_Computer() { super(200);}
	public String toString() {return "Computer";}
}

class RP722_Audio extends RP720_Product{
	RP722_Audio() { super(50); }
	public String toString() {return "Audio";}
}

class RP722_Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();				// 구입한 제품을 저장하는데 사용될 Vector 객체
	
	void buy(RP720_Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(RP720_Product p){
		if(item.remove(p)){
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary(){
		int sum = 0;
		String itemList ="";
		
		if(item.isEmpty()){
			System.out.println("구입하신 제품이 없다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++){
			RP720_Product p = (RP720_Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
	
}

class RP722_PAT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP722_Buyer b = new RP722_Buyer();
		RP722_Tv tv = new RP722_Tv();
		RP722_Computer com = new RP722_Computer();
		RP722_Audio audio = new RP722_Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();

	}
}
