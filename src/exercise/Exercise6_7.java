package exercise;

class Ch6_MyPoint{
	int x;
	int y;
	
	Ch6_MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y){
		double result = Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
		return result;
	}
}
class Exercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch6_MyPoint p = new Ch6_MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
	}

}
