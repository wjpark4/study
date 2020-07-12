package exercise;

class Exercise9_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int from = 0;
		int to = 0;
		
		try{
			if(args.length != 2){
				throw new Exception("시작과 끝 단 두개를 입력하세요.");
			}
			
			if(!(from >=2 && from <=9 && to >= 2 && to <= 9))
				throw new Exception("구구단은 2단부터 9단까지입니다.");
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		if(from > to){
			int tmp=from;
			from = to;
			to = tmp;
		}
		
		for(int i=from; i<to; i++){
			for(int j=1; j<=9; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
	}
}
