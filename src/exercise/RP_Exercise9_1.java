package exercise;

class RP_Exercise9_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCardRP_91 c1 = new SutdaCardRP_91(3, true);
		SutdaCardRP_91 c2 = new SutdaCardRP_91(3, true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2) : " + c1.equals(c2));

	}
}

class SutdaCardRP_91{
	int num;
	boolean isKwang;
	
	SutdaCardRP_91(){
		this(1, true);
	}
	
	SutdaCardRP_91(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof SutdaCardRP_91){
			SutdaCardRP_91 s = (SutdaCardRP_91)obj;
			return s.num==num && s.isKwang==isKwang;
		}
		return false;
		
	}
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}