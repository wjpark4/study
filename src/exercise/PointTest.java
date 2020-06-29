package exercise;

class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D77 p3 = new Point3D77(1,2,3);

	}
}

class Point77{
	int x;
	int y;
	
	Point77(){
		
	}
	
	Point77(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation(){
		return "x : "+ x+ ", y : "+y;
	}
}


class Point3D77 extends Point77{
	int z;
	Point3D77(int x, int y, int z){
		//super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation(){
		return "x :"+x+", y : "+y + ", z:"+z;
	}
}


