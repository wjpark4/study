package exercise;


class Exercise7_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer_719 b = new Buyer_719();
		b.buy(new Tv_719());
		b.buy(new Computer_719());
		b.buy(new Tv_719());
		b.buy(new Audio_719());
		b.buy(new Computer_719());
		b.buy(new Computer_719());
		b.buy(new Computer_719());
		
		b.summary();
	}
}


class Buyer_719{
	int money=1000;
	Product_719[] cart = new Product_719[3];
	int i=0;
	
	
	void buy(Product_719 p){
		if(money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "를 살 수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product_719 p){
		if(i >= cart.length){
			Product_719[] copy = new Product_719[cart.length*2];
			System.arraycopy(cart, 0, copy, 0, cart.length);
			cart = copy;
		}
		cart[i] = p;
		i++;
	}
	
	void summary(){
		String itemList = "";
		int sum=0;
		
		
		for(int x=0; x<i; x++){
			itemList += (x==0) ? "" + cart[x] : ", " + cart[x]; 
			sum += cart[x].price;
		}
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("사용한 금액 : " + sum + "원");
		System.out.println("남은 금액 : " + money);
	}
}


class Product_719{
	int price;
	
	Product_719(int price){
		this.price = price;
	}
}

class Tv_719 extends Product_719{
	Tv_719(){super(100);}
	public String toString(){ return "Tv"; }
}

class Computer_719 extends Product_719{
	Computer_719(){ super(200); }
	public String toString(){ return "Computer"; }
}

class Audio_719 extends Product_719{
	Audio_719(){ super(50); }
	public String toString(){return "Audio";}
}
