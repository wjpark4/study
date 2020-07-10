package exercise;

class Exercise9_8 {
	static double round(double d, int n){
		double result = Math.round(d*Math.pow(10, n));
		result = result/Math.pow(10, n);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}
}
