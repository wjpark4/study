package exercise;

class Exercise9_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard_91 c1 = new SutdaCard_91(3, true);
		SutdaCard_91 c2 = new SutdaCard_91(3, true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
	}
}

class SutdaCard_91{
	int num;
	boolean isKwang;
	
	SutdaCard_91(){
		this(1, true);
	}
	
	SutdaCard_91(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof SutdaCard_91){
			SutdaCard_91 c = (SutdaCard_91)obj;
			return c.num==num && c.isKwang==isKwang;
		}
		return false;
	}
	
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}