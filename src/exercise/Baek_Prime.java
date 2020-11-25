package exercise;

public class Baek_Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(2));
		System.out.println(prime2(2));
		System.out.println(prime3(2));
		System.out.println(prime4(100));

	}
	
	static boolean prime(int n){
		if(n < 2)
			return false;
		for(int i=2; i<n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	static boolean prime2(int n){
		if(n < 2)
			return false;
		for(int i=2; i<=n/2; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	static boolean prime3(int n){
		if(n < 2)
			return false;
		for(int i=2; i*i<=n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	static int prime4(int n){
		int[] prime = new int[n];
		int pn = 0;
		boolean[] check = new boolean[n+1];
		
		for(int i=2; i<=n; i++){
			if(check[i] == false){
				prime[pn++] = i;
				for(int j=i+i; j<=n; j+=i){
					check[j] = true;
				}
			}
		}
		return pn;
	}
}
