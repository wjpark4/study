package exercise;

class Exercise9_12 {
	
	
	static int getRand(int from, int to){
		return (int)(Math.random()*(Math.abs(to-from)+1)) + Math.min(from, to);
		//return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++){
			System.out.print(getRand(1,-3)+", ");
		}
	}
}
