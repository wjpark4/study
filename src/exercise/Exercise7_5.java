package exercise;

class ProductE_75{
	int price;
	int bonusPoint;
	
	ProductE_75(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	ProductE_75(){
		this.price =0;
		this.bonusPoint=0;
	}
}

class TvE_75 extends ProductE_75{
	TvE_75() {}
	
	public String toString(){
		return "Tv";
	}
}

class Exercise7_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvE_75 t = new TvE_75();
		
	}
}
