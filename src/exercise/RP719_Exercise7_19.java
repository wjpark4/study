package exercise;

class RP719_Exercise7_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP719_Buyer b = new RP719_Buyer();
		b.buy(new RP719_Tv());
		b.buy(new RP719_Computer());
		b.buy(new RP719_Tv());
		b.buy(new RP719_Audio());
		b.buy(new RP719_Computer());
		b.buy(new RP719_Computer());
		b.buy(new RP719_Computer());
		
		b.summary();
		
	}
}

class RP719_Buyer{
	int money = 1000;
	RP719_Product[] cart = new RP719_Product[3];
	int i = 0;
	
	void buy(RP719_Product p){
		if(money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "를 살 수 없습니다.");
			return ;
			}
		money -= p.price;
		add(p);
	}
	
	void add(RP719_Product p){
		if(i >= cart.length){
			RP719_Product[] temp = new RP719_Product[cart.length*2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;
		}
		cart[i] = p;
		i++;
	}
	
	void summary(){
		String itemList="";
		int sum=0;
		for(int i=0; i<cart.length; i++){
			if(cart[i]==null) break;
			itemList = i==0 ? itemList + cart[i] : itemList + ", " + cart[i];
			sum += cart[i].price;
			//money = cart[i].price;
			
		}
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	}
}

class RP719_Product{
	int price;
	
	RP719_Product(int price){
		this.price = price;
	}
	
}

class RP719_Tv extends RP719_Product{
	RP719_Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class RP719_Computer extends RP719_Product{
	RP719_Computer() { super(200); }
	public String toString(){ return "Computer";}
}

class RP719_Audio extends RP719_Product{
	RP719_Audio() { super(50); }
	public String toString(){ return "Audio";}
}