package exercise;

class DoitQ1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min3(3,2,1) = " + min3(3,-2,1));
	}
	
	static int min3(int a, int b, int c){
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
}
