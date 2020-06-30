package exercise;

public class RP75 {
	public static void main(String[] args) {
		Point3DRP75 p3 = new Point3DRP75();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class PointRP75{
	int x=10;
	int y=20;
	
	PointRP75(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3DRP75 extends PointRP75{
	int z=30;
	
	Point3DRP75(){
		this(100, 200, 300);
	}
	
	Point3DRP75(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
}
