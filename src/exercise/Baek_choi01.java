package exercise;

public class Baek_choi01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=1;
		int a = 8, b = 12;
		for(int i=2; i<=min(a, b); i++){
			if(a%i == 0 && b%i == 0)
				g=i;
		}
	}
	
	static int min(int a, int b){
		if(a <= b)
			return a;
		return b;
	}
	
	static int gcd(int a, int b){
		int r = a % b;
		if(r==0) return b;
		return gcd(b, r);
	}
	
	static int gcd2(int a, int b){
		while(b != 0){
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
