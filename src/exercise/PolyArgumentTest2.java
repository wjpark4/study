package exercise;

class Product721{
	int price;
	int bonusPoint;
	
	Product721(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product721(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv721 extends Product721{
	Tv721(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer721 extends Product721{
	Computer721(){
		super(200);
	}
	public String toString(){
		return "Computer";
	}
}

class Audio721 extends Product721{
	Audio721(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer721{
	int money = 1000;
	int bonusPoint = 0;
	Product721[] item = new Product721[10];
	int i=0;
	
	void buy(Product721 p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하였습니다.");
	}
	
	void summary(){
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++){
			if(item[i] == null) break;
			sum += item[i].price;
			//itemList += item[i] + ", ";
			itemList += (i==0) ? ""+item[i] :  ", " + item[i];
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}


class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer721 b = new Buyer721();
		Tv721 tv = new Tv721();
		Computer721 com = new Computer721();
		Audio721 audio = new Audio721();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();

	}

}
