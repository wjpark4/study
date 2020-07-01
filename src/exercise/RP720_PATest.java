package exercise;

class RP720_Product{
	int price;
	int bonusPoint;
	
	RP720_Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class RP720_Tv extends RP720_Product{
	RP720_Tv(){
		super(100);
	}
	
	public String toString(){
		return "tv";
	}
}

class RP720_Computer extends RP720_Product{
	RP720_Computer(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class RP720_Audio extends RP720_Product{
	RP720_Audio(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class RP720_Buyer{
	int money = 1000;
	int bonusPoint = 0;
	RP720_Product[] item = new RP720_Product[10];
	int i=0;
	
	void buy(RP720_Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 살 수 없음");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입했음");
	}
	


void summary(){
	int sum = 0;
	String itemList ="";
	
	for(int i=0; i<item.length; i++){
		if(item[i] == null) break;
		sum += item[i].price;
		itemList += item[i] + ", ";
		}
	}
}
class RP720_PATest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP720_Buyer b = new RP720_Buyer();
		RP720_Tv tv = new RP720_Tv();
		RP720_Computer com = new RP720_Computer();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
