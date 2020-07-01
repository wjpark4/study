package exercise;

class Product720{
	int price;
	int bonusPoint;
	
	Product720(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv720 extends Product720{
	Tv720(){
		super(100);
	}
	public String toString(){
		return "Tv";
	}
}

class Computer720 extends Product720{
	Computer720(){
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Buyer720{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product720 p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer720 b = new Buyer720();
		Tv720 tv = new Tv720();
		Computer720 com = new Computer720();
		
		b.buy(tv);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
