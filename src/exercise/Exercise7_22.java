package exercise;

abstract class Shape_E722{
	Point_E722 p;
	
	Shape_E722(){
		this(new Point_E722(0,0));
	}
	
	Shape_E722(Point_E722 p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point_E722 getPosition(){
		return p;
	}
	
	void setPosition(Point_E722 p){
		this.p = p;
	}
}

class Circle_E722 extends Shape_E722 {
	double r;
	
	Circle_E722(double r){
		this(new Point_E722(0,0), r);
	}
	
	Circle_E722(Point_E722 p, double r){
		super(p);
		this.r = r;
		
	}
	public double calcArea(){
		return Math.PI * r * r;
	}
}

class Rectangle_E722 extends Shape_E722{
	double width;
	double height;
	
	Rectangle_E722(double width, double height){
		this(new Point_E722(0,0), width, height);
	}
	
	Rectangle_E722(Point_E722 p , double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare(){
		return width*height !=0 && width==height;
	}
	
	public double calcArea(){
		return width * height;
	}
}


class Point_E722{
	int x;
	int y;
	
	Point_E722(){
		this(0, 0);
	}
	
	Point_E722(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "[" + x + ", " + y + "] ";
	}
}

class Exercise7_22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


