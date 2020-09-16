package exercise;

class DoitQ1_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max4(2,5,6,3) = "+ max4(2,5,6,3));
	}
	
	static int max4(int a, int b, int c, int d){
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
}
