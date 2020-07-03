package exercise;


abstract class RP722_Shape{
	RP722_Point p;
	
	RP722_Shape(){
		this(new RP722_Point(0,0));
	}
	
	RP722_Shape(RP722_Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	RP722_Point getPosition(){
		return p;
	}
	
	void setPosition(RP722_Point p){
		this.p = p;
	}
}

class RP722_Point{
	int x;
	int y;
	
	RP722_Point(){
		this(0, 0);
	}
	
	RP722_Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return "["+x+", "+y+"] ";
	}
}

class RP722_Circle extends RP722_Shape{
	double r;
	RP722_Circle(RP722_Point p, double r){
		super(p);
		this.r = r;
	}
	RP722_Circle(double r){
		this(new RP722_Point(0,0), r);
	}
	
	public double calcArea(){
		return r*r*Math.PI;
	}
}

class RP722_Rectangle extends RP722_Shape{
	double width;
	double height;
	
	RP722_Rectangle(double width, double height){
		this(new RP722_Point(0,0), width, height);
	}
	
	RP722_Rectangle(RP722_Point p, double width, double height){
		super(p);
		this.width=width;
		this.height=height;
	}
	
	public double calcArea(){
		return width*height;
	}
	
	boolean isSquare(){
		return (width*height!=0) && (width==height);
	}
	
}


class RP722_Exercise7_22 {
	
	static double sumArea(RP722_Shape[] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RP722_Shape[] arr= {new RP722_Circle(5.0), new RP722_Rectangle(3,4), new RP722_Circle(1)};
		System.out.println("면적의 합 : " + sumArea(arr));

	}
}
