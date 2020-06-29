package exercise;

class PointTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D78 p3 = new Point3D78();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);

	}

}


class Point78{
	int x=10;
	int y=20;
	
	Point78(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D78 extends Point78{
	int z=30;
	
	Point3D78(){
		this(100,200,300);
	}
	
	Point3D78(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}