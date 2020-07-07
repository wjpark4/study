package exercise;


class Point97 implements Cloneable{
	int x;
	int y;
	Point97(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x=" + x +", y=" +y;
	}
	
	public Object clone(){
		Object obj=null;
		try{
			obj = super.clone();
		} catch(CloneNotSupportedException e){}
		return obj;
	}
}

class CloneEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point97 original = new Point97(3, 5);
		Point97 copy = (Point97) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}
}
