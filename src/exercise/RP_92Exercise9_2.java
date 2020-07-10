package exercise;

class RP_92Exercise9_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP_92Point3D p1 = new RP_92Point3D(1,2,3);
		RP_92Point3D p2 = new RP_92Point3D(1,2,3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));

	}
}

class RP_92Point3D{
	int x,y,z;
	
	RP_92Point3D(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	RP_92Point3D(){
		this(0,0,0);
	}
	
	public boolean equals(Object obj){
		if(obj instanceof RP_92Point3D){
			RP_92Point3D p = (RP_92Point3D)obj;
			return x==p.x && y==p.y && z==p.z;
		}
		return false;
	}
	
	public String toString(){
		return "["+x+","+y+","+z+"]";
	}
}