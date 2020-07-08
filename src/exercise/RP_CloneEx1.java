package exercise;

class RP97_Point implements Cloneable{
	int x;
	int y;
	RP97_Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x="+x +", y="+y;
	}
	
	public Object clone(){
		Object obj=null;
		try{
			obj=super.clone();
		}catch(CloneNotSupportedException e){}
		return obj;
	}
}

class RP_CloneEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP97_Point original = new RP97_Point(3, 5);
		RP97_Point copy = (RP97_Point) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}
}
