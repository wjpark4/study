package exercise;

class Doit1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		System.out.println("max3(3,1,2) = " + max3(3,1,2));
	}
	
	static int max3(int a, int b, int c){
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		return max;
	}
}

