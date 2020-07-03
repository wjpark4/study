package exercise;

class SutdaCard7_14{
	final int num;
	final boolean isKwang;
	
	SutdaCard7_14(){
		this(1, true);
	}
	
	SutdaCard7_14(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card = new SutdaCard(1, true);
	}
}
